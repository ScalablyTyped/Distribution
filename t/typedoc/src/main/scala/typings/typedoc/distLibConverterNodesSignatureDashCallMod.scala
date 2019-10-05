package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsMod.Reflection
import typings.typescript.typescriptMod.FunctionExpression
import typings.typescript.typescriptMod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/signature-call", JSImport.Namespace)
@js.native
object distLibConverterNodesSignatureDashCallMod extends js.Object {
  @js.native
  class SignatureConverter () extends ConverterNodeComponent[FunctionExpression | SignatureDeclaration] {
    def convert(context: Context, node: FunctionExpression): Reflection = js.native
    def convert(context: Context, node: SignatureDeclaration): Reflection = js.native
  }
  
}

