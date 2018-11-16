package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an application such as it name, logo, package information, ID. */
@JSGlobal("Windows.ApplicationModel.AppInfo")
@js.native
abstract class AppInfo () extends js.Object {
  /** An identifier that uniquely identifies the app. */
  var appUserModelId: java.lang.String = js.native
  /** Gets information that describes the application. */
  var displayInfo: AppDisplayInfo = js.native
  /** Gets the app identifier. */
  var id: java.lang.String = js.native
  /** An identifier that uniquely identifies the app's package. */
  var packageFamilyName: java.lang.String = js.native
}

