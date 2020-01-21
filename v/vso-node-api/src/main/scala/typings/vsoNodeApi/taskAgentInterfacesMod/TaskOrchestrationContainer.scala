package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], parallel = parallel.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskOrchestrationContainer]
  }
}

