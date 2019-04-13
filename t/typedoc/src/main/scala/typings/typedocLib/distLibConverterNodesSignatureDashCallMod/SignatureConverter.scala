package typings
package typedocLib.distLibConverterNodesSignatureDashCallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/signature-call", "SignatureConverter")
@js.native
class SignatureConverter ()
  extends typedocLib.distLibConverterComponentsMod.ConverterNodeComponent[
      typescriptLib.typescriptMod.FunctionExpression | typescriptLib.typescriptMod.SignatureDeclaration
    ] {
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.FunctionExpression
  ): typedocLib.distLibModelsMod.Reflection = js.native
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.SignatureDeclaration
  ): typedocLib.distLibModelsMod.Reflection = js.native
}

