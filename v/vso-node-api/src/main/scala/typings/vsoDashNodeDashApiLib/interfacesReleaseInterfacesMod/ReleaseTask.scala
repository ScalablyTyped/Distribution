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

