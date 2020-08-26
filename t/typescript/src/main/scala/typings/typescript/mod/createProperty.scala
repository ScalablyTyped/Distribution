package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createProperty")
@js.native
object createProperty extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
}

