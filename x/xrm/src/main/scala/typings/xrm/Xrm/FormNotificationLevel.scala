package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Form Notification Levels for {@link Ui.setFormNotification formContext.ui.setFormNotification()}.
  * @see {@link XrmEnum.FormNotificationLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.ERROR
  - typings.xrm.xrmStrings.INFO
  - typings.xrm.xrmStrings.WARNING
*/
trait FormNotificationLevel extends js.Object

object FormNotificationLevel {
  @scala.inline
  def ERROR: typings.xrm.xrmStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typings.xrm.xrmStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARNING: typings.xrm.xrmStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

