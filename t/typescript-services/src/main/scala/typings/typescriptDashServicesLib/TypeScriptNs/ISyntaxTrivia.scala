package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxTrivia extends js.Object {
  def fullText(): java.lang.String
  def fullWidth(): scala.Double
  def isComment(): scala.Boolean
  def isNewLine(): scala.Boolean
  def isSkippedToken(): scala.Boolean
  def isWhitespace(): scala.Boolean
  def kind(): SyntaxKind
  def skippedToken(): ISyntaxToken
}

object ISyntaxTrivia {
  @scala.inline
  def apply(
    fullText: js.Function0[java.lang.String],
    fullWidth: js.Function0[scala.Double],
    isComment: js.Function0[scala.Boolean],
    isNewLine: js.Function0[scala.Boolean],
    isSkippedToken: js.Function0[scala.Boolean],
    isWhitespace: js.Function0[scala.Boolean],
    kind: js.Function0[SyntaxKind],
    skippedToken: js.Function0[ISyntaxToken]
  ): ISyntaxTrivia = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullText")(fullText)
    __obj.updateDynamic("fullWidth")(fullWidth)
    __obj.updateDynamic("isComment")(isComment)
    __obj.updateDynamic("isNewLine")(isNewLine)
    __obj.updateDynamic("isSkippedToken")(isSkippedToken)
    __obj.updateDynamic("isWhitespace")(isWhitespace)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("skippedToken")(skippedToken)
    __obj.asInstanceOf[ISyntaxTrivia]
  }
}

