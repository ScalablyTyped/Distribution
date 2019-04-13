package typings
package typedocLib.distLibConverterNodesFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/function", "FunctionConverter")
@js.native
class FunctionConverter ()
  extends typedocLib.distLibConverterComponentsMod.ConverterNodeComponent[
      typescriptLib.typescriptMod.FunctionDeclaration | typescriptLib.typescriptMod.MethodDeclaration
    ] {
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.FunctionDeclaration
  ): js.UndefOr[typedocLib.distLibModelsMod.Reflection] = js.native
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.MethodDeclaration
  ): js.UndefOr[typedocLib.distLibModelsMod.Reflection] = js.native
}

