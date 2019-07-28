package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildLog extends BuildLogReference {
  /**
    * The date and time the log was created.
    */
  var createdOn: Date
  /**
    * The date and time the log was last changed.
    */
  var lastChangedOn: Date
  /**
    * The number of lines in the log.
    */
  var lineCount: Double
}

object BuildLog {
  @scala.inline
  def apply(createdOn: Date, id: Double, lastChangedOn: Date, lineCount: Double, `type`: String, url: String): BuildLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn, id = id, lastChangedOn = lastChangedOn, lineCount = lineCount, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildLog]
  }
}

