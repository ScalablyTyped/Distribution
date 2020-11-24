package typings.winrtUwp.global.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies whether an app is available that supports activation. */
@JSGlobal("Windows.System.LaunchQuerySupportStatus")
@js.native
object LaunchQuerySupportStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus with Double] = js.native
  
  /* 1 */ val appNotInstalled: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.appNotInstalled with Double = js.native
  
  /* 2 */ val appUnavailable: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.appUnavailable with Double = js.native
  
  /* 0 */ val available: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.available with Double = js.native
  
  /* 3 */ val notSupported: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.notSupported with Double = js.native
  
  /* 4 */ val unknown: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.unknown with Double = js.native
}
