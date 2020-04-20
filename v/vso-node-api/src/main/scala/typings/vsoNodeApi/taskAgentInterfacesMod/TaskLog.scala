package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indexLocation = indexLocation.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskLog]
  }
}

