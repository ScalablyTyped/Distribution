package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultModelBase extends js.Object {
  var comment: java.lang.String
  var completedDate: stdLib.Date
  var durationInMs: scala.Double
  var errorMessage: java.lang.String
  var outcome: java.lang.String
  var startedDate: stdLib.Date
}

object TestResultModelBase {
  @scala.inline
  def apply(
    comment: java.lang.String,
    completedDate: stdLib.Date,
    durationInMs: scala.Double,
    errorMessage: java.lang.String,
    outcome: java.lang.String,
    startedDate: stdLib.Date
  ): TestResultModelBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("completedDate")(completedDate)
    __obj.updateDynamic("durationInMs")(durationInMs)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("outcome")(outcome)
    __obj.updateDynamic("startedDate")(startedDate)
    __obj.asInstanceOf[TestResultModelBase]
  }
}

