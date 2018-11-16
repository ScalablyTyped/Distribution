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
  
  val acceptUserInputAfterDelay: acceptUserInputAfterDelay with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.PopupsNs.MessageDialogOptions with java.lang.String] = js.native
}

