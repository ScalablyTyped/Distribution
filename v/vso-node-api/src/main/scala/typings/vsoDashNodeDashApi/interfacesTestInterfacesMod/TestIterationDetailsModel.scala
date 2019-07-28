package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIterationDetailsModel extends js.Object {
  var actionResults: js.Array[TestActionResultModel]
  var attachments: js.Array[TestCaseResultAttachmentModel]
  var comment: String
  var completedDate: Date
  var durationInMs: Double
  var errorMessage: String
  var id: Double
  var outcome: String
  var parameters: js.Array[TestResultParameterModel]
  var startedDate: Date
  var url: String
}

object TestIterationDetailsModel {
  @scala.inline
  def apply(
    actionResults: js.Array[TestActionResultModel],
    attachments: js.Array[TestCaseResultAttachmentModel],
    comment: String,
    completedDate: Date,
    durationInMs: Double,
    errorMessage: String,
    id: Double,
    outcome: String,
    parameters: js.Array[TestResultParameterModel],
    startedDate: Date,
    url: String
  ): TestIterationDetailsModel = {
    val __obj = js.Dynamic.literal(actionResults = actionResults, attachments = attachments, comment = comment, completedDate = completedDate, durationInMs = durationInMs, errorMessage = errorMessage, id = id, outcome = outcome, parameters = parameters, startedDate = startedDate, url = url)
  
    __obj.asInstanceOf[TestIterationDetailsModel]
  }
}

