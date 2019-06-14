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
  
  /* 1 */ val adjustCrlf: adjustCrlf with scala.Double = js.native
  /* 4 */ val allowFinalEop: allowFinalEop with scala.Double = js.native
  /* 7 */ val formatRtf: formatRtf with scala.Double = js.native
  /* 6 */ val includeNumbering: includeNumbering with scala.Double = js.native
  /* 5 */ val noHidden: noHidden with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val useCrlf: useCrlf with scala.Double = js.native
  /* 3 */ val useObjectText: useObjectText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.TextGetOptions with scala.Double] = js.native
}

