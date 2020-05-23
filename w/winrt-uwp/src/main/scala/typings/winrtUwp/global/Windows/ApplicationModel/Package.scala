package typings.winrtUwp.global.Windows.ApplicationModel

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a package. */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
abstract class Package ()
  extends typings.winrtUwp.Windows.ApplicationModel.Package {
  /** Gets the packages on which the current package depends. */
  /* CompleteClass */
  override var dependencies: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Package] = js.native
  /** Gets the description of the package. */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets the display name of the package. */
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var getAppListEntriesAsync: js.Any = js.native
  /** Gets the package identity of the current package. */
  /* CompleteClass */
  override var id: typings.winrtUwp.Windows.ApplicationModel.PackageId = js.native
  /** Windows Phone only. Gets the date the application package was installed on the user's phone. */
  /* CompleteClass */
  override var installDate: Date = js.native
  /** Gets the date on which the application package was installed or last updated. */
  /* CompleteClass */
  override var installedDate: Date = js.native
  /** Gets the location of the installed package. */
  /* CompleteClass */
  override var installedLocation: StorageFolder = js.native
  /** Indicates whether the package is a bundle package. */
  /* CompleteClass */
  override var isBundle: Boolean = js.native
  /** Indicates whether the package is installed in development mode. */
  /* CompleteClass */
  override var isDevelopmentMode: Boolean = js.native
  /** Indicates whether other packages can declare a dependency on this package. */
  /* CompleteClass */
  override var isFramework: Boolean = js.native
  /** Indicates whether the package is a resource package. */
  /* CompleteClass */
  override var isResourcePackage: Boolean = js.native
  /** Gets the logo of the package. */
  /* CompleteClass */
  override var logo: Uri = js.native
  /** Gets the publisher display name of the package. */
  /* CompleteClass */
  override var publisherDisplayName: String = js.native
  /* CompleteClass */
  override var status: js.Any = js.native
   /* unmapped type */ /**
    * Windows Phone only. Returns a token that can be used to retrieve the thumbnail image associated with this application package.
    * @return A token that can be used to retrieve the thumbnail image associated with this application package.
    */
  /* CompleteClass */
  override def getThumbnailToken(): String = js.native
  /**
    * Windows Phone only. Launches the specified application.
    * @param parameters The navigation URI that specifies the page to launch and optional parameters. Use an empty string to specify the default page for the app.
    */
  /* CompleteClass */
  override def launch(parameters: String): Unit = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
object Package extends js.Object {
  /** Gets the package for the current app. */
  var current: typings.winrtUwp.Windows.ApplicationModel.Package = js.native
}

