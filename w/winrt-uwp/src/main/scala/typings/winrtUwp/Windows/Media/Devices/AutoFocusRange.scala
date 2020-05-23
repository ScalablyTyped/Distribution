package typings.winrtUwp.Windows.Media.Devices

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
  
}

