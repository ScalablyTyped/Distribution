package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

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
  sealed trait failed extends MediaCaptureFocusState
  
  /** Focused. */
  @js.native
  sealed trait focused extends MediaCaptureFocusState
  
  /** The focus has been lost. */
  @js.native
  sealed trait lost extends MediaCaptureFocusState
  
  /** Searching for focus. */
  @js.native
  sealed trait searching extends MediaCaptureFocusState
  
  /** The focus state is uninitialized. */
  @js.native
  sealed trait uninitialized extends MediaCaptureFocusState
  
  /* 4 */ val failed: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState.failed with Double = js.native
  /* 3 */ val focused: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState.focused with Double = js.native
  /* 1 */ val lost: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState.lost with Double = js.native
  /* 2 */ val searching: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState.searching with Double = js.native
  /* 0 */ val uninitialized: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState.uninitialized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCaptureFocusState with Double] = js.native
}

