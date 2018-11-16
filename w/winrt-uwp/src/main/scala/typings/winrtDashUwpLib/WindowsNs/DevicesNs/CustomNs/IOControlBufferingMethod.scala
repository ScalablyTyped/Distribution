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
  
  val buffered: buffered with java.lang.String = js.native
  val directInput: directInput with java.lang.String = js.native
  val directOutput: directOutput with java.lang.String = js.native
  val neither: neither with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlBufferingMethod with java.lang.String
  ] = js.native
}

