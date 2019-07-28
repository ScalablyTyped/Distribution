package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskLog extends TaskLogReference {
  var createdOn: Date
  var indexLocation: String
  var lastChangedOn: Date
  var lineCount: Double
  var path: String
}

object TaskLog {
  @scala.inline
  def apply(
    createdOn: Date,
    id: Double,
    indexLocation: String,
    lastChangedOn: Date,
    lineCount: Double,
    location: String,
    path: String
  ): TaskLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn, id = id, indexLocation = indexLocation, lastChangedOn = lastChangedOn, lineCount = lineCount, location = location, path = path)
  
    __obj.asInstanceOf[TaskLog]
  }
}

