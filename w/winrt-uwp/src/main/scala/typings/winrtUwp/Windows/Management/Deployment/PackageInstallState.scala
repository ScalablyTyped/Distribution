package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageInstallState with Double] = js.native
  /* 2 */ @js.native
  object installed extends TopLevel[installed with Double]
  
  /* 0 */ @js.native
  object notInstalled extends TopLevel[notInstalled with Double]
  
  /* 3 */ @js.native
  object paused extends TopLevel[paused with Double]
  
  /* 1 */ @js.native
  object staged extends TopLevel[staged with Double]
  
}

