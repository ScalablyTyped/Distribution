package typings
package typedocLib.distLibConverterNodesSignatureDashCallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/signature-call", "SignatureConverter")
@js.native
class SignatureConverter ()
  extends typedocLib.distLibConverterComponentsMod.ConverterNodeComponent[
      typescriptLib.typescriptMod.tsNs.FunctionExpression | typescriptLib.typescriptMod.tsNs.SignatureDeclaration
    ] {
  def convert(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.FunctionExpression
  ): typedocLib.distLibModelsMod.Reflection = js.native
}

