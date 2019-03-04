package typings
package vsoDashNodeDashApiLib.interfacesDistributedTaskCommonInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessParameters extends js.Object {
  var dataSourceBindings: js.Array[DataSourceBindingBase]
  var inputs: js.Array[TaskInputDefinitionBase]
  var sourceDefinitions: js.Array[TaskSourceDefinitionBase]
}

object ProcessParameters {
  @scala.inline
  def apply(
    dataSourceBindings: js.Array[DataSourceBindingBase],
    inputs: js.Array[TaskInputDefinitionBase],
    sourceDefinitions: js.Array[TaskSourceDefinitionBase]
  ): ProcessParameters = {
    val __obj = js.Dynamic.literal(dataSourceBindings = dataSourceBindings, inputs = inputs, sourceDefinitions = sourceDefinitions)
  
    __obj.asInstanceOf[ProcessParameters]
  }
}

