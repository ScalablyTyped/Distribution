package typings
package winrtDashUwpLib.WindowsNs.SystemNs.ProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the device for profiling purposes. */
@JSGlobal("Windows.System.Profile.AnalyticsInfo")
@js.native
abstract class AnalyticsInfo () extends js.Object

/* static members */
@JSGlobal("Windows.System.Profile.AnalyticsInfo")
@js.native
object AnalyticsInfo extends js.Object {
  /** Gets the device form. */
  var deviceForm: java.lang.String = js.native
  /** Gets version info about the device family. */
  var versionInfo: winrtDashUwpLib.WindowsNs.SystemNs.ProfileNs.AnalyticsVersionInfo = js.native
}

