package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildLog extends BuildLogReference {
  /**
    * The date and time the log was created.
    */
  var createdOn: stdLib.Date
  /**
    * The date and time the log was last changed.
    */
  var lastChangedOn: stdLib.Date
  /**
    * The number of lines in the log.
    */
  var lineCount: scala.Double
}

object BuildLog {
  @scala.inline
  def apply(
    createdOn: stdLib.Date,
    id: scala.Double,
    lastChangedOn: stdLib.Date,
    lineCount: scala.Double,
    `type`: java.lang.String,
    url: java.lang.String
  ): BuildLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn, id = id, lastChangedOn = lastChangedOn, lineCount = lineCount, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildLog]
  }
}

