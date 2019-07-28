package typings.winrtDashUwp.WindowsNs.ManagementNs.CoreNs

import typings.winrtDashUwp.WindowsNs.StorageNs.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to access and manage the app data store for a package family. */
@JSGlobal("Windows.Management.Core.ApplicationDataManager")
@js.native
abstract class ApplicationDataManager () extends js.Object

/* static members */
@JSGlobal("Windows.Management.Core.ApplicationDataManager")
@js.native
object ApplicationDataManager extends js.Object {
  /**
    * Provides access to the app data store for the specified package family.
    * @param packageFamilyName The package family name.
    * @return The app data store.
    */
  def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
}

