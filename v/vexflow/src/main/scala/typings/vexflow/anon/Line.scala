package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var line: Double
  var `type`: String
}

object Line {
  @scala.inline
  def apply(line: Double, `type`: String): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

