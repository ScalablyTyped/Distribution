package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRecord extends js.Object {
  var changeId: scala.Double
  var currentOperation: java.lang.String
  var details: TimelineReference
  var errorCount: scala.Double
  var finishTime: stdLib.Date
  var id: java.lang.String
  var issues: js.Array[Issue]
  var lastModified: stdLib.Date
  var location: java.lang.String
  var log: TaskLogReference
  var name: java.lang.String
  var order: scala.Double
  var parentId: java.lang.String
  var percentComplete: scala.Double
  var result: TaskResult
  var resultCode: java.lang.String
  var startTime: stdLib.Date
  var state: TimelineRecordState
  var task: TaskReference
  var `type`: java.lang.String
  var warningCount: scala.Double
  var workerName: java.lang.String
}

object TimelineRecord {
  @scala.inline
  def apply(
    changeId: scala.Double,
    currentOperation: java.lang.String,
    details: TimelineReference,
    errorCount: scala.Double,
    finishTime: stdLib.Date,
    id: java.lang.String,
    issues: js.Array[Issue],
    lastModified: stdLib.Date,
    location: java.lang.String,
    log: TaskLogReference,
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
    warningCount: scala.Double,
    workerName: java.lang.String
  ): TimelineRecord = {
    val __obj = js.Dynamic.literal(changeId = changeId, currentOperation = currentOperation, details = details, errorCount = errorCount, finishTime = finishTime, id = id, issues = issues, lastModified = lastModified, location = location, log = log, name = name, order = order, parentId = parentId, percentComplete = percentComplete, result = result, resultCode = resultCode, startTime = startTime, state = state, task = task, warningCount = warningCount, workerName = workerName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineRecord]
  }
}

