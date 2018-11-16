package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HoldingState extends js.Object

/** Specifies the state of the Holding event. */
@JSGlobal("Windows.UI.Input.HoldingState")
@js.native
object HoldingState extends js.Object {
  /** An additional contact is detected, a subsequent gesture (such as a slide) is detected, or the CompleteGesture method is called. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.HoldingState
  
  /** The single contact is lifted. */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.HoldingState
  
  /** A single contact has been detected and a time threshold is crossed without the contact being lifted, another contact detected, or another gesture started. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.HoldingState
  
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.InputNs.HoldingState with java.lang.String] = js.native
}

