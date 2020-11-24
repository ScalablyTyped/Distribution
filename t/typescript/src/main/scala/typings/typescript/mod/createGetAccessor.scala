package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createGetAccessor")
@js.native
object createGetAccessor extends js.Object {
  
  /** @deprecated Use `factory.createGetAccessorDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): GetAccessorDeclaration = js.native
}
