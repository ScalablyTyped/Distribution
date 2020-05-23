package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BindingElement
import typings.typescript.mod.BindingName
import typings.typescript.mod.DotDotDotToken
import typings.typescript.mod.Expression
import typings.typescript.mod.PropertyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createBindingElement")
@js.native
object createBindingElement extends js.Object {
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName | String],
    name: String
  ): BindingElement = js.native
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName | String],
    name: String,
    initializer: Expression
  ): BindingElement = js.native
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName | String],
    name: BindingName
  ): BindingElement = js.native
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName | String],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
}

