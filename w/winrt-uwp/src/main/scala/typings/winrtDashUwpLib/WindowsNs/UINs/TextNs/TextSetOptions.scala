package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait applyRtfDocumentDefaults
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  /** Obey the current text limit instead of increasing the limit to fit. */
  @js.native
  sealed trait checkTextLimit
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  /** Treat input text as Rich Text Format (RTF) (the RTF text will be validated). */
  @js.native
  sealed trait formatRtf
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  /** No text setting option is specified. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  /** Don't insert as hidden text. */
  @js.native
  sealed trait unhide
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  /** Use the Unicode bidirectional algorithm. */
  @js.native
  sealed trait unicodeBidi
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  /** Don't include text as part of a hyperlink. */
  @js.native
  sealed trait unlink
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextSetOptions
  
  /* 6 */ val applyRtfDocumentDefaults: applyRtfDocumentDefaults with scala.Double = js.native
  /* 4 */ val checkTextLimit: checkTextLimit with scala.Double = js.native
  /* 5 */ val formatRtf: formatRtf with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val unhide: unhide with scala.Double = js.native
  /* 1 */ val unicodeBidi: unicodeBidi with scala.Double = js.native
  /* 2 */ val unlink: unlink with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.TextSetOptions with scala.Double] = js.native
}

