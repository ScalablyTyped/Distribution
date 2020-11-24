package typings.winrtUwp.global.Windows.Management

import typings.winrtUwp.Windows.Storage.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Management.Core")
@js.native
object Core extends js.Object {
  
  /** Enables you to access and manage the app data store for a package family. */
  @js.native
  abstract class ApplicationDataManager ()
    extends typings.winrtUwp.Windows.Management.Core.ApplicationDataManager
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
