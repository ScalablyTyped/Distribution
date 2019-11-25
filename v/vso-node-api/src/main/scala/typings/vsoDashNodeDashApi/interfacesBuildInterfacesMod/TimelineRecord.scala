package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRecord extends js.Object {
  var _links: js.Any
  /**
    * The change ID.
    */
  var changeId: Double
  /**
    * A string that indicates the current operation.
    */
  var currentOperation: String
  /**
    * A reference to a sub-timeline.
    */
  var details: TimelineReference
  /**
    * The number of errors produced by this operation.
    */
  var errorCount: Double
  /**
    * The finish time.
    */
  var finishTime: Date
  /**
    * The ID of the record.
    */
  var id: String
  var issues: js.Array[Issue]
  /**
    * The time the record was last modified.
    */
  var lastModified: Date
  /**
    * A reference to the log produced by this operation.
    */
  var log: BuildLogReference
  /**
    * The name.
    */
  var name: String
  /**
    * An ordinal value relative to other records.
    */
  var order: Double
  /**
    * The ID of the record's parent.
    */
  var parentId: String
  /**
    * The current completion percentage.
    */
  var percentComplete: Double
  /**
    * The result.
    */
  var result: TaskResult
  /**
    * The result code.
    */
  var resultCode: String
  /**
    * The start time.
    */
  var startTime: Date
  /**
    * The state of the record.
    */
  var state: TimelineRecordState
  /**
    * A reference to the task represented by this timeline record.
    */
  var task: TaskReference
  /**
    * The type of the record.
    */
  var `type`: String
  /**
    * The REST URL of the timeline record.
    */
  var url: String
  /**
    * The number of warnings produced by this operation.
    */
  var warningCount: Double
  /**
    * The name of the agent running the operation.
    */
  var workerName: String
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
}

