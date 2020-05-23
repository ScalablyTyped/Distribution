package typings.winrtUwp.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an application such as it name, logo, package information, ID. */
@JSGlobal("Windows.ApplicationModel.AppInfo")
@js.native
abstract class AppInfo ()
  extends typings.winrtUwp.Windows.ApplicationModel.AppInfo {
  /** An identifier that uniquely identifies the app. */
  /* CompleteClass */
  override var appUserModelId: String = js.native
  /** Gets information that describes the application. */
  /* CompleteClass */
  override var displayInfo: typings.winrtUwp.Windows.ApplicationModel.AppDisplayInfo = js.native
  /** Gets the app identifier. */
  /* CompleteClass */
  override var id: String = js.native
  /** An identifier that uniquely identifies the app's package. */
  /* CompleteClass */
  override var packageFamilyName: String = js.native
}

