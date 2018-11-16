package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaretType extends js.Object

/** Specifies the caret type. */
@JSGlobal("Windows.UI.Text.CaretType")
@js.native
object CaretType extends js.Object {
  /** The insertion point for a sequenced language; that is, characters that are typed with one key stroke. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CaretType
  
  /** The insertion point is null. */
  @js.native
  sealed trait `null`
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CaretType
  
  val normal: normal with java.lang.String = js.native
  val `null`: `null` with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.CaretType with java.lang.String] = js.native
}

