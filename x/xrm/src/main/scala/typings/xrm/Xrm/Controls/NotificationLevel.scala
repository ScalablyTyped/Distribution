package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants to use with the addNotification method of form controls
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.ERROR
  - typings.xrm.xrmStrings.RECOMMENDATION
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  def ERROR: typings.xrm.xrmStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def RECOMMENDATION: typings.xrm.xrmStrings.RECOMMENDATION = this.cast("RECOMMENDATION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

