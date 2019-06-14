package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageDialogOptions extends js.Object

@JSGlobal("Windows.UI.Popups.MessageDialogOptions")
@js.native
object MessageDialogOptions extends js.Object {
  @js.native
  sealed trait acceptUserInputAfterDelay
    extends winrtLib.WindowsNs.UINs.PopupsNs.MessageDialogOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.PopupsNs.MessageDialogOptions
  
  /* 1 */ val acceptUserInputAfterDelay: acceptUserInputAfterDelay with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.PopupsNs.MessageDialogOptions with scala.Double] = js.native
}

