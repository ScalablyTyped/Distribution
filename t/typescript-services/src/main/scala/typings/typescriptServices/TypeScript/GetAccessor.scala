package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessor extends AST {
  var block: Block = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  var parameterList: ParameterList = js.native
  var propertyName: IASTToken = js.native
  var typeAnnotation: TypeAnnotation = js.native
}

object GetAccessor {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    block: Block,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    modifiers: js.Array[PullElementFlags],
    parameterList: ParameterList,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    propertyName: IASTToken,
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    typeAnnotation: TypeAnnotation,
    width: () => Double
  ): GetAccessor = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), modifiers = modifiers.asInstanceOf[js.Any], parameterList = parameterList.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), propertyName = propertyName.asInstanceOf[js.Any], setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), typeAnnotation = typeAnnotation.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[GetAccessor]
  }
  @scala.inline
  implicit class GetAccessorOps[Self <: GetAccessor] (val x: Self) extends AnyVal {
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
    def setBlock(value: Block): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiersVarargs(value: PullElementFlags*): Self = this.set("modifiers", js.Array(value :_*))
    @scala.inline
    def setModifiers(value: js.Array[PullElementFlags]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterList(value: ParameterList): Self = this.set("parameterList", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyName(value: IASTToken): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
  }
  
}

