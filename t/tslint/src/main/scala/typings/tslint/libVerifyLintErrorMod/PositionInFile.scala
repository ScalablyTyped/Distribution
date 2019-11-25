package typings.tslint.libVerifyLintErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionInFile extends js.Object {
  var col: Double
  var line: Double
}

object PositionInFile {
  @scala.inline
  def apply(col: Double, line: Double): PositionInFile = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PositionInFile]
  }
}

