package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ClassDeclaration")
@js.native
class ClassDeclaration protected () extends AST {
  def this(modifiers: js.Array[PullElementFlags], identifier: Identifier, typeParameterList: TypeParameterList, heritageClauses: ISyntaxList2, classElements: ISyntaxList2, closeBraceToken: ASTSpan) = this()
  var classElements: ISyntaxList2 = js.native
  var closeBraceToken: ASTSpan = js.native
  var heritageClauses: ISyntaxList2 = js.native
  var identifier: Identifier = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  var typeParameterList: TypeParameterList = js.native
  def structuralEquals(ast: ClassDeclaration, includingPosition: scala.Boolean): scala.Boolean = js.native
}

