package typings.winrtUwp.Windows.System.Profile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides version information about the device family. */
trait AnalyticsVersionInfo extends js.Object {
  /** Gets the device family. */
  var deviceFamily: String
  /** Gets the version within the device family. */
  var deviceFamilyVersion: String
}

object AnalyticsVersionInfo {
  @scala.inline
  def apply(deviceFamily: String, deviceFamilyVersion: String): AnalyticsVersionInfo = {
    val __obj = js.Dynamic.literal(deviceFamily = deviceFamily.asInstanceOf[js.Any], deviceFamilyVersion = deviceFamilyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsVersionInfo]
  }
}

