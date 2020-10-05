package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.KeyOfKeyword
import typings.typescript.mod.SyntaxKind.ReadonlyKeyword
import typings.typescript.mod.SyntaxKind.UniqueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTypeOperatorNode")
@js.native
object createTypeOperatorNode extends js.Object {
  def apply(operator: KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(`type`: TypeNode): TypeOperatorNode = js.native
}

