package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarationList
  extends Node
     with ForInitializer {
  var declarations: NodeArray[VariableDeclaration] = js.native
  @JSName("kind")
  var kind_VariableDeclarationList: typescriptLib.typescriptMod.SyntaxKind.VariableDeclarationList = js.native
  @JSName("parent")
  var parent_VariableDeclarationList: VariableStatement | ForStatement | ForOfStatement | ForInStatement = js.native
}

