package typings.winrtDashUwp.Windows.UI.Input

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
  
  /* 1 */ val leftButtonPressed: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.leftButtonPressed with Double = js.native
  /* 2 */ val leftButtonReleased: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.leftButtonReleased with Double = js.native
  /* 5 */ val middleButtonPressed: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.middleButtonPressed with Double = js.native
  /* 6 */ val middleButtonReleased: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.middleButtonReleased with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.other with Double = js.native
  /* 3 */ val rightButtonPressed: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.rightButtonPressed with Double = js.native
  /* 4 */ val rightButtonReleased: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.rightButtonReleased with Double = js.native
  /* 7 */ val xbutton1Pressed: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.xbutton1Pressed with Double = js.native
  /* 8 */ val xbutton1Released: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.xbutton1Released with Double = js.native
  /* 9 */ val xbutton2Pressed: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.xbutton2Pressed with Double = js.native
  /* 10 */ val xbutton2Released: typings.winrtDashUwp.Windows.UI.Input.PointerUpdateKind.xbutton2Released with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerUpdateKind with Double] = js.native
}

