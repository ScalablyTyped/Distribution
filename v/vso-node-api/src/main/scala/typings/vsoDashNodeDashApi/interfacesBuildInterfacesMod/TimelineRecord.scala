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
    val __obj = js.Dynamic.literal(_links = _links, changeId = changeId, currentOperation = currentOperation, details = details, errorCount = errorCount, finishTime = finishTime, id = id, issues = issues, lastModified = lastModified, log = log, name = name, order = order, parentId = parentId, percentComplete = percentComplete, result = result, resultCode = resultCode, startTime = startTime, state = state, task = task, url = url, warningCount = warningCount, workerName = workerName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineRecord]
  }
}

