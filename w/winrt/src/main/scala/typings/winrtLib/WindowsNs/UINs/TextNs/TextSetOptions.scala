package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextSetOptions extends js.Object

@JSGlobal("Windows.UI.Text.TextSetOptions")
@js.native
object TextSetOptions extends js.Object {
  @js.native
  sealed trait applyRtfDocumentDefaults
    extends winrtLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  @js.native
  sealed trait checkTextLimit
    extends winrtLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  @js.native
  sealed trait formatRtf
    extends winrtLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  @js.native
  sealed trait unhide
    extends winrtLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  @js.native
  sealed trait unicodeBidi
    extends winrtLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  @js.native
  sealed trait unlink
    extends winrtLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  /* 6 */ val applyRtfDocumentDefaults: applyRtfDocumentDefaults with scala.Double = js.native
  /* 4 */ val checkTextLimit: checkTextLimit with scala.Double = js.native
  /* 5 */ val formatRtf: formatRtf with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val unhide: unhide with scala.Double = js.native
  /* 1 */ val unicodeBidi: unicodeBidi with scala.Double = js.native
  /* 2 */ val unlink: unlink with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.TextSetOptions with scala.Double] = js.native
}

