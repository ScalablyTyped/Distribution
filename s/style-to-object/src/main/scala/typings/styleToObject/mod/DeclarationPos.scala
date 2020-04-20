package typings.styleToObject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationPos extends js.Object {
  var column: Double
  var line: Double
}

object DeclarationPos {
  @scala.inline
  def apply(column: Double, line: Double): DeclarationPos = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationPos]
  }
}

