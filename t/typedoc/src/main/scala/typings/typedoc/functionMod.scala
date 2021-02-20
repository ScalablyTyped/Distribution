package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.modelsMod.Reflection
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.MethodDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionMod {
  
  @JSImport("typedoc/dist/lib/converter/nodes/function", "FunctionConverter")
  @js.native
  class FunctionConverter protected () extends ConverterNodeComponent[FunctionDeclaration | MethodDeclaration] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
    
    def convert(context: Context, node: FunctionDeclaration): js.UndefOr[Reflection] = js.native
    def convert(context: Context, node: MethodDeclaration): js.UndefOr[Reflection] = js.native
  }
}
