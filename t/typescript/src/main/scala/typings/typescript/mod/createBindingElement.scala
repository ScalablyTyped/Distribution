package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createBindingElement")
@js.native
object createBindingElement extends js.Object {
  
  /** @deprecated Use `factory.createBindingElement` or the factory supplied by your transformation context instead. */
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[
      java.lang.String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier
    ],
    name: java.lang.String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
    initializer: js.UndefOr[Expression]
  ): BindingElement = js.native
}
