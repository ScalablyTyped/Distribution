package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.modelsMod.Reflection
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.SignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureCallMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/signature-call", "SignatureConverter")
  @js.native
  class SignatureConverter protected () extends ConverterNodeComponent[FunctionExpression | SignatureDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convert(context: Context, node: FunctionExpression): Reflection = js.native
  }
}
