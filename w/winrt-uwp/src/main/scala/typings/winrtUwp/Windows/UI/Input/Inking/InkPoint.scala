package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InkPoint extends StObject {
  
  /** The X, Y coordinates of the InkPoint , in device-independent pixels (DIPs) relative to the upper left-hand corner of the inking area. */
  var position: Point
  
  var pressure: js.Any
}
object InkPoint {
  
  @scala.inline
  def apply(position: Point, pressure: js.Any): InkPoint = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkPoint]
  }
  
  @scala.inline
  implicit class InkPointMutableBuilder[Self <: InkPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressure(value: js.Any): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
  }
}
