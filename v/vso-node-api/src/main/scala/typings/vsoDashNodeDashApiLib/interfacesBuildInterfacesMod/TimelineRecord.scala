package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRecord extends js.Object {
  var _links: js.Any
  /**
    * The change ID.
    */
  var changeId: scala.Double
  /**
    * A string that indicates the current operation.
    */
  var currentOperation: java.lang.String
  /**
    * A reference to a sub-timeline.
    */
  var details: TimelineReference
  /**
    * The number of errors produced by this operation.
    */
  var errorCount: scala.Double
  /**
    * The finish time.
    */
  var finishTime: stdLib.Date
  /**
    * The ID of the record.
    */
  var id: java.lang.String
  var issues: js.Array[Issue]
  /**
    * The time the record was last modified.
    */
  var lastModified: stdLib.Date
  /**
    * A reference to the log produced by this operation.
    */
  var log: BuildLogReference
  /**
    * The name.
    */
  var name: java.lang.String
  /**
    * An ordinal value relative to other records.
    */
  var order: scala.Double
  /**
    * The ID of the record's parent.
    */
  var parentId: java.lang.String
  /**
    * The current completion percentage.
    */
  var percentComplete: scala.Double
  /**
    * The result.
    */
  var result: TaskResult
  /**
    * The result code.
    */
  var resultCode: java.lang.String
  /**
    * The start time.
    */
  var startTime: stdLib.Date
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
  var `type`: java.lang.String
  /**
    * The REST URL of the timeline record.
    */
  var url: java.lang.String
  /**
    * The number of warnings produced by this operation.
    */
  var warningCount: scala.Double
  /**
    * The name of the agent running the operation.
    */
  var workerName: java.lang.String
}

object TimelineRecord {
  @scala.inline
  def apply(
    _links: js.Any,
    changeId: scala.Double,
    currentOperation: java.lang.String,
    details: TimelineReference,
    errorCount: scala.Double,
    finishTime: stdLib.Date,
    id: java.lang.String,
    issues: js.Array[Issue],
    lastModified: stdLib.Date,
    log: BuildLogReference,
    name: java.lang.String,
    order: scala.Double,
    parentId: java.lang.String,
    percentComplete: scala.Double,
    result: TaskResult,
    resultCode: java.lang.String,
    startTime: stdLib.Date,
    state: TimelineRecordState,
    task: TaskReference,
    `type`: java.lang.String,
    url: java.lang.String,
    warningCount: scala.Double,
    workerName: java.lang.String
  ): TimelineRecord = {
    val __obj = js.Dynamic.literal(_links = _links, changeId = changeId, currentOperation = currentOperation, details = details, errorCount = errorCount, finishTime = finishTime, id = id, issues = issues, lastModified = lastModified, log = log, name = name, order = order, parentId = parentId, percentComplete = percentComplete, result = result, resultCode = resultCode, startTime = startTime, state = state, task = task, url = url, warningCount = warningCount, workerName = workerName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineRecord]
  }
}

