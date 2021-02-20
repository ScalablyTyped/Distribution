package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PackageStatus extends StObject
/** Provides info about the status of a package. */
@JSGlobal("Windows.Management.Deployment.PackageStatus")
@js.native
object PackageStatus extends StObject {
  
  /** The package is not available for use. It can still be serviced. */
  @js.native
  sealed trait disabled extends PackageStatus
  
  /** The license of the package is not valid. */
  @js.native
  sealed trait licenseIssue extends PackageStatus
  
  /** The package payload was modified by an unknown source. */
  @js.native
  sealed trait modified extends PackageStatus
  
  /** The package is usable. */
  @js.native
  sealed trait ok extends PackageStatus
  
  /** The package payload was tampered with intentionally. */
  @js.native
  sealed trait tampered extends PackageStatus
}
