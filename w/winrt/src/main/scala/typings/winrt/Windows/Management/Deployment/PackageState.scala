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
  
  /* 1 */ val licenseInvalid: typings.winrt.Windows.Management.Deployment.PackageState.licenseInvalid with Double = js.native
  /* 2 */ val modified: typings.winrt.Windows.Management.Deployment.PackageState.modified with Double = js.native
  /* 0 */ val normal: typings.winrt.Windows.Management.Deployment.PackageState.normal with Double = js.native
  /* 3 */ val tampered: typings.winrt.Windows.Management.Deployment.PackageState.tampered with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageState with Double] = js.native
}

