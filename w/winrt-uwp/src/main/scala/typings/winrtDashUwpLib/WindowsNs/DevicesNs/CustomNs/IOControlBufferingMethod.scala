package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IOControlBufferingMethod extends js.Object

/** Identifies the buffering method. */
@JSGlobal("Windows.Devices.Custom.IOControlBufferingMethod")
@js.native
object IOControlBufferingMethod extends js.Object {
  /** Buffered. */
  @js.native
  sealed trait buffered
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlBufferingMethod
  
  /** Direct input. */
  @js.native
  sealed trait directInput
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlBufferingMethod
  
  /** Direct output. */
  @js.native
  sealed trait directOutput
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlBufferingMethod
  
  /** Neither. */
  @js.native
  sealed trait neither
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlBufferingMethod
  
  /* 0 */ val buffered: buffered with scala.Double = js.native
  /* 1 */ val directInput: directInput with scala.Double = js.native
  /* 2 */ val directOutput: directOutput with scala.Double = js.native
  /* 3 */ val neither: neither with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlBufferingMethod with scala.Double
  ] = js.native
}

