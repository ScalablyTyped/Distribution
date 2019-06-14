package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

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
  sealed trait leftButtonPressed
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** Left button released. */
  @js.native
  sealed trait leftButtonReleased
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** Middle button pressed. */
  @js.native
  sealed trait middleButtonPressed
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** Middle button released. */
  @js.native
  sealed trait middleButtonReleased
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** Pointer updates not identified by other PointerUpdateKind values. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** Right button pressed. */
  @js.native
  sealed trait rightButtonPressed
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** Right button released. */
  @js.native
  sealed trait rightButtonReleased
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** XBUTTON1 pressed. */
  @js.native
  sealed trait xbutton1Pressed
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** XBUTTON1 released. */
  @js.native
  sealed trait xbutton1Released
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** XBUTTON2 pressed. */
  @js.native
  sealed trait xbutton2Pressed
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /** XBUTTON2 released. */
  @js.native
  sealed trait xbutton2Released
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /* 1 */ val leftButtonPressed: leftButtonPressed with scala.Double = js.native
  /* 2 */ val leftButtonReleased: leftButtonReleased with scala.Double = js.native
  /* 5 */ val middleButtonPressed: middleButtonPressed with scala.Double = js.native
  /* 6 */ val middleButtonReleased: middleButtonReleased with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  /* 3 */ val rightButtonPressed: rightButtonPressed with scala.Double = js.native
  /* 4 */ val rightButtonReleased: rightButtonReleased with scala.Double = js.native
  /* 7 */ val xbutton1Pressed: xbutton1Pressed with scala.Double = js.native
  /* 8 */ val xbutton1Released: xbutton1Released with scala.Double = js.native
  /* 9 */ val xbutton2Pressed: xbutton2Pressed with scala.Double = js.native
  /* 10 */ val xbutton2Released: xbutton2Released with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind with scala.Double] = js.native
}

