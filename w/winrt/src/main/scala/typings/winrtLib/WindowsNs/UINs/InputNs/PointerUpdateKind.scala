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
  
  val leftButtonPressed: leftButtonPressed with java.lang.String = js.native
  val leftButtonReleased: leftButtonReleased with java.lang.String = js.native
  val middleButtonPressed: middleButtonPressed with java.lang.String = js.native
  val middleButtonReleased: middleButtonReleased with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val rightButtonPressed: rightButtonPressed with java.lang.String = js.native
  val rightButtonReleased: rightButtonReleased with java.lang.String = js.native
  val xButton1Pressed: xButton1Pressed with java.lang.String = js.native
  val xButton1Released: xButton1Released with java.lang.String = js.native
  val xButton2Pressed: xButton2Pressed with java.lang.String = js.native
  val xButton2Released: xButton2Released with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.PointerUpdateKind with java.lang.String] = js.native
}

