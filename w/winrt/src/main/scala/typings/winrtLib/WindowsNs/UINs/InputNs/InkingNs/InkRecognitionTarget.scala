package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InkRecognitionTarget extends js.Object

@JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
@js.native
object InkRecognitionTarget extends js.Object {
  @js.native
  sealed trait all
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget
  
  @js.native
  sealed trait recent
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget
  
  @js.native
  sealed trait selected
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 2 */ val recent: recent with scala.Double = js.native
  /* 1 */ val selected: selected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget with scala.Double] = js.native
}

