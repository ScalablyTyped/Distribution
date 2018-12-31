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

