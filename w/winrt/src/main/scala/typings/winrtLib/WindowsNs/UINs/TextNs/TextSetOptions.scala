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
  
  val applyRtfDocumentDefaults: applyRtfDocumentDefaults with java.lang.String = js.native
  val checkTextLimit: checkTextLimit with java.lang.String = js.native
  val formatRtf: formatRtf with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val unhide: unhide with java.lang.String = js.native
  val unicodeBidi: unicodeBidi with java.lang.String = js.native
  val unlink: unlink with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.TextSetOptions with java.lang.String] = js.native
}

