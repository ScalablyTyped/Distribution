package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTask extends js.Object {
  var agentName: String
  var dateEnded: Date
  var dateStarted: Date
  var finishTime: Date
  var id: Double
  var issues: js.Array[Issue]
  var lineCount: Double
  var logUrl: String
  var name: String
  var percentComplete: Double
  var rank: Double
  var startTime: Date
  var status: TaskStatus
  var task: WorkflowTaskReference
  var timelineRecordId: String
}

object ReleaseTask {
  @scala.inline
  def apply(
    agentName: String,
    dateEnded: Date,
    dateStarted: Date,
    finishTime: Date,
    id: Double,
    issues: js.Array[Issue],
    lineCount: Double,
    logUrl: String,
    name: String,
    percentComplete: Double,
    rank: Double,
    startTime: Date,
    status: TaskStatus,
    task: WorkflowTaskReference,
    timelineRecordId: String
  ): ReleaseTask = {
    val __obj = js.Dynamic.literal(agentName = agentName, dateEnded = dateEnded, dateStarted = dateStarted, finishTime = finishTime, id = id, issues = issues, lineCount = lineCount, logUrl = logUrl, name = name, percentComplete = percentComplete, rank = rank, startTime = startTime, status = status, task = task, timelineRecordId = timelineRecordId)
  
    __obj.asInstanceOf[ReleaseTask]
  }
}

