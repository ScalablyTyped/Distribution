package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ImportDeclaration")
@js.native
class ImportDeclaration protected () extends AST {
  def this(modifiers: js.Array[PullElementFlags], identifier: Identifier, moduleReference: AST) = this()
  var identifier: Identifier = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  var moduleReference: AST = js.native
  def structuralEquals(ast: ImportDeclaration, includingPosition: Boolean): Boolean = js.native
}

