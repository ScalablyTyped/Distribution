package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITappedEventArgs extends StObject {
  
  var pointerDeviceType: PointerDeviceType = js.native
  
  var position: Point = js.native
  
  var tapCount: Double = js.native
}
object ITappedEventArgs {
  
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point, tapCount: Double): ITappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITappedEventArgs]
  }
  
  @scala.inline
  implicit class ITappedEventArgsMutableBuilder[Self <: ITappedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapCount(value: Double): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
  }
}
