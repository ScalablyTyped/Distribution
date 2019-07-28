package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultModelBase extends js.Object {
  var comment: String
  var completedDate: Date
  var durationInMs: Double
  var errorMessage: String
  var outcome: String
  var startedDate: Date
}

object TestResultModelBase {
  @scala.inline
  def apply(
    comment: String,
    completedDate: Date,
    durationInMs: Double,
    errorMessage: String,
    outcome: String,
    startedDate: Date
  ): TestResultModelBase = {
    val __obj = js.Dynamic.literal(comment = comment, completedDate = completedDate, durationInMs = durationInMs, errorMessage = errorMessage, outcome = outcome, startedDate = startedDate)
  
    __obj.asInstanceOf[TestResultModelBase]
  }
}

