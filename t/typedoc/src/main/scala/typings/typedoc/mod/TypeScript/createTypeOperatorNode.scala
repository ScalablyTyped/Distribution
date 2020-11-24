package typings.typedoc.mod.TypeScript

import typings.typescript.mod.SyntaxKind.KeyOfKeyword
import typings.typescript.mod.SyntaxKind.ReadonlyKeyword
import typings.typescript.mod.SyntaxKind.UniqueKeyword
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeOperatorNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTypeOperatorNode")
@js.native
object createTypeOperatorNode extends js.Object {
  
  /** @deprecated Use `factory.createTypeOperatorNode` or the factory supplied by your transformation context instead. */
  def apply(operator: KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  /** @deprecated Use `factory.createTypeOperatorNode` or the factory supplied by your transformation context instead. */
  def apply(`type`: TypeNode): TypeOperatorNode = js.native
}
