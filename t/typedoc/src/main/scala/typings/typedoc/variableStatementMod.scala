package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.contextMod.Context
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/variable-statement", JSImport.Namespace)
@js.native
object variableStatementMod extends js.Object {
  
  @js.native
  class VariableStatementConverter () extends ConverterNodeComponent[VariableStatement] {
    
    def convertBindingPattern(context: Context, node: BindingPattern): Unit = js.native
  }
}
