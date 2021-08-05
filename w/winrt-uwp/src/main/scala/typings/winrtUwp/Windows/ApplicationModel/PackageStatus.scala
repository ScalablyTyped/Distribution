package typings.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the status of the package. */
trait PackageStatus extends StObject {
  
  /** Indicates whether the data for the package is offline. */
  var dataOffline: Boolean
  
  /** Indicates whether this package depends on a package that can't be used. */
  var dependencyIssue: Boolean
  
  /** Indicates whether the package is being serviced. */
  var deploymentInProgress: Boolean
  
  /** Indicates whether the package has been disabled. */
  var disabled: Boolean
  
  /** Indicates whether there is a problem with the license for this package. */
  var licenseIssue: Boolean
  
  /** Indicates whether the package is missing files, system information, etc. */
  var modified: Boolean
  
  /** Indicates whether the package is unusable. */
  var needsRemediation: Boolean
  
  /** Indicates whether the package is available. */
  var notAvailable: Boolean
  
  /** Indicates whether the package is offline and cannot be used. */
  var packageOffline: Boolean
  
  /** Indicates whether the package is being serviced. */
  var servicing: Boolean
  
  /** Indicates whether the package may have been tampered with. */
  var tampered: Boolean
  
  /**
    * Indicates whether the package is in good condition and may be used.
    * @return TRUE indicates that the package is in good condition; otherwise FALSE.
    */
  def verifyIsOK(): Boolean
}
object PackageStatus {
  
  inline def apply(
    dataOffline: Boolean,
    dependencyIssue: Boolean,
    deploymentInProgress: Boolean,
    disabled: Boolean,
    licenseIssue: Boolean,
    modified: Boolean,
    needsRemediation: Boolean,
    notAvailable: Boolean,
    packageOffline: Boolean,
    servicing: Boolean,
    tampered: Boolean,
    verifyIsOK: () => Boolean
  ): PackageStatus = {
    val __obj = js.Dynamic.literal(dataOffline = dataOffline.asInstanceOf[js.Any], dependencyIssue = dependencyIssue.asInstanceOf[js.Any], deploymentInProgress = deploymentInProgress.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], licenseIssue = licenseIssue.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], needsRemediation = needsRemediation.asInstanceOf[js.Any], notAvailable = notAvailable.asInstanceOf[js.Any], packageOffline = packageOffline.asInstanceOf[js.Any], servicing = servicing.asInstanceOf[js.Any], tampered = tampered.asInstanceOf[js.Any], verifyIsOK = js.Any.fromFunction0(verifyIsOK))
    __obj.asInstanceOf[PackageStatus]
  }
  
  extension [Self <: PackageStatus](x: Self) {
    
    inline def setDataOffline(value: Boolean): Self = StObject.set(x, "dataOffline", value.asInstanceOf[js.Any])
    
    inline def setDependencyIssue(value: Boolean): Self = StObject.set(x, "dependencyIssue", value.asInstanceOf[js.Any])
    
    inline def setDeploymentInProgress(value: Boolean): Self = StObject.set(x, "deploymentInProgress", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setLicenseIssue(value: Boolean): Self = StObject.set(x, "licenseIssue", value.asInstanceOf[js.Any])
    
    inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setNeedsRemediation(value: Boolean): Self = StObject.set(x, "needsRemediation", value.asInstanceOf[js.Any])
    
    inline def setNotAvailable(value: Boolean): Self = StObject.set(x, "notAvailable", value.asInstanceOf[js.Any])
    
    inline def setPackageOffline(value: Boolean): Self = StObject.set(x, "packageOffline", value.asInstanceOf[js.Any])
    
    inline def setServicing(value: Boolean): Self = StObject.set(x, "servicing", value.asInstanceOf[js.Any])
    
    inline def setTampered(value: Boolean): Self = StObject.set(x, "tampered", value.asInstanceOf[js.Any])
    
    inline def setVerifyIsOK(value: () => Boolean): Self = StObject.set(x, "verifyIsOK", js.Any.fromFunction0(value))
  }
}
