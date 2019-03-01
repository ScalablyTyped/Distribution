package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStrokeRenderingSegment extends js.Object {
  var bezierControlPoint1: winrtLib.WindowsNs.FoundationNs.Point
  var bezierControlPoint2: winrtLib.WindowsNs.FoundationNs.Point
  var position: winrtLib.WindowsNs.FoundationNs.Point
  var pressure: scala.Double
  var tiltX: scala.Double
  var tiltY: scala.Double
  var twist: scala.Double
}

object IInkStrokeRenderingSegment {
  @scala.inline
  def apply(
    bezierControlPoint1: winrtLib.WindowsNs.FoundationNs.Point,
    bezierControlPoint2: winrtLib.WindowsNs.FoundationNs.Point,
    position: winrtLib.WindowsNs.FoundationNs.Point,
    pressure: scala.Double,
    tiltX: scala.Double,
    tiltY: scala.Double,
    twist: scala.Double
  ): IInkStrokeRenderingSegment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bezierControlPoint1")(bezierControlPoint1)
    __obj.updateDynamic("bezierControlPoint2")(bezierControlPoint2)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("pressure")(pressure)
    __obj.updateDynamic("tiltX")(tiltX)
    __obj.updateDynamic("tiltY")(tiltY)
    __obj.updateDynamic("twist")(twist)
    __obj.asInstanceOf[IInkStrokeRenderingSegment]
  }
}

