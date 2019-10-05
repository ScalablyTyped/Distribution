package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxTrivia extends js.Object {
  def fullText(): String
  def fullWidth(): Double
  def isComment(): Boolean
  def isNewLine(): Boolean
  def isSkippedToken(): Boolean
  def isWhitespace(): Boolean
  def kind(): SyntaxKind
  def skippedToken(): ISyntaxToken
}

object ISyntaxTrivia {
  @scala.inline
  def apply(
    fullText: () => String,
    fullWidth: () => Double,
    isComment: () => Boolean,
    isNewLine: () => Boolean,
    isSkippedToken: () => Boolean,
    isWhitespace: () => Boolean,
    kind: () => SyntaxKind,
    skippedToken: () => ISyntaxToken
  ): ISyntaxTrivia = {
    val __obj = js.Dynamic.literal(fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isComment = js.Any.fromFunction0(isComment), isNewLine = js.Any.fromFunction0(isNewLine), isSkippedToken = js.Any.fromFunction0(isSkippedToken), isWhitespace = js.Any.fromFunction0(isWhitespace), kind = js.Any.fromFunction0(kind), skippedToken = js.Any.fromFunction0(skippedToken))
  
    __obj.asInstanceOf[ISyntaxTrivia]
  }
}

