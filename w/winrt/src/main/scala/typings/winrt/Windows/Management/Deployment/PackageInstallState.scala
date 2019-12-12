package typings.winrt.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Management.Deployment.PackageInstallState.installed
import typings.winrt.Windows.Management.Deployment.PackageInstallState.notInstalled
import typings.winrt.Windows.Management.Deployment.PackageInstallState.staged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageInstallState extends js.Object

@JSGlobal("Windows.Management.Deployment.PackageInstallState")
@js.native
object PackageInstallState extends js.Object {
  @js.native
  sealed trait installed extends PackageInstallState
  
  @js.native
  sealed trait notInstalled extends PackageInstallState
  
  @js.native
  sealed trait staged extends PackageInstallState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageInstallState with Double] = js.native
  /* 2 */ @js.native
  object installed extends TopLevel[installed with Double]
  
  /* 0 */ @js.native
  object notInstalled extends TopLevel[notInstalled with Double]
  
  /* 1 */ @js.native
  object staged extends TopLevel[staged with Double]
  
}

