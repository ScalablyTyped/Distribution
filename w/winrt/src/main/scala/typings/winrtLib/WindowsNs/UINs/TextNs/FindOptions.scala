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
  sealed trait `case_`
    extends winrtLib.WindowsNs.UINs.TextNs.FindOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.TextNs.FindOptions
  
  @js.native
  sealed trait word
    extends winrtLib.WindowsNs.UINs.TextNs.FindOptions
  
  val `case_`: `case_` with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val word: word with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.FindOptions with java.lang.String] = js.native
}

