package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends js.Object {
  
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
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    
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
    def set_end(value: Double): Self = this.set("_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_start(value: Double): Self = this.set("_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_trivia(value: js.Any): Self = this.set("_trivia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: () => Double): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndsLine(value: Boolean): Self = this.set("endsLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullText(value: () => String): Self = this.set("fullText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = this.set("kind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStructuralEquals(value: (Comment, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
  }
}
