package typings.winrtDashUwp.Windows.Management

import typings.winrtDashUwp.Windows.Storage.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Management.Core")
@js.native
object Core extends js.Object {
  /** Enables you to access and manage the app data store for a package family. */
  @js.native
  abstract class ApplicationDataManager () extends js.Object
  
  /* static members */
  @js.native
  object ApplicationDataManager extends js.Object {
    /**
      * Provides access to the app data store for the specified package family.
      * @param packageFamilyName The package family name.
      * @return The app data store.
      */
    def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
  }
  
}

