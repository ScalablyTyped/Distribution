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
  
  val leftButtonPressed: leftButtonPressed with java.lang.String = js.native
  val leftButtonReleased: leftButtonReleased with java.lang.String = js.native
  val middleButtonPressed: middleButtonPressed with java.lang.String = js.native
  val middleButtonReleased: middleButtonReleased with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val rightButtonPressed: rightButtonPressed with java.lang.String = js.native
  val rightButtonReleased: rightButtonReleased with java.lang.String = js.native
  val xbutton1Pressed: xbutton1Pressed with java.lang.String = js.native
  val xbutton1Released: xbutton1Released with java.lang.String = js.native
  val xbutton2Pressed: xbutton2Pressed with java.lang.String = js.native
  val xbutton2Released: xbutton2Released with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerUpdateKind with java.lang.String] = js.native
}

