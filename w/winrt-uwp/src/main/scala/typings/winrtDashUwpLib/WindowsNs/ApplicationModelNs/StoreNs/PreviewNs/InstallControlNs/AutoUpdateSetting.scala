package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs

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
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting
  
  /** Automatic app updates are disabled by policy. */
  @js.native
  sealed trait disabledByPolicy
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting
  
  /** Automatic app updates are enabled by the user. */
  @js.native
  sealed trait enabled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting
  
  /** Automatic app updates are enabled by policy. */
  @js.native
  sealed trait enabledByPolicy
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting
  
  val disabled: disabled with java.lang.String = js.native
  val disabledByPolicy: disabledByPolicy with java.lang.String = js.native
  val enabled: enabled with java.lang.String = js.native
  val enabledByPolicy: enabledByPolicy with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs.AutoUpdateSetting with java.lang.String
  ] = js.native
}

