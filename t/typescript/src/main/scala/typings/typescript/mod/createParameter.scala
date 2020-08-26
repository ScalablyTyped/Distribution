package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createParameter")
@js.native
object createParameter extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
}

