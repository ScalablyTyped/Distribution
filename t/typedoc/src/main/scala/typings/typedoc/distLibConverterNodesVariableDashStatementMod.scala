package typings.typedoc

import typings.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typings.typedoc.distLibConverterContextMod.Context
import typings.typescript.typescriptMod.BindingPattern
import typings.typescript.typescriptMod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/variable-statement", JSImport.Namespace)
@js.native
object distLibConverterNodesVariableDashStatementMod extends js.Object {
  @js.native
  class VariableStatementConverter () extends ConverterNodeComponent[VariableStatement] {
    def convertBindingPattern(context: Context, node: BindingPattern): Unit = js.native
  }
  
}

