package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
  var _end: Double = js.native
  
  var _start: Double = js.native
  
  var _trivia: js.Any = js.native
  
  def end(): Double = js.native
  
  var endsLine: Boolean = js.native
  
  def fullText(): String = js.native
  
  def kind(): SyntaxKind = js.native
  
  def start(): Double = js.native
  
  def structuralEquals(ast: Comment, includingPosition: Boolean): Boolean = js.native
}
object Comment {
  
  @scala.inline
  def apply(
    _end: Double,
    _start: Double,
    _trivia: js.Any,
    end: () => Double,
    endsLine: Boolean,
    fullText: () => String,
    kind: () => SyntaxKind,
    start: () => Double,
    structuralEquals: (Comment, Boolean) => Boolean
  ): Comment = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trivia = _trivia.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), endsLine = endsLine.asInstanceOf[js.Any], fullText = js.Any.fromFunction0(fullText), kind = js.Any.fromFunction0(kind), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals))
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndsLine(value: Boolean): Self = StObject.set(x, "endsLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullText(value: () => String): Self = StObject.set(x, "fullText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStructuralEquals(value: (Comment, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_end(value: Double): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_start(value: Double): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_trivia(value: js.Any): Self = StObject.set(x, "_trivia", value.asInstanceOf[js.Any])
  }
}
