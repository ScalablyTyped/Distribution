package typings.tslint.mod

import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isBlockScopedVariable")
@js.native
object isBlockScopedVariable extends js.Object {
  def apply(node: VariableDeclaration): Boolean = js.native
  def apply(node: VariableStatement): Boolean = js.native
}

