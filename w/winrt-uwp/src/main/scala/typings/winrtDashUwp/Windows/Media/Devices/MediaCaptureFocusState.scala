package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureFocusState.failed
import typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureFocusState.focused
import typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureFocusState.lost
import typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureFocusState.searching
import typings.winrtDashUwp.Windows.Media.Devices.MediaCaptureFocusState.uninitialized
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaCaptureFocusState with Double] = js.native
  /* 4 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 3 */ @js.native
  object focused extends TopLevel[focused with Double]
  
  /* 1 */ @js.native
  object lost extends TopLevel[lost with Double]
  
  /* 2 */ @js.native
  object searching extends TopLevel[searching with Double]
  
  /* 0 */ @js.native
  object uninitialized extends TopLevel[uninitialized with Double]
  
}

