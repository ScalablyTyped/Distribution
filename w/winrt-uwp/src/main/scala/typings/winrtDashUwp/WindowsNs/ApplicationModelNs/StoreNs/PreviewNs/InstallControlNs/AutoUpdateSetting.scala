package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val disabled: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting.disabled with Double = js.native
  /* 2 */ val disabledByPolicy: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting.disabledByPolicy with Double = js.native
  /* 1 */ val enabled: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting.enabled with Double = js.native
  /* 3 */ val enabledByPolicy: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting.enabledByPolicy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoUpdateSetting with Double] = js.native
}

