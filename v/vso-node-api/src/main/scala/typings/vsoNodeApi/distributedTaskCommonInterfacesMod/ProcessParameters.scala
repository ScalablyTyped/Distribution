package typings.vsoNodeApi.distributedTaskCommonInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessParameters extends js.Object {
  
  var dataSourceBindings: js.Array[DataSourceBindingBase] = js.native
  
  var inputs: js.Array[TaskInputDefinitionBase] = js.native
  
  var sourceDefinitions: js.Array[TaskSourceDefinitionBase] = js.native
}
object ProcessParameters {
  
  @scala.inline
  def apply(
    dataSourceBindings: js.Array[DataSourceBindingBase],
    inputs: js.Array[TaskInputDefinitionBase],
    sourceDefinitions: js.Array[TaskSourceDefinitionBase]
  ): ProcessParameters = {
    val __obj = js.Dynamic.literal(dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessParameters]
  }
  
  @scala.inline
  implicit class ProcessParametersOps[Self <: ProcessParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSourceBindingsVarargs(value: DataSourceBindingBase*): Self = this.set("dataSourceBindings", js.Array(value :_*))
    
    @scala.inline
    def setDataSourceBindings(value: js.Array[DataSourceBindingBase]): Self = this.set("dataSourceBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: TaskInputDefinitionBase*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[TaskInputDefinitionBase]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDefinitionsVarargs(value: TaskSourceDefinitionBase*): Self = this.set("sourceDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setSourceDefinitions(value: js.Array[TaskSourceDefinitionBase]): Self = this.set("sourceDefinitions", value.asInstanceOf[js.Any])
  }
}
