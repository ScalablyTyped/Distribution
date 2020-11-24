package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InkPoint extends js.Object {
  
  /** The X, Y coordinates of the InkPoint , in device-independent pixels (DIPs) relative to the upper left-hand corner of the inking area. */
  var position: Point = js.native
  
  var pressure: js.Any = js.native
}
object InkPoint {
  
  @scala.inline
  def apply(position: Point, pressure: js.Any): InkPoint = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkPoint]
  }
  
  @scala.inline
  implicit class InkPointOps[Self <: InkPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressure(value: js.Any): Self = this.set("pressure", value.asInstanceOf[js.Any])
  }
}
