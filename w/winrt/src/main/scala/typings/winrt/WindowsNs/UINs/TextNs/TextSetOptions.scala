package typings.winrt.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextSetOptions extends js.Object

@JSGlobal("Windows.UI.Text.TextSetOptions")
@js.native
object TextSetOptions extends js.Object {
  @js.native
  sealed trait applyRtfDocumentDefaults extends TextSetOptions
  
  @js.native
  sealed trait checkTextLimit extends TextSetOptions
  
  @js.native
  sealed trait formatRtf extends TextSetOptions
  
  @js.native
  sealed trait none extends TextSetOptions
  
  @js.native
  sealed trait unhide extends TextSetOptions
  
  @js.native
  sealed trait unicodeBidi extends TextSetOptions
  
  @js.native
  sealed trait unlink extends TextSetOptions
  
  /* 6 */ val applyRtfDocumentDefaults: typings.winrt.WindowsNs.UINs.TextNs.TextSetOptions.applyRtfDocumentDefaults with Double = js.native
  /* 4 */ val checkTextLimit: typings.winrt.WindowsNs.UINs.TextNs.TextSetOptions.checkTextLimit with Double = js.native
  /* 5 */ val formatRtf: typings.winrt.WindowsNs.UINs.TextNs.TextSetOptions.formatRtf with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.UINs.TextNs.TextSetOptions.none with Double = js.native
  /* 3 */ val unhide: typings.winrt.WindowsNs.UINs.TextNs.TextSetOptions.unhide with Double = js.native
  /* 1 */ val unicodeBidi: typings.winrt.WindowsNs.UINs.TextNs.TextSetOptions.unicodeBidi with Double = js.native
  /* 2 */ val unlink: typings.winrt.WindowsNs.UINs.TextNs.TextSetOptions.unlink with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextSetOptions with Double] = js.native
}

