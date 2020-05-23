package typings.winrt.Windows.Management.Deployment

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
  
}

