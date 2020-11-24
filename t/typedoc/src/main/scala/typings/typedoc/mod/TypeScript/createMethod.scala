package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AsteriskToken
import typings.typescript.mod.Block
import typings.typescript.mod.ComputedPropertyName
import typings.typescript.mod.Decorator
import typings.typescript.mod.Identifier
import typings.typescript.mod.MethodDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.NumericLiteral
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PrivateIdentifier
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.StringLiteral
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createMethod")
@js.native
object createMethod extends js.Object {
  
  /** @deprecated Use `factory.createMethodDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
}
