package typings.winrt.Windows.UI.Input.Inking

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.all
import typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.recent
import typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InkRecognitionTarget extends js.Object

@JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
@js.native
object InkRecognitionTarget extends js.Object {
  @js.native
  sealed trait all extends InkRecognitionTarget
  
  @js.native
  sealed trait recent extends InkRecognitionTarget
  
  @js.native
  sealed trait selected extends InkRecognitionTarget
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InkRecognitionTarget with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 2 */ @js.native
  object recent extends TopLevel[recent with Double]
  
  /* 1 */ @js.native
  object selected extends TopLevel[selected with Double]
  
}

