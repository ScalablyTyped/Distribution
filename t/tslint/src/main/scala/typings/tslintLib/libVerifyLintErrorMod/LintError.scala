package typings
package tslintLib.libVerifyLintErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintError extends js.Object {
  var endPos: PositionInFile
  var message: java.lang.String
  var startPos: PositionInFile
}

object LintError {
  @scala.inline
  def apply(endPos: PositionInFile, message: java.lang.String, startPos: PositionInFile): LintError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endPos")(endPos)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("startPos")(startPos)
    __obj.asInstanceOf[LintError]
  }
}

