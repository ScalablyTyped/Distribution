package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs

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
  sealed trait install
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallType
  
  /** The app installation is being repaired. */
  @js.native
  sealed trait repair
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallType
  
  /** The app is being updated. */
  @js.native
  sealed trait update
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallType
  
  val install: install with java.lang.String = js.native
  val repair: repair with java.lang.String = js.native
  val update: update with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AppInstallType with java.lang.String
  ] = js.native
}

