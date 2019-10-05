package typings.winrtDashUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoFocusRange extends js.Object

/** Defines the options for auto focus range. */
@JSGlobal("Windows.Media.Devices.AutoFocusRange")
@js.native
object AutoFocusRange extends js.Object {
  /** Full range. */
  @js.native
  sealed trait fullRange extends AutoFocusRange
  
  /** Macro. */
  @js.native
  sealed trait `macro` extends AutoFocusRange
  
  /** Normal range. */
  @js.native
  sealed trait normal extends AutoFocusRange
  
  /* 0 */ val fullRange: typings.winrtDashUwp.Windows.Media.Devices.AutoFocusRange.fullRange with Double = js.native
  /* 1 */ val `macro`: typings.winrtDashUwp.Windows.Media.Devices.AutoFocusRange.`macro` with Double = js.native
  /* 2 */ val normal: typings.winrtDashUwp.Windows.Media.Devices.AutoFocusRange.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoFocusRange with Double] = js.native
}

