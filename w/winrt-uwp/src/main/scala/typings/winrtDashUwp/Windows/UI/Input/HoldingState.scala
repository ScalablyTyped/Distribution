package typings.winrtDashUwp.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
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
  sealed trait canceled extends HoldingState
  
  /** The single contact is lifted. */
  @js.native
  sealed trait completed extends HoldingState
  
  /** A single contact has been detected and a time threshold is crossed without the contact being lifted, another contact detected, or another gesture started. */
  @js.native
  sealed trait started extends HoldingState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HoldingState with Double] = js.native
  /* 2 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 1 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 0 */ @js.native
  object started extends TopLevel[started with Double]
  
}

