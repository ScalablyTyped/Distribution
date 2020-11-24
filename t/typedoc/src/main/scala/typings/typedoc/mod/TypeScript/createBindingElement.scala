package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ArrayBindingPattern
import typings.typescript.mod.BindingElement
import typings.typescript.mod.ComputedPropertyName
import typings.typescript.mod.DotDotDotToken
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.NumericLiteral
import typings.typescript.mod.ObjectBindingPattern
import typings.typescript.mod.PrivateIdentifier
import typings.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createBindingElement")
@js.native
object createBindingElement extends js.Object {
  
  /** @deprecated Use `factory.createBindingElement` or the factory supplied by your transformation context instead. */
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[
      String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier
    ],
    name: String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
    initializer: js.UndefOr[Expression]
  ): BindingElement = js.native
}
