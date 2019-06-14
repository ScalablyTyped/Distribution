package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerUpdateKind extends js.Object

@JSGlobal("Windows.UI.Input.PointerUpdateKind")
@js.native
object PointerUpdateKind extends js.Object {
  @js.native
  sealed trait leftButtonPressed
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait leftButtonReleased
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait middleButtonPressed
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait middleButtonReleased
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait other
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait rightButtonPressed
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait rightButtonReleased
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait xButton1Pressed
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait xButton1Released
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait xButton2Pressed
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  @js.native
  sealed trait xButton2Released
    extends winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind
  
  /* 1 */ val leftButtonPressed: leftButtonPressed with scala.Double = js.native
  /* 2 */ val leftButtonReleased: leftButtonReleased with scala.Double = js.native
  /* 5 */ val middleButtonPressed: middleButtonPressed with scala.Double = js.native
  /* 6 */ val middleButtonReleased: middleButtonReleased with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  /* 3 */ val rightButtonPressed: rightButtonPressed with scala.Double = js.native
  /* 4 */ val rightButtonReleased: rightButtonReleased with scala.Double = js.native
  /* 7 */ val xButton1Pressed: xButton1Pressed with scala.Double = js.native
  /* 8 */ val xButton1Released: xButton1Released with scala.Double = js.native
  /* 9 */ val xButton2Pressed: xButton2Pressed with scala.Double = js.native
  /* 10 */ val xButton2Released: xButton2Released with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind with scala.Double] = js.native
}

