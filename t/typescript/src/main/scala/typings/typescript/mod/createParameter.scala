package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createParameter")
@js.native
object createParameter extends js.Object {
  
  /** @deprecated Use `factory.createParameterDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
}
