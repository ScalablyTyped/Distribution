package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app memory usage at a single point in time. */
@JSGlobal("Windows.System.AppMemoryReport")
@js.native
abstract class AppMemoryReport () extends js.Object {
  /** Gets the app's peak usage of private commit. */
  var peakPrivateCommitUsage: scala.Double = js.native
  /** Gets the app's usage of private commit. */
  var privateCommitUsage: scala.Double = js.native
  /** Gets the app's total cap for private plus shared commit. */
  var totalCommitLimit: scala.Double = js.native
  /** Gets the app's total usage of private plus shared commit. */
  var totalCommitUsage: scala.Double = js.native
}

