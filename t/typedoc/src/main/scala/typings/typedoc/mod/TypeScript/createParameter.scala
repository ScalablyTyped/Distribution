package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ArrayBindingPattern
import typings.typescript.mod.Decorator
import typings.typescript.mod.DotDotDotToken
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.ObjectBindingPattern
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createParameter")
@js.native
object createParameter extends js.Object {
  
  /** @deprecated Use `factory.createParameterDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: String | Identifier | ObjectBindingPattern | ArrayBindingPattern,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
}
