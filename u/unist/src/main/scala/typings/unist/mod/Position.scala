package typings.unist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  /**
    * Place of the first character after the parsed source region.
    */
  var end: Point
  /**
    * Start column at each index (plus start line) in the source region,
    * for elements that span multiple lines.
    */
  var indent: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Place of the first character of the parsed source region.
    */
  var start: Point
}

object Position {
  @scala.inline
  def apply(end: Point, start: Point, indent: js.Array[Double] = null): Position = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

