package typings.terser

import typings.terser.terserStrings.comment1
import typings.terser.terserStrings.comment2
import typings.terser.terserStrings.comment3
import typings.terser.terserStrings.comment4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCol extends js.Object {
  var col: Double
  var line: Double
  var pos: Double
  var `type`: comment1 | comment2 | comment3 | comment4
  var value: String
}

object AnonCol {
  @scala.inline
  def apply(
    col: Double,
    line: Double,
    pos: Double,
    `type`: comment1 | comment2 | comment3 | comment4,
    value: String
  ): AnonCol = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCol]
  }
}

