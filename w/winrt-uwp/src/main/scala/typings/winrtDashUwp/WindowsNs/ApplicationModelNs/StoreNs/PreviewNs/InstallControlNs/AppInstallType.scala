package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstallType extends js.Object

/** Defines the different app install types that are returned by the InstallType property of the AppInstallItem class. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType")
@js.native
object AppInstallType extends js.Object {
  /** The app is being installed. */
  @js.native
  sealed trait install extends AppInstallType
  
  /** The app installation is being repaired. */
  @js.native
  sealed trait repair extends AppInstallType
  
  /** The app is being updated. */
  @js.native
  sealed trait update extends AppInstallType
  
  /* 0 */ val install: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallType.install with Double = js.native
  /* 2 */ val repair: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallType.repair with Double = js.native
  /* 1 */ val update: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallType.update with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstallType with Double] = js.native
}

