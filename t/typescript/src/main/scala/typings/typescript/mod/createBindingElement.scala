package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createBindingElement")
@js.native
object createBindingElement extends js.Object {
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName | java.lang.String],
    name: java.lang.String
  ): BindingElement = js.native
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName | java.lang.String],
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName | java.lang.String],
    name: BindingName
  ): BindingElement = js.native
  def apply(
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    propertyName: js.UndefOr[PropertyName | java.lang.String],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
}

