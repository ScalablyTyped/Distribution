package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkStrokeRenderingSegment extends js.Object {
  
  var bezierControlPoint1: Point = js.native
  
  var bezierControlPoint2: Point = js.native
  
  var position: Point = js.native
  
  var pressure: Double = js.native
  
  var tiltX: Double = js.native
  
  var tiltY: Double = js.native
  
  var twist: Double = js.native
}
object IInkStrokeRenderingSegment {
  
  @scala.inline
  def apply(
    bezierControlPoint1: Point,
    bezierControlPoint2: Point,
    position: Point,
    pressure: Double,
    tiltX: Double,
    tiltY: Double,
    twist: Double
  ): IInkStrokeRenderingSegment = {
    val __obj = js.Dynamic.literal(bezierControlPoint1 = bezierControlPoint1.asInstanceOf[js.Any], bezierControlPoint2 = bezierControlPoint2.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkStrokeRenderingSegment]
  }
  
  @scala.inline
  implicit class IInkStrokeRenderingSegmentOps[Self <: IInkStrokeRenderingSegment] (val x: Self) extends AnyVal {
    
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
    def setBezierControlPoint1(value: Point): Self = this.set("bezierControlPoint1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBezierControlPoint2(value: Point): Self = this.set("bezierControlPoint2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressure(value: Double): Self = this.set("pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltX(value: Double): Self = this.set("tiltX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltY(value: Double): Self = this.set("tiltY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwist(value: Double): Self = this.set("twist", value.asInstanceOf[js.Any])
  }
}
