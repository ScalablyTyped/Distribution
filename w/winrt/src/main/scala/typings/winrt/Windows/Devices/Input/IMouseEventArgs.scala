package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseEventArgs extends StObject {
  
  var mouseDelta: MouseDelta = js.native
}
object IMouseEventArgs {
  
  @scala.inline
  def apply(mouseDelta: MouseDelta): IMouseEventArgs = {
    val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventArgs]
  }
  
  @scala.inline
  implicit class IMouseEventArgsMutableBuilder[Self <: IMouseEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMouseDelta(value: MouseDelta): Self = StObject.set(x, "mouseDelta", value.asInstanceOf[js.Any])
  }
}
