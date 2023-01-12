package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IManipulationStartedEventArgs extends StObject {
  
  var cumulative: ManipulationDelta
  
  var pointerDeviceType: PointerDeviceType
  
  var position: Point
}
object IManipulationStartedEventArgs {
  
  inline def apply(cumulative: ManipulationDelta, pointerDeviceType: PointerDeviceType, position: Point): IManipulationStartedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManipulationStartedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IManipulationStartedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCumulative(value: ManipulationDelta): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
