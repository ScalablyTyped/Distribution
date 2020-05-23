package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateBindingElement")
@js.native
object updateBindingElement extends js.Object {
  def apply(
    node: BindingElement,
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName],
    name: BindingName
  ): BindingElement = js.native
  def apply(
    node: BindingElement,
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
}

