package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRTransientInputHitTestSource extends StObject {
  
  def cancel(): Unit
}
object XRTransientInputHitTestSource {
  
  inline def apply(cancel: () => Unit): XRTransientInputHitTestSource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[XRTransientInputHitTestSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRTransientInputHitTestSource] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
