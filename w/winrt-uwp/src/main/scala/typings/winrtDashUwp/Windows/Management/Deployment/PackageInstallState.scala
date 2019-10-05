package typings.winrtDashUwp.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageInstallState extends js.Object

/** Represents the install state of the package. */
@JSGlobal("Windows.Management.Deployment.PackageInstallState")
@js.native
object PackageInstallState extends js.Object {
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
  
  /* 2 */ val installed: typings.winrtDashUwp.Windows.Management.Deployment.PackageInstallState.installed with Double = js.native
  /* 0 */ val notInstalled: typings.winrtDashUwp.Windows.Management.Deployment.PackageInstallState.notInstalled with Double = js.native
  /* 3 */ val paused: typings.winrtDashUwp.Windows.Management.Deployment.PackageInstallState.paused with Double = js.native
  /* 1 */ val staged: typings.winrtDashUwp.Windows.Management.Deployment.PackageInstallState.staged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageInstallState with Double] = js.native
}

