package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultUpdateRequestModel extends js.Object {
  var actionResultDeletes: js.Array[TestActionResultModel]
  var actionResults: js.Array[TestActionResultModel]
  var parameterDeletes: js.Array[TestResultParameterModel]
  var parameters: js.Array[TestResultParameterModel]
  var testCaseResult: TestCaseResultUpdateModel
}

object ResultUpdateRequestModel {
  @scala.inline
  def apply(
    actionResultDeletes: js.Array[TestActionResultModel],
    actionResults: js.Array[TestActionResultModel],
    parameterDeletes: js.Array[TestResultParameterModel],
    parameters: js.Array[TestResultParameterModel],
    testCaseResult: TestCaseResultUpdateModel
  ): ResultUpdateRequestModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionResultDeletes")(actionResultDeletes)
    __obj.updateDynamic("actionResults")(actionResults)
    __obj.updateDynamic("parameterDeletes")(parameterDeletes)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("testCaseResult")(testCaseResult)
    __obj.asInstanceOf[ResultUpdateRequestModel]
  }
}

