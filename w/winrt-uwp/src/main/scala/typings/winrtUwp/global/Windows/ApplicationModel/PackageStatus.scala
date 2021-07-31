package typings.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the status of the package. */
@JSGlobal("Windows.ApplicationModel.PackageStatus")
@js.native
abstract class PackageStatus ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.PackageStatus {
  
  /** Indicates whether the data for the package is offline. */
  /* CompleteClass */
  var dataOffline: Boolean = js.native
  
  /** Indicates whether this package depends on a package that can't be used. */
  /* CompleteClass */
  var dependencyIssue: Boolean = js.native
  
  /** Indicates whether the package is being serviced. */
  /* CompleteClass */
  var deploymentInProgress: Boolean = js.native
  
  /** Indicates whether the package has been disabled. */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /** Indicates whether there is a problem with the license for this package. */
  /* CompleteClass */
  var licenseIssue: Boolean = js.native
  
  /** Indicates whether the package is missing files, system information, etc. */
  /* CompleteClass */
  var modified: Boolean = js.native
  
  /** Indicates whether the package is unusable. */
  /* CompleteClass */
  var needsRemediation: Boolean = js.native
  
  /** Indicates whether the package is available. */
  /* CompleteClass */
  var notAvailable: Boolean = js.native
  
  /** Indicates whether the package is offline and cannot be used. */
  /* CompleteClass */
  var packageOffline: Boolean = js.native
  
  /** Indicates whether the package is being serviced. */
  /* CompleteClass */
  var servicing: Boolean = js.native
  
  /** Indicates whether the package may have been tampered with. */
  /* CompleteClass */
  var tampered: Boolean = js.native
  
  /**
    * Indicates whether the package is in good condition and may be used.
    * @return TRUE indicates that the package is in good condition; otherwise FALSE.
    */
  /* CompleteClass */
  override def verifyIsOK(): Boolean = js.native
}
