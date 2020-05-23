package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updatePropertySignature")
@js.native
object updatePropertySignature extends js.Object {
  def apply(node: PropertySignature, modifiers: js.UndefOr[js.Array[Modifier]], name: PropertyName): PropertySignature = js.native
  def apply(
    node: PropertySignature,
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    questionToken: QuestionToken
  ): PropertySignature = js.native
  def apply(
    node: PropertySignature,
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def apply(
    node: PropertySignature,
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
}

