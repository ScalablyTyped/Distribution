package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextGetOptions extends js.Object

@JSGlobal("Windows.UI.Text.TextGetOptions")
@js.native
object TextGetOptions extends js.Object {
  @js.native
  sealed trait adjustCrlf
    extends winrtLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  @js.native
  sealed trait allowFinalEop
    extends winrtLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  @js.native
  sealed trait formatRtf
    extends winrtLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  @js.native
  sealed trait includeNumbering
    extends winrtLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  @js.native
  sealed trait noHidden
    extends winrtLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  @js.native
  sealed trait useCrlf
    extends winrtLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  @js.native
  sealed trait useObjectText
    extends winrtLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  val adjustCrlf: adjustCrlf with java.lang.String = js.native
  val allowFinalEop: allowFinalEop with java.lang.String = js.native
  val formatRtf: formatRtf with java.lang.String = js.native
  val includeNumbering: includeNumbering with java.lang.String = js.native
  val noHidden: noHidden with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val useCrlf: useCrlf with java.lang.String = js.native
  val useObjectText: useObjectText with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.TextGetOptions with java.lang.String] = js.native
}

