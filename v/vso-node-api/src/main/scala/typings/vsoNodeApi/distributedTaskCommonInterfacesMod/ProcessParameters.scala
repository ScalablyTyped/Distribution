package typings.vsoNodeApi.distributedTaskCommonInterfacesMod

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
    val __obj = js.Dynamic.literal(dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessParameters]
  }
}

