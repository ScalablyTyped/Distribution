package typings.yaml.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinePos extends js.Object {
  var col: Double
  var line: Double
}

object LinePos {
  @scala.inline
  def apply(col: Double, line: Double): LinePos = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePos]
  }
}

