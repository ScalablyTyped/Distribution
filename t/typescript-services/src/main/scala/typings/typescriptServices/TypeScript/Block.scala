package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Block")
@js.native
class Block protected () extends AST {
  def this(statements: ISyntaxList2, closeBraceLeadingComments: js.Array[Comment], closeBraceToken: IASTSpan) = this()
  var closeBraceLeadingComments: js.Array[Comment] = js.native
  var closeBraceToken: IASTSpan = js.native
  var statements: ISyntaxList2 = js.native
  def structuralEquals(ast: Block, includingPosition: Boolean): Boolean = js.native
}

