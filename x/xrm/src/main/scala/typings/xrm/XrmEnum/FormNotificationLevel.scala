package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.ERROR
import typings.xrm.xrmStrings.INFO
import typings.xrm.xrmStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Form Notification Levels for {@link Ui.setFormNotification formContext.ui.setFormNotification()}.
  * @see {@link Xrm.FormNotificationLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.ERROR
  - typings.xrm.xrmStrings.INFO
  - typings.xrm.xrmStrings.WARNING
*/
trait FormNotificationLevel extends js.Object

object FormNotificationLevel {
  @scala.inline
  def Error: ERROR = this.cast("ERROR")
  @scala.inline
  def Info: INFO = this.cast("INFO")
  @scala.inline
  def Warning: WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

