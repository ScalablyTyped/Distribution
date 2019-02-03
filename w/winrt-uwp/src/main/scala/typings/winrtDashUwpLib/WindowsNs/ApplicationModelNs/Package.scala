package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a package. */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
abstract class Package () extends js.Object {
  /** Gets the packages on which the current package depends. */
  var dependencies: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Package] = js.native
  /** Gets the description of the package. */
  var description: java.lang.String = js.native
  /** Gets the display name of the package. */
  var displayName: java.lang.String = js.native
  var getAppListEntriesAsync: js.Any = js.native
  /** Gets the package identity of the current package. */
  var id: PackageId = js.native
  /** Windows Phone only. Gets the date the application package was installed on the user's phone. */
  var installDate: stdLib.Date = js.native
  /** Gets the date on which the application package was installed or last updated. */
  var installedDate: stdLib.Date = js.native
  /** Gets the location of the installed package. */
  var installedLocation: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Indicates whether the package is a bundle package. */
  var isBundle: scala.Boolean = js.native
  /** Indicates whether the package is installed in development mode. */
  var isDevelopmentMode: scala.Boolean = js.native
  /** Indicates whether other packages can declare a dependency on this package. */
  var isFramework: scala.Boolean = js.native
  /** Indicates whether the package is a resource package. */
  var isResourcePackage: scala.Boolean = js.native
  /** Gets the logo of the package. */
  var logo: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the publisher display name of the package. */
  var publisherDisplayName: java.lang.String = js.native
  var status: js.Any = js.native
   /* unmapped type */ /**
    * Windows Phone only. Returns a token that can be used to retrieve the thumbnail image associated with this application package.
    * @return A token that can be used to retrieve the thumbnail image associated with this application package.
    */
  def getThumbnailToken(): java.lang.String = js.native
  /**
    * Windows Phone only. Launches the specified application.
    * @param parameters The navigation URI that specifies the page to launch and optional parameters. Use an empty string to specify the default page for the app.
    */
  def launch(parameters: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
object Package extends js.Object {
  /** Gets the package for the current app. */
  var current: winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package = js.native
}

