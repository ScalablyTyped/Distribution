package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextSetOptions with Double] = js.native
  /* 6 */ @js.native
  object applyRtfDocumentDefaults extends TopLevel[applyRtfDocumentDefaults with Double]
  
  /* 4 */ @js.native
  object checkTextLimit extends TopLevel[checkTextLimit with Double]
  
  /* 5 */ @js.native
  object formatRtf extends TopLevel[formatRtf with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object unhide extends TopLevel[unhide with Double]
  
  /* 1 */ @js.native
  object unicodeBidi extends TopLevel[unicodeBidi with Double]
  
  /* 2 */ @js.native
  object unlink extends TopLevel[unlink with Double]
  
}

