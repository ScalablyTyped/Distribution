package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkStrokeRenderingSegment extends StObject {
  
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
  implicit class IInkStrokeRenderingSegmentMutableBuilder[Self <: IInkStrokeRenderingSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBezierControlPoint1(value: Point): Self = StObject.set(x, "bezierControlPoint1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBezierControlPoint2(value: Point): Self = StObject.set(x, "bezierControlPoint2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
  }
}
