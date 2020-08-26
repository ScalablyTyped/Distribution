package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.ExclamationToken
import typings.typescript.mod.Expression
import typings.typescript.mod.Modifier
import typings.typescript.mod.PropertyDeclaration
import typings.typescript.mod.PropertyName
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateProperty")
@js.native
object updateProperty extends js.Object {
  def apply(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | PropertyName,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
}

