package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.InterfaceDeclaration")
@js.native
class InterfaceDeclaration protected () extends AST {
  def this(
    modifiers: js.Array[PullElementFlags],
    identifier: Identifier,
    typeParameterList: TypeParameterList,
    heritageClauses: ISyntaxList2,
    body: ObjectType
  ) = this()
  var body: ObjectType = js.native
  var heritageClauses: ISyntaxList2 = js.native
  var identifier: Identifier = js.native
  var modifiers: js.Array[PullElementFlags] = js.native
  var typeParameterList: TypeParameterList = js.native
  def structuralEquals(ast: InterfaceDeclaration, includingPosition: Boolean): Boolean = js.native
}

