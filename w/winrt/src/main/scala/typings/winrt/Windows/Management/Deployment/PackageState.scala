package typings.winrt.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageState extends js.Object

@JSGlobal("Windows.Management.Deployment.PackageState")
@js.native
object PackageState extends js.Object {
  @js.native
  sealed trait licenseInvalid extends PackageState
  
  @js.native
  sealed trait modified extends PackageState
  
  @js.native
  sealed trait normal extends PackageState
  
  @js.native
  sealed trait tampered extends PackageState
  
}

