package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.AST")
@js.native
class AST () extends IASTSpan {
  var _astID: js.Any = js.native
  /* CompleteClass */
  override var _end: scala.Double = js.native
  var _postComments: js.Any = js.native
  var _preComments: js.Any = js.native
  /* CompleteClass */
  override var _start: scala.Double = js.native
  var _trailingTriviaWidth: scala.Double = js.native
  var parent: AST = js.native
  /* CompleteClass */
  override def end(): scala.Double = js.native
  def fileName(): java.lang.String = js.native
  def isExpression(): scala.Boolean = js.native
  def kind(): SyntaxKind = js.native
  def postComments(): js.Array[Comment] = js.native
  def preComments(): js.Array[Comment] = js.native
  def setPostComments(comments: js.Array[Comment]): scala.Unit = js.native
  def setPreComments(comments: js.Array[Comment]): scala.Unit = js.native
  /* CompleteClass */
  override def start(): scala.Double = js.native
  def structuralEquals(ast: AST, includingPosition: scala.Boolean): scala.Boolean = js.native
  def syntaxID(): scala.Double = js.native
  def trailingTriviaWidth(): scala.Double = js.native
  def width(): scala.Double = js.native
}

