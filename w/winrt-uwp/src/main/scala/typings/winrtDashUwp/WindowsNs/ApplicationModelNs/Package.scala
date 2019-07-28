package typings.winrtDashUwp.WindowsNs.ApplicationModelNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.StorageNs.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a package. */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
abstract class Package () extends js.Object {
  /** Gets the packages on which the current package depends. */
  var dependencies: IVectorView[Package] = js.native
  /** Gets the description of the package. */
  var description: String = js.native
  /** Gets the display name of the package. */
  var displayName: String = js.native
  var getAppListEntriesAsync: js.Any = js.native
  /** Gets the package identity of the current package. */
  var id: PackageId = js.native
  /** Windows Phone only. Gets the date the application package was installed on the user's phone. */
  var installDate: Date = js.native
  /** Gets the date on which the application package was installed or last updated. */
  var installedDate: Date = js.native
  /** Gets the location of the installed package. */
  var installedLocation: StorageFolder = js.native
  /** Indicates whether the package is a bundle package. */
  var isBundle: Boolean = js.native
  /** Indicates whether the package is installed in development mode. */
  var isDevelopmentMode: Boolean = js.native
  /** Indicates whether other packages can declare a dependency on this package. */
  var isFramework: Boolean = js.native
  /** Indicates whether the package is a resource package. */
  var isResourcePackage: Boolean = js.native
  /** Gets the logo of the package. */
  var logo: Uri = js.native
  /** Gets the publisher display name of the package. */
  var publisherDisplayName: String = js.native
  var status: js.Any = js.native
   /* unmapped type */ /**
    * Windows Phone only. Returns a token that can be used to retrieve the thumbnail image associated with this application package.
    * @return A token that can be used to retrieve the thumbnail image associated with this application package.
    */
  def getThumbnailToken(): String = js.native
  /**
    * Windows Phone only. Launches the specified application.
    * @param parameters The navigation URI that specifies the page to launch and optional parameters. Use an empty string to specify the default page for the app.
    */
  def launch(parameters: String): Unit = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
object Package extends js.Object {
  /** Gets the package for the current app. */
  var current: Package = js.native
}

