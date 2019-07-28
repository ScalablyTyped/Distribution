package typings.winrtDashUwp.WindowsNs.ManagementNs.WorkplaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables Windows Store apps to access select enterprise settings that are managed through group policy or other management services. */
@JSGlobal("Windows.Management.Workplace.WorkplaceSettings")
@js.native
abstract class WorkplaceSettings () extends js.Object

/* static members */
@JSGlobal("Windows.Management.Workplace.WorkplaceSettings")
@js.native
object WorkplaceSettings extends js.Object {
  /** Gets a value that indicates whether an enterprise ID can be used instead of a Microsoft account. */
  var isMicrosoftAccountOptional: Boolean = js.native
}

