package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single segment of a complete ink stroke. */
@JSGlobal("Windows.UI.Input.Inking.InkStrokeRenderingSegment")
@js.native
abstract class InkStrokeRenderingSegment () extends js.Object {
  /** Gets the first control point for the Bézier curve. */
  var bezierControlPoint1: Point = js.native
  /** Gets the second control point for the Bézier curve. */
  var bezierControlPoint2: Point = js.native
  /** Gets the end point of the segment. */
  var position: Point = js.native
  /** Gets the pressure of the contact on the digitizer surface. */
  var pressure: Double = js.native
  /** Gets the tilt of the contact along the x axis. */
  var tiltX: Double = js.native
  /** Gets the tilt of the contact along the y axis. */
  var tiltY: Double = js.native
  /** Gets the twist of the contact along the rotational axis. */
  var twist: Double = js.native
}

