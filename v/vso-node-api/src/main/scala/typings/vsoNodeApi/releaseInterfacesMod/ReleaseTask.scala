package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseTask extends js.Object {
  var agentName: String = js.native
  var dateEnded: Date = js.native
  var dateStarted: Date = js.native
  var finishTime: Date = js.native
  var id: Double = js.native
  var issues: js.Array[Issue] = js.native
  var lineCount: Double = js.native
  var logUrl: String = js.native
  var name: String = js.native
  var percentComplete: Double = js.native
  var rank: Double = js.native
  var startTime: Date = js.native
  var status: TaskStatus = js.native
  var task: WorkflowTaskReference = js.native
  var timelineRecordId: String = js.native
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
    val __obj = js.Dynamic.literal(agentName = agentName.asInstanceOf[js.Any], dateEnded = dateEnded.asInstanceOf[js.Any], dateStarted = dateStarted.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], logUrl = logUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTask]
  }
  @scala.inline
  implicit class ReleaseTaskOps[Self <: ReleaseTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgentName(value: String): Self = this.set("agentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateEnded(value: Date): Self = this.set("dateEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateStarted(value: Date): Self = this.set("dateStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishTime(value: Date): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = this.set("issues", js.Array(value :_*))
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = this.set("issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineCount(value: Double): Self = this.set("lineCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogUrl(value: String): Self = this.set("logUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: TaskStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask(value: WorkflowTaskReference): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimelineRecordId(value: String): Self = this.set("timelineRecordId", value.asInstanceOf[js.Any])
  }
  
}

