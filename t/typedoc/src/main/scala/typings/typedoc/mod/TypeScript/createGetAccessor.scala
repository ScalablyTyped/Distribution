package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Block
import typings.typescript.mod.ComputedPropertyName
import typings.typescript.mod.Decorator
import typings.typescript.mod.GetAccessorDeclaration
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.NumericLiteral
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PrivateIdentifier
import typings.typescript.mod.StringLiteral
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createGetAccessor")
@js.native
object createGetAccessor extends js.Object {
  
  /** @deprecated Use `factory.createGetAccessorDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): GetAccessorDeclaration = js.native
}
