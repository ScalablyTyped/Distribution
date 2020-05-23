package typings.winrtUwp.Windows.ApplicationModel

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a package. */
trait Package extends js.Object {
  /** Gets the packages on which the current package depends. */
  var dependencies: IVectorView[Package]
  /** Gets the description of the package. */
  var description: String
  /** Gets the display name of the package. */
  var displayName: String
  var getAppListEntriesAsync: js.Any
  /** Gets the package identity of the current package. */
  var id: PackageId
  /** Windows Phone only. Gets the date the application package was installed on the user's phone. */
  var installDate: Date
  /** Gets the date on which the application package was installed or last updated. */
  var installedDate: Date
  /** Gets the location of the installed package. */
  var installedLocation: StorageFolder
  /** Indicates whether the package is a bundle package. */
  var isBundle: Boolean
  /** Indicates whether the package is installed in development mode. */
  var isDevelopmentMode: Boolean
  /** Indicates whether other packages can declare a dependency on this package. */
  var isFramework: Boolean
  /** Indicates whether the package is a resource package. */
  var isResourcePackage: Boolean
  /** Gets the logo of the package. */
  var logo: Uri
  /** Gets the publisher display name of the package. */
  var publisherDisplayName: String
  var status: js.Any
   /* unmapped type */ /**
    * Windows Phone only. Returns a token that can be used to retrieve the thumbnail image associated with this application package.
    * @return A token that can be used to retrieve the thumbnail image associated with this application package.
    */
  def getThumbnailToken(): String
  /**
    * Windows Phone only. Launches the specified application.
    * @param parameters The navigation URI that specifies the page to launch and optional parameters. Use an empty string to specify the default page for the app.
    */
  def launch(parameters: String): Unit
}

object Package {
  @scala.inline
  def apply(
    dependencies: IVectorView[Package],
    description: String,
    displayName: String,
    getAppListEntriesAsync: js.Any,
    getThumbnailToken: () => String,
    id: PackageId,
    installDate: Date,
    installedDate: Date,
    installedLocation: StorageFolder,
    isBundle: Boolean,
    isDevelopmentMode: Boolean,
    isFramework: Boolean,
    isResourcePackage: Boolean,
    launch: String => Unit,
    logo: Uri,
    publisherDisplayName: String,
    status: js.Any
  ): Package = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getAppListEntriesAsync = getAppListEntriesAsync.asInstanceOf[js.Any], getThumbnailToken = js.Any.fromFunction0(getThumbnailToken), id = id.asInstanceOf[js.Any], installDate = installDate.asInstanceOf[js.Any], installedDate = installedDate.asInstanceOf[js.Any], installedLocation = installedLocation.asInstanceOf[js.Any], isBundle = isBundle.asInstanceOf[js.Any], isDevelopmentMode = isDevelopmentMode.asInstanceOf[js.Any], isFramework = isFramework.asInstanceOf[js.Any], isResourcePackage = isResourcePackage.asInstanceOf[js.Any], launch = js.Any.fromFunction1(launch), logo = logo.asInstanceOf[js.Any], publisherDisplayName = publisherDisplayName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}

