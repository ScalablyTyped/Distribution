package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCaptureFocusState extends js.Object

/** Defines the different focus states the capture device can be in. */
@JSGlobal("Windows.Media.Devices.MediaCaptureFocusState")
@js.native
object MediaCaptureFocusState extends js.Object {
  /** The attempt to focus has failed. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState
  
  /** Focused. */
  @js.native
  sealed trait focused
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState
  
  /** The focus has been lost. */
  @js.native
  sealed trait lost
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState
  
  /** Searching for focus. */
  @js.native
  sealed trait searching
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState
  
  /** The focus state is uninitialized. */
  @js.native
  sealed trait uninitialized
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState
  
  val failed: failed with java.lang.String = js.native
  val focused: focused with java.lang.String = js.native
  val lost: lost with java.lang.String = js.native
  val searching: searching with java.lang.String = js.native
  val uninitialized: uninitialized with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState with java.lang.String
  ] = js.native
}

