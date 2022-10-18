package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a package. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Package")
@js.native
open class Package ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Package {
  
  /** Gets the packages on which the current package depends. */
  /* CompleteClass */
  var dependencies: IVectorView[typings.winrtUwp.Windows.ApplicationModel.Package] = js.native
  
  /** Gets the description of the package. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Gets the display name of the package. */
  /* CompleteClass */
  var displayName: String = js.native
  
  /* CompleteClass */
  var getAppListEntriesAsync: Any = js.native
  
  /* unmapped type */
  /**
    * Windows Phone only. Returns a token that can be used to retrieve the thumbnail image associated with this application package.
    * @return A token that can be used to retrieve the thumbnail image associated with this application package.
    */
  /* CompleteClass */
  override def getThumbnailToken(): String = js.native
  
  /** Gets the package identity of the current package. */
  /* CompleteClass */
  var id: typings.winrtUwp.Windows.ApplicationModel.PackageId = js.native
  
  /** Windows Phone only. Gets the date the application package was installed on the user's phone. */
  /* CompleteClass */
  var installDate: js.Date = js.native
  
  /** Gets the date on which the application package was installed or last updated. */
  /* CompleteClass */
  var installedDate: js.Date = js.native
  
  /** Gets the location of the installed package. */
  /* CompleteClass */
  var installedLocation: StorageFolder = js.native
  
  /** Indicates whether the package is a bundle package. */
  /* CompleteClass */
  var isBundle: Boolean = js.native
  
  /** Indicates whether the package is installed in development mode. */
  /* CompleteClass */
  var isDevelopmentMode: Boolean = js.native
  
  /** Indicates whether other packages can declare a dependency on this package. */
  /* CompleteClass */
  var isFramework: Boolean = js.native
  
  /** Indicates whether the package is a resource package. */
  /* CompleteClass */
  var isResourcePackage: Boolean = js.native
  
  /**
    * Windows Phone only. Launches the specified application.
    * @param parameters The navigation URI that specifies the page to launch and optional parameters. Use an empty string to specify the default page for the app.
    */
  /* CompleteClass */
  override def launch(parameters: String): Unit = js.native
  
  /** Gets the logo of the package. */
  /* CompleteClass */
  var logo: Uri = js.native
  
  /** Gets the publisher display name of the package. */
  /* CompleteClass */
  var publisherDisplayName: String = js.native
  
  /* CompleteClass */
  var status: Any = js.native
}
object Package {
  
  @JSGlobal("Windows.ApplicationModel.Package")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the package for the current app. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Package.current")
  @js.native
  def current: typings.winrtUwp.Windows.ApplicationModel.Package = js.native
  inline def current_=(x: typings.winrtUwp.Windows.ApplicationModel.Package): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
}
