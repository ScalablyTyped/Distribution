package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createPropertySignature")
@js.native
object createPropertySignature extends js.Object {
  def apply(modifiers: js.UndefOr[js.Array[Modifier]], name: PropertyName | String): PropertySignature = js.native
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName | String,
    questionToken: QuestionToken
  ): PropertySignature = js.native
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName | String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName | String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
}

