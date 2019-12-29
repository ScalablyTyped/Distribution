package typings.winrtDashUwp.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerUpdateKind extends js.Object

/** Specifies the types of pointer updates that are supported by an application. */
@JSGlobal("Windows.UI.Input.PointerUpdateKind")
@js.native
object PointerUpdateKind extends js.Object {
  /** Left button pressed. */
  @js.native
  sealed trait leftButtonPressed extends PointerUpdateKind
  
  /** Left button released. */
  @js.native
  sealed trait leftButtonReleased extends PointerUpdateKind
  
  /** Middle button pressed. */
  @js.native
  sealed trait middleButtonPressed extends PointerUpdateKind
  
  /** Middle button released. */
  @js.native
  sealed trait middleButtonReleased extends PointerUpdateKind
  
  /** Pointer updates not identified by other PointerUpdateKind values. */
  @js.native
  sealed trait other extends PointerUpdateKind
  
  /** Right button pressed. */
  @js.native
  sealed trait rightButtonPressed extends PointerUpdateKind
  
  /** Right button released. */
  @js.native
  sealed trait rightButtonReleased extends PointerUpdateKind
  
  /** XBUTTON1 pressed. */
  @js.native
  sealed trait xbutton1Pressed extends PointerUpdateKind
  
  /** XBUTTON1 released. */
  @js.native
  sealed trait xbutton1Released extends PointerUpdateKind
  
  /** XBUTTON2 pressed. */
  @js.native
  sealed trait xbutton2Pressed extends PointerUpdateKind
  
  /** XBUTTON2 released. */
  @js.native
  sealed trait xbutton2Released extends PointerUpdateKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerUpdateKind with Double] = js.native
  /* 1 */ @js.native
  object leftButtonPressed extends TopLevel[leftButtonPressed with Double]
  
  /* 2 */ @js.native
  object leftButtonReleased extends TopLevel[leftButtonReleased with Double]
  
  /* 5 */ @js.native
  object middleButtonPressed extends TopLevel[middleButtonPressed with Double]
  
  /* 6 */ @js.native
  object middleButtonReleased extends TopLevel[middleButtonReleased with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 3 */ @js.native
  object rightButtonPressed extends TopLevel[rightButtonPressed with Double]
  
  /* 4 */ @js.native
  object rightButtonReleased extends TopLevel[rightButtonReleased with Double]
  
  /* 7 */ @js.native
  object xbutton1Pressed extends TopLevel[xbutton1Pressed with Double]
  
  /* 8 */ @js.native
  object xbutton1Released extends TopLevel[xbutton1Released with Double]
  
  /* 9 */ @js.native
  object xbutton2Pressed extends TopLevel[xbutton2Pressed with Double]
  
  /* 10 */ @js.native
  object xbutton2Released extends TopLevel[xbutton2Released with Double]
  
}

