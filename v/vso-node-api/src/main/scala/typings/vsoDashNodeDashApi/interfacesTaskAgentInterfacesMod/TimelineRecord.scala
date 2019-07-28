package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRecord extends js.Object {
  var changeId: Double
  var currentOperation: String
  var details: TimelineReference
  var errorCount: Double
  var finishTime: Date
  var id: String
  var issues: js.Array[Issue]
  var lastModified: Date
  var location: String
  var log: TaskLogReference
  var name: String
  var order: Double
  var parentId: String
  var percentComplete: Double
  var result: TaskResult
  var resultCode: String
  var startTime: Date
  var state: TimelineRecordState
  var task: TaskReference
  var `type`: String
  var warningCount: Double
  var workerName: String
}

object TimelineRecord {
  @scala.inline
  def apply(
    changeId: Double,
    currentOperation: String,
    details: TimelineReference,
    errorCount: Double,
    finishTime: Date,
    id: String,
    issues: js.Array[Issue],
    lastModified: Date,
    location: String,
    log: TaskLogReference,
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
    warningCount: Double,
    workerName: String
  ): TimelineRecord = {
    val __obj = js.Dynamic.literal(changeId = changeId, currentOperation = currentOperation, details = details, errorCount = errorCount, finishTime = finishTime, id = id, issues = issues, lastModified = lastModified, location = location, log = log, name = name, order = order, parentId = parentId, percentComplete = percentComplete, result = result, resultCode = resultCode, startTime = startTime, state = state, task = task, warningCount = warningCount, workerName = workerName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineRecord]
  }
}

