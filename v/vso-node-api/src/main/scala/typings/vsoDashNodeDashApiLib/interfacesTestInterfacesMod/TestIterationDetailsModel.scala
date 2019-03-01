package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIterationDetailsModel extends js.Object {
  var actionResults: js.Array[TestActionResultModel]
  var attachments: js.Array[TestCaseResultAttachmentModel]
  var comment: java.lang.String
  var completedDate: stdLib.Date
  var durationInMs: scala.Double
  var errorMessage: java.lang.String
  var id: scala.Double
  var outcome: java.lang.String
  var parameters: js.Array[TestResultParameterModel]
  var startedDate: stdLib.Date
  var url: java.lang.String
}

object TestIterationDetailsModel {
  @scala.inline
  def apply(
    actionResults: js.Array[TestActionResultModel],
    attachments: js.Array[TestCaseResultAttachmentModel],
    comment: java.lang.String,
    completedDate: stdLib.Date,
    durationInMs: scala.Double,
    errorMessage: java.lang.String,
    id: scala.Double,
    outcome: java.lang.String,
    parameters: js.Array[TestResultParameterModel],
    startedDate: stdLib.Date,
    url: java.lang.String
  ): TestIterationDetailsModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionResults")(actionResults)
    __obj.updateDynamic("attachments")(attachments)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("completedDate")(completedDate)
    __obj.updateDynamic("durationInMs")(durationInMs)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("outcome")(outcome)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("startedDate")(startedDate)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TestIterationDetailsModel]
  }
}

