package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.AST")
@js.native
class AST () extends IASTSpan {
  var _astID: js.Any = js.native
  /* CompleteClass */
  override var _end: Double = js.native
  var _postComments: js.Any = js.native
  var _preComments: js.Any = js.native
  /* CompleteClass */
  override var _start: Double = js.native
  var _trailingTriviaWidth: Double = js.native
  var parent: AST = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  def fileName(): String = js.native
  def isExpression(): Boolean = js.native
  def kind(): SyntaxKind = js.native
  def postComments(): js.Array[Comment] = js.native
  def preComments(): js.Array[Comment] = js.native
  def setPostComments(comments: js.Array[Comment]): Unit = js.native
  def setPreComments(comments: js.Array[Comment]): Unit = js.native
  /* CompleteClass */
  override def start(): Double = js.native
  def structuralEquals(ast: AST, includingPosition: Boolean): Boolean = js.native
  def syntaxID(): Double = js.native
  def trailingTriviaWidth(): Double = js.native
  def width(): Double = js.native
}

