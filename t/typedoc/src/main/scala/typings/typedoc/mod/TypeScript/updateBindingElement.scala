package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BindingElement
import typings.typescript.mod.BindingName
import typings.typescript.mod.DotDotDotToken
import typings.typescript.mod.Expression
import typings.typescript.mod.PropertyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateBindingElement")
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

