package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskOrchestrationContainer extends TaskOrchestrationItem {
  var children: js.Array[TaskOrchestrationItem]
  var continueOnError: scala.Boolean
  var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var maxConcurrency: scala.Double
  var parallel: scala.Boolean
  var rollback: TaskOrchestrationContainer
}

