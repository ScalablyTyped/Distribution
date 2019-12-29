package typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoUpdateSetting with Double] = js.native
  /* 0 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 2 */ @js.native
  object disabledByPolicy extends TopLevel[disabledByPolicy with Double]
  
  /* 1 */ @js.native
  object enabled extends TopLevel[enabled with Double]
  
  /* 3 */ @js.native
  object enabledByPolicy extends TopLevel[enabledByPolicy with Double]
  
}

