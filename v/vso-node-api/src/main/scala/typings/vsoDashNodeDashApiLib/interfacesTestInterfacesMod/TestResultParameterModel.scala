package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestResultParameterModel extends js.Object {
  var actionPath: java.lang.String
  var iterationId: scala.Double
  var parameterName: java.lang.String
  /**
       * This is step Id of test case. For shared step, it is step Id of shared step in test case workitem; step Id in shared step. Example: TestCase workitem has two steps: 1) Normal step with Id = 1 2) Shared Step with Id = 2. Inside shared step: a) Normal Step with Id = 1 Value for StepIdentifier for First step: "1" Second step: "2;1"
       */
  var stepIdentifier: java.lang.String
  var url: java.lang.String
  var value: java.lang.String
}

