package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.Modifier
import typings.typescript.mod.PropertyName
import typings.typescript.mod.PropertySignature
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createPropertySignature")
@js.native
object createPropertySignature extends js.Object {
  def apply(modifiers: js.UndefOr[js.Array[Modifier]], name: String): PropertySignature = js.native
  def apply(modifiers: js.UndefOr[js.Array[Modifier]], name: String, questionToken: QuestionToken): PropertySignature = js.native
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
  def apply(modifiers: js.UndefOr[js.Array[Modifier]], name: PropertyName): PropertySignature = js.native
  def apply(modifiers: js.UndefOr[js.Array[Modifier]], name: PropertyName, questionToken: QuestionToken): PropertySignature = js.native
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
}

