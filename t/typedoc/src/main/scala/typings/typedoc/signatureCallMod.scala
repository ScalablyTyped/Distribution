package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.Reflection
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/signature-call", JSImport.Namespace)
@js.native
object signatureCallMod extends js.Object {
  
  @js.native
  class SignatureConverter () extends ConverterNodeComponent[FunctionExpression | SignatureDeclaration] {
    
    def convert(context: Context, node: FunctionExpression): Reflection = js.native
    def convert(context: Context, node: SignatureDeclaration): Reflection = js.native
  }
}
