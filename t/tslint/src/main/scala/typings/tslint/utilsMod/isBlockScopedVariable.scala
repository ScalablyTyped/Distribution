package typings.tslint.utilsMod

import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/language/utils", "isBlockScopedVariable")
@js.native
object isBlockScopedVariable extends js.Object {
  
  def apply(node: VariableDeclaration): Boolean = js.native
  def apply(node: VariableStatement): Boolean = js.native
}
