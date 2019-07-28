package typings.winrtDashUwp.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextSetOptions extends js.Object

/** Specifies options for setting the text in a text range. */
@JSGlobal("Windows.UI.Text.TextSetOptions")
@js.native
object TextSetOptions extends js.Object {
  /** Apply the RTF default settings for the document. RTF often contains document default properties. These properties are typically ignored when inserting RTF (as distinguished from opening an RTF file). */
  @js.native
  sealed trait applyRtfDocumentDefaults extends TextSetOptions
  
  /** Obey the current text limit instead of increasing the limit to fit. */
  @js.native
  sealed trait checkTextLimit extends TextSetOptions
  
  /** Treat input text as Rich Text Format (RTF) (the RTF text will be validated). */
  @js.native
  sealed trait formatRtf extends TextSetOptions
  
  /** No text setting option is specified. */
  @js.native
  sealed trait none extends TextSetOptions
  
  /** Don't insert as hidden text. */
  @js.native
  sealed trait unhide extends TextSetOptions
  
  /** Use the Unicode bidirectional algorithm. */
  @js.native
  sealed trait unicodeBidi extends TextSetOptions
  
  /** Don't include text as part of a hyperlink. */
  @js.native
  sealed trait unlink extends TextSetOptions
  
  /* 6 */ val applyRtfDocumentDefaults: typings.winrtDashUwp.WindowsNs.UINs.TextNs.TextSetOptions.applyRtfDocumentDefaults with Double = js.native
  /* 4 */ val checkTextLimit: typings.winrtDashUwp.WindowsNs.UINs.TextNs.TextSetOptions.checkTextLimit with Double = js.native
  /* 5 */ val formatRtf: typings.winrtDashUwp.WindowsNs.UINs.TextNs.TextSetOptions.formatRtf with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.UINs.TextNs.TextSetOptions.none with Double = js.native
  /* 3 */ val unhide: typings.winrtDashUwp.WindowsNs.UINs.TextNs.TextSetOptions.unhide with Double = js.native
  /* 1 */ val unicodeBidi: typings.winrtDashUwp.WindowsNs.UINs.TextNs.TextSetOptions.unicodeBidi with Double = js.native
  /* 2 */ val unlink: typings.winrtDashUwp.WindowsNs.UINs.TextNs.TextSetOptions.unlink with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextSetOptions with Double] = js.native
}

