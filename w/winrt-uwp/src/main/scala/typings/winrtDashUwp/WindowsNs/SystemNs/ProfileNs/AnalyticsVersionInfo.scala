package typings.winrtDashUwp.WindowsNs.SystemNs.ProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides version information about the device family. */
@JSGlobal("Windows.System.Profile.AnalyticsVersionInfo")
@js.native
abstract class AnalyticsVersionInfo () extends js.Object {
  /** Gets the device family. */
  var deviceFamily: String = js.native
  /** Gets the version within the device family. */
  var deviceFamilyVersion: String = js.native
}

