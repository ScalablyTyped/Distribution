package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLine extends js.Object {
  var line: Double
  var `type`: String
}

object AnonLine {
  @scala.inline
  def apply(line: Double, `type`: String): AnonLine = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLine]
  }
}

