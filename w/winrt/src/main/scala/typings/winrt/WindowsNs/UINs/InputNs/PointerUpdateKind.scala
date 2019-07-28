package typings.winrt.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerUpdateKind extends js.Object

@JSGlobal("Windows.UI.Input.PointerUpdateKind")
@js.native
object PointerUpdateKind extends js.Object {
  @js.native
  sealed trait leftButtonPressed extends PointerUpdateKind
  
  @js.native
  sealed trait leftButtonReleased extends PointerUpdateKind
  
  @js.native
  sealed trait middleButtonPressed extends PointerUpdateKind
  
  @js.native
  sealed trait middleButtonReleased extends PointerUpdateKind
  
  @js.native
  sealed trait other extends PointerUpdateKind
  
  @js.native
  sealed trait rightButtonPressed extends PointerUpdateKind
  
  @js.native
  sealed trait rightButtonReleased extends PointerUpdateKind
  
  @js.native
  sealed trait xButton1Pressed extends PointerUpdateKind
  
  @js.native
  sealed trait xButton1Released extends PointerUpdateKind
  
  @js.native
  sealed trait xButton2Pressed extends PointerUpdateKind
  
  @js.native
  sealed trait xButton2Released extends PointerUpdateKind
  
  /* 1 */ val leftButtonPressed: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.leftButtonPressed with Double = js.native
  /* 2 */ val leftButtonReleased: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.leftButtonReleased with Double = js.native
  /* 5 */ val middleButtonPressed: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.middleButtonPressed with Double = js.native
  /* 6 */ val middleButtonReleased: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.middleButtonReleased with Double = js.native
  /* 0 */ val other: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.other with Double = js.native
  /* 3 */ val rightButtonPressed: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.rightButtonPressed with Double = js.native
  /* 4 */ val rightButtonReleased: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.rightButtonReleased with Double = js.native
  /* 7 */ val xButton1Pressed: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.xButton1Pressed with Double = js.native
  /* 8 */ val xButton1Released: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.xButton1Released with Double = js.native
  /* 9 */ val xButton2Pressed: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.xButton2Pressed with Double = js.native
  /* 10 */ val xButton2Released: typings.winrt.WindowsNs.UINs.InputNs.PointerUpdateKind.xButton2Released with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerUpdateKind with Double] = js.native
}

