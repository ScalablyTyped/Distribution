package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateParameter")
@js.native
object updateParameter extends js.Object {
  def apply(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName
  ): ParameterDeclaration = js.native
  def apply(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def apply(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def apply(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
}

