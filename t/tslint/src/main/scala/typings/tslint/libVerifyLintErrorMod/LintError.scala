package typings.tslint.libVerifyLintErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintError extends js.Object {
  var endPos: PositionInFile
  var message: String
  var startPos: PositionInFile
}

object LintError {
  @scala.inline
  def apply(endPos: PositionInFile, message: String, startPos: PositionInFile): LintError = {
    val __obj = js.Dynamic.literal(endPos = endPos, message = message, startPos = startPos)
  
    __obj.asInstanceOf[LintError]
  }
}

