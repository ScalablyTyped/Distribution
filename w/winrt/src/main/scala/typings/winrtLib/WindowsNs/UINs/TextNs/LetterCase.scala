package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LetterCase extends js.Object

@JSGlobal("Windows.UI.Text.LetterCase")
@js.native
object LetterCase extends js.Object {
  @js.native
  sealed trait lower
    extends winrtLib.WindowsNs.UINs.TextNs.LetterCase
  
  @js.native
  sealed trait upper
    extends winrtLib.WindowsNs.UINs.TextNs.LetterCase
  
  val lower: lower with java.lang.String = js.native
  val upper: upper with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.LetterCase with java.lang.String] = js.native
}

