package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FindOptions extends js.Object

@JSGlobal("Windows.UI.Text.FindOptions")
@js.native
object FindOptions extends js.Object {
  @js.native
  sealed trait case_
    extends winrtLib.WindowsNs.UINs.TextNs.FindOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.TextNs.FindOptions
  
  @js.native
  sealed trait word
    extends winrtLib.WindowsNs.UINs.TextNs.FindOptions
  
  /* 2 */ val case_ : case_ with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val word: word with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.FindOptions with scala.Double] = js.native
}

