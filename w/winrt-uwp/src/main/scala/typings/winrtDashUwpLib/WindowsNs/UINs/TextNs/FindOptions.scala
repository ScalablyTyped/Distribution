package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FindOptions extends js.Object

/** Specifies the options to use when doing a text search. */
@JSGlobal("Windows.UI.Text.FindOptions")
@js.native
object FindOptions extends js.Object {
  /** Match case; that is, a case-sensitive search. */
  @js.native
  sealed trait `case`
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FindOptions
  
  /** Use the default text search options; namely, use case- independent, arbitrary character boundaries. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FindOptions
  
  /** Match whole words. */
  @js.native
  sealed trait word
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FindOptions
  
  val `case`: `case` with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val word: word with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.FindOptions with java.lang.String] = js.native
}

