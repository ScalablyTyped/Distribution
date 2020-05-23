package typings.webpack.mod.compilation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourcePosition extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var line: Double
}

object SourcePosition {
  @scala.inline
  def apply(line: Double, column: js.UndefOr[Double] = js.undefined): SourcePosition = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcePosition]
  }
}

