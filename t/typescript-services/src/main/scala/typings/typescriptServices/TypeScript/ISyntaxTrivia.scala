package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyntaxTrivia extends StObject {
  
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
  implicit class ISyntaxTriviaMutableBuilder[Self <: ISyntaxTrivia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullText(value: () => String): Self = StObject.set(x, "fullText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullWidth(value: () => Double): Self = StObject.set(x, "fullWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsComment(value: () => Boolean): Self = StObject.set(x, "isComment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNewLine(value: () => Boolean): Self = StObject.set(x, "isNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSkippedToken(value: () => Boolean): Self = StObject.set(x, "isSkippedToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsWhitespace(value: () => Boolean): Self = StObject.set(x, "isWhitespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSkippedToken(value: () => ISyntaxToken): Self = StObject.set(x, "skippedToken", js.Any.fromFunction0(value))
  }
}
