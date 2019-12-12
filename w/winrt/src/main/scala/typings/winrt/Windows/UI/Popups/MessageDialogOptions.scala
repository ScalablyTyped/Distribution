package typings.winrt.Windows.UI.Popups

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Popups.MessageDialogOptions.acceptUserInputAfterDelay
import typings.winrt.Windows.UI.Popups.MessageDialogOptions.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageDialogOptions extends js.Object

@JSGlobal("Windows.UI.Popups.MessageDialogOptions")
@js.native
object MessageDialogOptions extends js.Object {
  @js.native
  sealed trait acceptUserInputAfterDelay extends MessageDialogOptions
  
  @js.native
  sealed trait none extends MessageDialogOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageDialogOptions with Double] = js.native
  /* 1 */ @js.native
  object acceptUserInputAfterDelay extends TopLevel[acceptUserInputAfterDelay with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

