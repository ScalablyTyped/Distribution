package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "InvocationExpression")
@js.native
class InvocationExpression protected ()
  extends typings.typescriptServices.TypeScript.InvocationExpression {
  def this(
    expression: typings.typescriptServices.TypeScript.AST,
    argumentList: typings.typescriptServices.TypeScript.ArgumentList
  ) = this()
  /* CompleteClass */
  override var _astID: js.Any = js.native
  /* CompleteClass */
  override var _end: Double = js.native
  /* CompleteClass */
  override var _postComments: js.Any = js.native
  /* CompleteClass */
  override var _preComments: js.Any = js.native
  /* CompleteClass */
  override var _start: Double = js.native
  /* CompleteClass */
  override var _trailingTriviaWidth: Double = js.native
  /* CompleteClass */
  override var argumentList: typings.typescriptServices.TypeScript.ArgumentList = js.native
  /* CompleteClass */
  override var expression: typings.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override var parent: typings.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /* CompleteClass */
  override def fileName(): String = js.native
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  /* CompleteClass */
  override def postComments(): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  /* CompleteClass */
  override def preComments(): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  /* CompleteClass */
  override def setPostComments(comments: js.Array[typings.typescriptServices.TypeScript.Comment]): Unit = js.native
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typings.typescriptServices.TypeScript.Comment]): Unit = js.native
  /* CompleteClass */
  override def start(): Double = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typings.typescriptServices.TypeScript.InvocationExpression, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def width(): Double = js.native
}

