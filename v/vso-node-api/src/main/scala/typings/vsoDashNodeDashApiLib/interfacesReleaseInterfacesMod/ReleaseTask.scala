package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTask extends js.Object {
  var agentName: java.lang.String
  var dateEnded: stdLib.Date
  var dateStarted: stdLib.Date
  var finishTime: stdLib.Date
  var id: scala.Double
  var issues: js.Array[Issue]
  var lineCount: scala.Double
  var logUrl: java.lang.String
  var name: java.lang.String
  var percentComplete: scala.Double
  var rank: scala.Double
  var startTime: stdLib.Date
  var status: TaskStatus
  var task: WorkflowTaskReference
  var timelineRecordId: java.lang.String
}

object ReleaseTask {
  @scala.inline
  def apply(
    agentName: java.lang.String,
    dateEnded: stdLib.Date,
    dateStarted: stdLib.Date,
    finishTime: stdLib.Date,
    id: scala.Double,
    issues: js.Array[Issue],
    lineCount: scala.Double,
    logUrl: java.lang.String,
    name: java.lang.String,
    percentComplete: scala.Double,
    rank: scala.Double,
    startTime: stdLib.Date,
    status: TaskStatus,
    task: WorkflowTaskReference,
    timelineRecordId: java.lang.String
  ): ReleaseTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agentName")(agentName)
    __obj.updateDynamic("dateEnded")(dateEnded)
    __obj.updateDynamic("dateStarted")(dateStarted)
    __obj.updateDynamic("finishTime")(finishTime)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("issues")(issues)
    __obj.updateDynamic("lineCount")(lineCount)
    __obj.updateDynamic("logUrl")(logUrl)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("percentComplete")(percentComplete)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("task")(task)
    __obj.updateDynamic("timelineRecordId")(timelineRecordId)
    __obj.asInstanceOf[ReleaseTask]
  }
}

