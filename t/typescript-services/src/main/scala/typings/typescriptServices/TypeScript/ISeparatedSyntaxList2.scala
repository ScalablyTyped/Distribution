package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISeparatedSyntaxList2 extends AST {
  
  var _fileName: js.Any = js.native
  
  var _separatorCount: js.Any = js.native
  
  var members: js.Any = js.native
  
  def nonSeparatorAt(index: Double): AST = js.native
  
  def nonSeparatorCount(): Double = js.native
  
  def nonSeparatorIndexOf(ast: AST): Double = js.native
  
  def separatorCount(): Double = js.native
  
  def structuralEquals(ast: ISeparatedSyntaxList2, includingPosition: Boolean): Boolean = js.native
}
object ISeparatedSyntaxList2 {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _fileName: js.Any,
    _postComments: js.Any,
    _preComments: js.Any,
    _separatorCount: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    members: js.Any,
    nonSeparatorAt: Double => AST,
    nonSeparatorCount: () => Double,
    nonSeparatorIndexOf: AST => Double,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    separatorCount: () => Double,
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ISeparatedSyntaxList2, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISeparatedSyntaxList2 = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _separatorCount = _separatorCount.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), members = members.asInstanceOf[js.Any], nonSeparatorAt = js.Any.fromFunction1(nonSeparatorAt), nonSeparatorCount = js.Any.fromFunction0(nonSeparatorCount), nonSeparatorIndexOf = js.Any.fromFunction1(nonSeparatorIndexOf), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), separatorCount = js.Any.fromFunction0(separatorCount), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISeparatedSyntaxList2]
  }
  
  @scala.inline
  implicit class ISeparatedSyntaxList2Ops[Self <: ISeparatedSyntaxList2] (val x: Self) extends AnyVal {
    
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
    def set_fileName(value: js.Any): Self = this.set("_fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_separatorCount(value: js.Any): Self = this.set("_separatorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Any): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSeparatorAt(value: Double => AST): Self = this.set("nonSeparatorAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNonSeparatorCount(value: () => Double): Self = this.set("nonSeparatorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNonSeparatorIndexOf(value: AST => Double): Self = this.set("nonSeparatorIndexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeparatorCount(value: () => Double): Self = this.set("separatorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStructuralEquals(value: (ISeparatedSyntaxList2, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
  }
}
