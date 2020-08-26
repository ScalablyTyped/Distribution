package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyntaxTrivia extends js.Object {
  def fullText(): String = js.native
  def fullWidth(): Double = js.native
  def isComment(): Boolean = js.native
  def isNewLine(): Boolean = js.native
  def isSkippedToken(): Boolean = js.native
  def isWhitespace(): Boolean = js.native
  def kind(): SyntaxKind = js.native
  def skippedToken(): ISyntaxToken = js.native
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
  @scala.inline
  implicit class ISyntaxTriviaOps[Self <: ISyntaxTrivia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFullText(value: () => String): Self = this.set("fullText", js.Any.fromFunction0(value))
    @scala.inline
    def setFullWidth(value: () => Double): Self = this.set("fullWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setIsComment(value: () => Boolean): Self = this.set("isComment", js.Any.fromFunction0(value))
    @scala.inline
    def setIsNewLine(value: () => Boolean): Self = this.set("isNewLine", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSkippedToken(value: () => Boolean): Self = this.set("isSkippedToken", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWhitespace(value: () => Boolean): Self = this.set("isWhitespace", js.Any.fromFunction0(value))
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = this.set("kind", js.Any.fromFunction0(value))
    @scala.inline
    def setSkippedToken(value: () => ISyntaxToken): Self = this.set("skippedToken", js.Any.fromFunction0(value))
  }
  
}

