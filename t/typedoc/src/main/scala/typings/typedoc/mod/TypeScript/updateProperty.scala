package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ComputedPropertyName
import typings.typescript.mod.Decorator
import typings.typescript.mod.ExclamationToken
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.NumericLiteral
import typings.typescript.mod.PrivateIdentifier
import typings.typescript.mod.PropertyDeclaration
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.StringLiteral
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateProperty")
@js.native
object updateProperty extends js.Object {
  
  /** @deprecated Use `factory.updatePropertyDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
}
