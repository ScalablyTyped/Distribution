package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCompletedEvent extends JobEvent {
  var outputVariables: org.scalablytyped.runtime.StringDictionary[VariableValue]
  var requestId: scala.Double
  var result: TaskResult
}

