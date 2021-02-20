package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRHitTestSource extends StObject {
  
  def cancel(): Unit = js.native
}
object XRHitTestSource {
  
  @scala.inline
  def apply(cancel: () => Unit): XRHitTestSource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[XRHitTestSource]
  }
  
  @scala.inline
  implicit class XRHitTestSourceMutableBuilder[Self <: XRHitTestSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
