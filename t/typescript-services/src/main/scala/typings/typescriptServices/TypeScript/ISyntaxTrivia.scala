package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxTrivia extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: ISyntaxTrivia](x: Self) {
    
    inline def setFullText(value: () => String): Self = StObject.set(x, "fullText", js.Any.fromFunction0(value))
    
    inline def setFullWidth(value: () => Double): Self = StObject.set(x, "fullWidth", js.Any.fromFunction0(value))
    
    inline def setIsComment(value: () => Boolean): Self = StObject.set(x, "isComment", js.Any.fromFunction0(value))
    
    inline def setIsNewLine(value: () => Boolean): Self = StObject.set(x, "isNewLine", js.Any.fromFunction0(value))
    
    inline def setIsSkippedToken(value: () => Boolean): Self = StObject.set(x, "isSkippedToken", js.Any.fromFunction0(value))
    
    inline def setIsWhitespace(value: () => Boolean): Self = StObject.set(x, "isWhitespace", js.Any.fromFunction0(value))
    
    inline def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setSkippedToken(value: () => ISyntaxToken): Self = StObject.set(x, "skippedToken", js.Any.fromFunction0(value))
  }
}
