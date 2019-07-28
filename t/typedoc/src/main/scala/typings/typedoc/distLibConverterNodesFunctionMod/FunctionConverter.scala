package typings.typedoc.distLibConverterNodesFunctionMod

import typings.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsMod.Reflection
import typings.typescript.typescriptMod.FunctionDeclaration
import typings.typescript.typescriptMod.MethodDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/function", "FunctionConverter")
@js.native
class FunctionConverter () extends ConverterNodeComponent[FunctionDeclaration | MethodDeclaration] {
  def convert(context: Context, node: FunctionDeclaration): js.UndefOr[Reflection] = js.native
  def convert(context: Context, node: MethodDeclaration): js.UndefOr[Reflection] = js.native
}

