package typings.winrt.Windows.UI.Input

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
  
}

