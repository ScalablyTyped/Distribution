package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InkPoint extends StObject {
  
  /** The X, Y coordinates of the InkPoint , in device-independent pixels (DIPs) relative to the upper left-hand corner of the inking area. */
  var position: Point
  
  var pressure: Any
}
object InkPoint {
  
  inline def apply(position: Point, pressure: Any): InkPoint = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkPoint]
  }
  
  extension [Self <: InkPoint](x: Self) {
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPressure(value: Any): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
  }
}
