package typings.typedoc.distLibConverterMod

import typings.typescript.typescriptMod.EnumMember
import typings.typescript.typescriptMod.Expression
import typings.typescript.typescriptMod.ParameterDeclaration
import typings.typescript.typescriptMod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  def convertExpression(expression: Expression): String = js.native
}

