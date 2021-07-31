package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single segment of a complete ink stroke. */
trait InkStrokeRenderingSegment extends StObject {
  
  /** Gets the first control point for the Bézier curve. */
  var bezierControlPoint1: Point
  
  /** Gets the second control point for the Bézier curve. */
  var bezierControlPoint2: Point
  
  /** Gets the end point of the segment. */
  var position: Point
  
  /** Gets the pressure of the contact on the digitizer surface. */
  var pressure: Double
  
  /** Gets the tilt of the contact along the x axis. */
  var tiltX: Double
  
  /** Gets the tilt of the contact along the y axis. */
  var tiltY: Double
  
  /** Gets the twist of the contact along the rotational axis. */
  var twist: Double
}
object InkStrokeRenderingSegment {
  
  @scala.inline
  def apply(
    bezierControlPoint1: Point,
    bezierControlPoint2: Point,
    position: Point,
    pressure: Double,
    tiltX: Double,
    tiltY: Double,
    twist: Double
  ): InkStrokeRenderingSegment = {
    val __obj = js.Dynamic.literal(bezierControlPoint1 = bezierControlPoint1.asInstanceOf[js.Any], bezierControlPoint2 = bezierControlPoint2.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStrokeRenderingSegment]
  }
  
  @scala.inline
  implicit class InkStrokeRenderingSegmentMutableBuilder[Self <: InkStrokeRenderingSegment] (val x: Self) extends AnyVal {
    
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
