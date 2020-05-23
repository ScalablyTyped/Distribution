package typings.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an application such as it name, logo, package information, ID. */
trait AppInfo extends js.Object {
  /** An identifier that uniquely identifies the app. */
  var appUserModelId: String
  /** Gets information that describes the application. */
  var displayInfo: AppDisplayInfo
  /** Gets the app identifier. */
  var id: String
  /** An identifier that uniquely identifies the app's package. */
  var packageFamilyName: String
}

object AppInfo {
  @scala.inline
  def apply(appUserModelId: String, displayInfo: AppDisplayInfo, id: String, packageFamilyName: String): AppInfo = {
    val __obj = js.Dynamic.literal(appUserModelId = appUserModelId.asInstanceOf[js.Any], displayInfo = displayInfo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], packageFamilyName = packageFamilyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInfo]
  }
}

