package typings.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies whether an app is available that supports activation. */
@JSGlobal("Windows.System.LaunchQuerySupportStatus")
@js.native
object LaunchQuerySupportStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus & Double] = js.native
  
  /* 1 */ val appNotInstalled: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.appNotInstalled & Double = js.native
  
  /* 2 */ val appUnavailable: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.appUnavailable & Double = js.native
  
  /* 0 */ val available: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.available & Double = js.native
  
  /* 3 */ val notSupported: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.notSupported & Double = js.native
  
  /* 4 */ val unknown: typings.winrtUwp.Windows.System.LaunchQuerySupportStatus.unknown & Double = js.native
}
