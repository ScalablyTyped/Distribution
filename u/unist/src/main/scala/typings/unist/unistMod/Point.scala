package typings.unist.unistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /**
    * Column in a source file (1-indexed integer).
    */
  var column: Double
  /**
    * Line in a source file (1-indexed integer).
    */
  var line: Double
  /**
    * Character in a source file (0-indexed integer).
    */
  var offset: js.UndefOr[Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(column: Double, line: Double, offset: Int | Double = null): Point = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

