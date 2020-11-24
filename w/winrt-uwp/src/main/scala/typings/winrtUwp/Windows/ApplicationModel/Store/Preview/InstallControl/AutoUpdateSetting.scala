package typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoUpdateSetting extends js.Object
/** Defines the automatic app update setting values that can be returned by the AutoUpdateSetting property of the AppInstallManager class. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AutoUpdateSetting")
@js.native
object AutoUpdateSetting extends js.Object {
  
  /** Automatic app updates are disabled by the user. */
  @js.native
  sealed trait disabled extends AutoUpdateSetting
  
  /** Automatic app updates are disabled by policy. */
  @js.native
  sealed trait disabledByPolicy extends AutoUpdateSetting
  
  /** Automatic app updates are enabled by the user. */
  @js.native
  sealed trait enabled extends AutoUpdateSetting
  
  /** Automatic app updates are enabled by policy. */
  @js.native
  sealed trait enabledByPolicy extends AutoUpdateSetting
}
