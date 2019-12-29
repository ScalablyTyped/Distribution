package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
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
  object xButton1Pressed extends TopLevel[xButton1Pressed with Double]
  
  /* 8 */ @js.native
  object xButton1Released extends TopLevel[xButton1Released with Double]
  
  /* 9 */ @js.native
  object xButton2Pressed extends TopLevel[xButton2Pressed with Double]
  
  /* 10 */ @js.native
  object xButton2Released extends TopLevel[xButton2Released with Double]
  
}

