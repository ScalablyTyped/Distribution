package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineRecord extends js.Object {
  var _links: js.Any = js.native
  /**
    * The change ID.
    */
  var changeId: Double = js.native
  /**
    * A string that indicates the current operation.
    */
  var currentOperation: String = js.native
  /**
    * A reference to a sub-timeline.
    */
  var details: TimelineReference = js.native
  /**
    * The number of errors produced by this operation.
    */
  var errorCount: Double = js.native
  /**
    * The finish time.
    */
  var finishTime: Date = js.native
  /**
    * The ID of the record.
    */
  var id: String = js.native
  var issues: js.Array[Issue] = js.native
  /**
    * The time the record was last modified.
    */
  var lastModified: Date = js.native
  /**
    * A reference to the log produced by this operation.
    */
  var log: BuildLogReference = js.native
  /**
    * The name.
    */
  var name: String = js.native
  /**
    * An ordinal value relative to other records.
    */
  var order: Double = js.native
  /**
    * The ID of the record's parent.
    */
  var parentId: String = js.native
  /**
    * The current completion percentage.
    */
  var percentComplete: Double = js.native
  /**
    * The result.
    */
  var result: TaskResult = js.native
  /**
    * The result code.
    */
  var resultCode: String = js.native
  /**
    * The start time.
    */
  var startTime: Date = js.native
  /**
    * The state of the record.
    */
  var state: TimelineRecordState = js.native
  /**
    * A reference to the task represented by this timeline record.
    */
  var task: TaskReference = js.native
  /**
    * The type of the record.
    */
  var `type`: String = js.native
  /**
    * The REST URL of the timeline record.
    */
  var url: String = js.native
  /**
    * The number of warnings produced by this operation.
    */
  var warningCount: Double = js.native
  /**
    * The name of the agent running the operation.
    */
  var workerName: String = js.native
}

object TimelineRecord {
  @scala.inline
  def apply(
    _links: js.Any,
    changeId: Double,
    currentOperation: String,
    details: TimelineReference,
    errorCount: Double,
    finishTime: Date,
    id: String,
    issues: js.Array[Issue],
    lastModified: Date,
    log: BuildLogReference,
    name: String,
    order: Double,
    parentId: String,
    percentComplete: Double,
    result: TaskResult,
    resultCode: String,
    startTime: Date,
    state: TimelineRecordState,
    task: TaskReference,
    `type`: String,
    url: String,
    warningCount: Double,
    workerName: String
  ): TimelineRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], changeId = changeId.asInstanceOf[js.Any], currentOperation = currentOperation.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any], workerName = workerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRecord]
  }
  @scala.inline
  implicit class TimelineRecordOps[Self <: TimelineRecord] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeId(value: Double): Self = this.set("changeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentOperation(value: String): Self = this.set("currentOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: TimelineReference): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishTime(value: Date): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = this.set("issues", js.Array(value :_*))
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = this.set("issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModified(value: Date): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: BuildLogReference): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: TaskResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultCode(value: String): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: TimelineRecordState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask(value: TaskReference): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningCount(value: Double): Self = this.set("warningCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkerName(value: String): Self = this.set("workerName", value.asInstanceOf[js.Any])
  }
  
}

