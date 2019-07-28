package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationContainer extends TaskOrchestrationItem {
  var children: js.Array[TaskOrchestrationItem]
  var continueOnError: Boolean
  var data: StringDictionary[String]
  var maxConcurrency: Double
  var parallel: Boolean
  var rollback: TaskOrchestrationContainer
}

object TaskOrchestrationContainer {
  @scala.inline
  def apply(
    children: js.Array[TaskOrchestrationItem],
    continueOnError: Boolean,
    data: StringDictionary[String],
    itemType: TaskOrchestrationItemType,
    maxConcurrency: Double,
    parallel: Boolean,
    rollback: TaskOrchestrationContainer
  ): TaskOrchestrationContainer = {
    val __obj = js.Dynamic.literal(children = children, continueOnError = continueOnError, data = data, itemType = itemType, maxConcurrency = maxConcurrency, parallel = parallel, rollback = rollback)
  
    __obj.asInstanceOf[TaskOrchestrationContainer]
  }
}

