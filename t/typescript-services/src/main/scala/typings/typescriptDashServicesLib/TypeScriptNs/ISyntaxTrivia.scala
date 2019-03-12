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
    fullText: () => java.lang.String,
    fullWidth: () => scala.Double,
    isComment: () => scala.Boolean,
    isNewLine: () => scala.Boolean,
    isSkippedToken: () => scala.Boolean,
    isWhitespace: () => scala.Boolean,
    kind: () => SyntaxKind,
    skippedToken: () => ISyntaxToken
  ): ISyntaxTrivia = {
    val __obj = js.Dynamic.literal(fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isComment = js.Any.fromFunction0(isComment), isNewLine = js.Any.fromFunction0(isNewLine), isSkippedToken = js.Any.fromFunction0(isSkippedToken), isWhitespace = js.Any.fromFunction0(isWhitespace), kind = js.Any.fromFunction0(kind), skippedToken = js.Any.fromFunction0(skippedToken))
  
    __obj.asInstanceOf[ISyntaxTrivia]
  }
}

