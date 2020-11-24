package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.KeyOfKeyword
import typings.typescript.mod.SyntaxKind.UniqueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTypeOperatorNode")
@js.native
object createTypeOperatorNode extends js.Object {
  
  /** @deprecated Use `factory.createTypeOperatorNode` or the factory supplied by your transformation context instead. */
  def apply(operator: KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: typings.typescript.mod.SyntaxKind.ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  /** @deprecated Use `factory.createTypeOperatorNode` or the factory supplied by your transformation context instead. */
  def apply(`type`: TypeNode): TypeOperatorNode = js.native
}
