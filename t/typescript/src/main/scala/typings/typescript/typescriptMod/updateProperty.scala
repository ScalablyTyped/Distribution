package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateProperty")
@js.native
object updateProperty extends js.Object {
  def apply(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | PropertyName
  ): PropertyDeclaration = js.native
  def apply(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken
  ): PropertyDeclaration = js.native
  def apply(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def apply(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
}

