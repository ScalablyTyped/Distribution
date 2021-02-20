package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PackageInstallState extends StObject
/** Represents the install state of the package. */
@JSGlobal("Windows.Management.Deployment.PackageInstallState")
@js.native
object PackageInstallState extends StObject {
  
  /** The package is ready for use. */
  @js.native
  sealed trait installed extends PackageInstallState
  
  /** The package has not been installed. */
  @js.native
  sealed trait notInstalled extends PackageInstallState
  
  /** The installation of the package has been paused. */
  @js.native
  sealed trait paused extends PackageInstallState
  
  /** The package has been downloaded. */
  @js.native
  sealed trait staged extends PackageInstallState
}
