package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Form Notification Levels for {@link Ui.setFormNotification formContext.ui.setFormNotification()}.
  * @see {@link Xrm.FormNotificationLevel}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.ERROR
  - xrmLib.xrmLibStrings.INFO
  - xrmLib.xrmLibStrings.WARNING
*/
trait FormNotificationLevel extends js.Object

object FormNotificationLevel {
  @scala.inline
  def Error: xrmLib.xrmLibStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def Info: xrmLib.xrmLibStrings.INFO = this.cast("INFO")
  @scala.inline
  def Warning: xrmLib.xrmLibStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

