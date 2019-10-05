package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStrokeRenderingSegment extends js.Object {
  var bezierControlPoint1: Point
  var bezierControlPoint2: Point
  var position: Point
  var pressure: Double
  var tiltX: Double
  var tiltY: Double
  var twist: Double
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
    val __obj = js.Dynamic.literal(bezierControlPoint1 = bezierControlPoint1, bezierControlPoint2 = bezierControlPoint2, position = position, pressure = pressure, tiltX = tiltX, tiltY = tiltY, twist = twist)
  
    __obj.asInstanceOf[IInkStrokeRenderingSegment]
  }
}

