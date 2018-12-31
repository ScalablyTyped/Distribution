package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormNotificationLevel extends js.Object

/**
  * Constant Enum: Form Notification Levels for {@link Ui.setFormNotification formContext.ui.setFormNotification()}.
  * @see {@link Xrm.FormNotificationLevel}
  */
@JSGlobal("XrmEnum.FormNotificationLevel")
@js.native
object FormNotificationLevel extends js.Object {
  @js.native
  sealed trait Error
    extends xrmLib.XrmEnumNs.FormNotificationLevel
  
  @js.native
  sealed trait Info
    extends xrmLib.XrmEnumNs.FormNotificationLevel
  
  @js.native
  sealed trait Warning
    extends xrmLib.XrmEnumNs.FormNotificationLevel
  
  /* "ERROR" */ val Error: Error with java.lang.String = js.native
  /* "INFO" */ val Info: Info with java.lang.String = js.native
  /* "WARNING" */ val Warning: Warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.FormNotificationLevel with java.lang.String] = js.native
}

