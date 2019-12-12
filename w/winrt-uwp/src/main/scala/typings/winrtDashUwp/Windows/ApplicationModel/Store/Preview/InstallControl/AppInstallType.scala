package typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType.install
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType.repair
import typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType.update
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstallType with Double] = js.native
  /* 0 */ @js.native
  object install extends TopLevel[install with Double]
  
  /* 2 */ @js.native
  object repair extends TopLevel[repair with Double]
  
  /* 1 */ @js.native
  object update extends TopLevel[update with Double]
  
}

