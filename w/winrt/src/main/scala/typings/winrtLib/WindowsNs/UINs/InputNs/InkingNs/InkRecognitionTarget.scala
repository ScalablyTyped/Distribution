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
  
  val all: all with java.lang.String = js.native
  val recent: recent with java.lang.String = js.native
  val selected: selected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget with java.lang.String
  ] = js.native
}

