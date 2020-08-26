package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BindingName
import typings.typescript.mod.Decorator
import typings.typescript.mod.DotDotDotToken
import typings.typescript.mod.Expression
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createParameter")
@js.native
object createParameter extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
}

