package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskLog extends TaskLogReference {
  var createdOn: stdLib.Date
  var indexLocation: java.lang.String
  var lastChangedOn: stdLib.Date
  var lineCount: scala.Double
  var path: java.lang.String
}

object TaskLog {
  @scala.inline
  def apply(
    createdOn: stdLib.Date,
    id: scala.Double,
    indexLocation: java.lang.String,
    lastChangedOn: stdLib.Date,
    lineCount: scala.Double,
    location: java.lang.String,
    path: java.lang.String
  ): TaskLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn, id = id, indexLocation = indexLocation, lastChangedOn = lastChangedOn, lineCount = lineCount, location = location, path = path)
  
    __obj.asInstanceOf[TaskLog]
  }
}

