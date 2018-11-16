package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatEffect extends js.Object

@JSGlobal("Windows.UI.Text.FormatEffect")
@js.native
object FormatEffect extends js.Object {
  @js.native
  sealed trait off
    extends winrtLib.WindowsNs.UINs.TextNs.FormatEffect
  
  @js.native
  sealed trait on
    extends winrtLib.WindowsNs.UINs.TextNs.FormatEffect
  
  @js.native
  sealed trait toggle
    extends winrtLib.WindowsNs.UINs.TextNs.FormatEffect
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.FormatEffect
  
  val off: off with java.lang.String = js.native
  val on: on with java.lang.String = js.native
  val toggle: toggle with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.FormatEffect with java.lang.String] = js.native
}

