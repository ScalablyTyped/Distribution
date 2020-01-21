package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoFocusRange with Double] = js.native
  /* 0 */ @js.native
  object fullRange extends TopLevel[fullRange with Double]
  
  /* 1 */ @js.native
  object `macro` extends TopLevel[`macro` with Double]
  
  /* 2 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

