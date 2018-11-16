package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextRangeUnit extends js.Object

/** Specifies the units to use when navigating a text range. */
@JSGlobal("Windows.UI.Text.TextRangeUnit")
@js.native
object TextRangeUnit extends js.Object {
  /** Text in all uppercase. */
  @js.native
  sealed trait allCaps
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Bold text. */
  @js.native
  sealed trait bold
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A single character. */
  @js.native
  sealed trait character
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A text run of characters that all have identical character formatting properties. */
  @js.native
  sealed trait characterFormat
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A complex-script cluster (occurs, for example, in Indic scripts). */
  @js.native
  sealed trait cluster
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Disabled text. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Text is in a font-bound font. That is, characters that can't be displayed with the current font were assigned a different font that could display the characters. */
  @js.native
  sealed trait fontBound
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A paragraph that is ended by a carriage return (CR) or CR/LF. */
  @js.native
  sealed trait hardParagraph
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Hidden text. */
  @js.native
  sealed trait hidden
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Imprinted (engraved) text. */
  @js.native
  sealed trait imprint
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Italic text. */
  @js.native
  sealed trait italic
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A single line of text on a display, provided that the display is associated with the range. If no display is associated with a range, Line is treated as Paragraph. A selection automatically has a display. */
  @js.native
  sealed trait line
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Hyperlink text. */
  @js.native
  sealed trait link
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Characters in one or more contiguous, friendly-name hyperlinks. To work with single links that might be adjacent, use the Link unit. */
  @js.native
  sealed trait linkProtected
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** An embedded object. */
  @js.native
  sealed trait `object`
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Outline text. */
  @js.native
  sealed trait outline
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A string of text terminated by an end-of-paragraph mark, such as CR/LF, carriage return (CR), vertical tab(VT), line feed (LF), form feed (FF), or the Unicode paragraph separator (0x2029). */
  @js.native
  sealed trait paragraph
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A text run of characters that all have identical paragraph formatting properties. */
  @js.native
  sealed trait paragraphFormat
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Protected text. */
  @js.native
  sealed trait protectedText
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Revised text. */
  @js.native
  sealed trait revised
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** The contents of a screen. Typically, a screen is the amount of content associated with the Page Up or Page Down key. */
  @js.native
  sealed trait screen
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A section. */
  @js.native
  sealed trait section
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A string of text that meets the following criteria: */
  @js.native
  sealed trait sentence
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Shadow text. */
  @js.native
  sealed trait shadow
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Text in small caps. */
  @js.native
  sealed trait smallCaps
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A story, which is a contiguous range of text in a document. For example, a story can contain one of the various parts of a document, such as the main text of a document, headers and footers, footnotes, or annotations. In a rich edit control, there is only one story per document, although a client can use multiple documents to represent multiple stories. */
  @js.native
  sealed trait story
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Strikethrough text. */
  @js.native
  sealed trait strikethrough
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Text in the subscript character format. */
  @js.native
  sealed trait subscript
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Text in the superscript character format. */
  @js.native
  sealed trait superscript
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** Underlined text. */
  @js.native
  sealed trait underline
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** The characters between the upper-left and lower-right corners of the window. */
  @js.native
  sealed trait window
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  /** A span of alphanumeric characters, an end of paragraph, or punctuation that includes any blanks that follow. */
  @js.native
  sealed trait word
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit
  
  val allCaps: allCaps with java.lang.String = js.native
  val bold: bold with java.lang.String = js.native
  val character: character with java.lang.String = js.native
  val characterFormat: characterFormat with java.lang.String = js.native
  val cluster: cluster with java.lang.String = js.native
  val disabled: disabled with java.lang.String = js.native
  val fontBound: fontBound with java.lang.String = js.native
  val hardParagraph: hardParagraph with java.lang.String = js.native
  val hidden: hidden with java.lang.String = js.native
  val imprint: imprint with java.lang.String = js.native
  val italic: italic with java.lang.String = js.native
  val line: line with java.lang.String = js.native
  val link: link with java.lang.String = js.native
  val linkProtected: linkProtected with java.lang.String = js.native
  val `object`: `object` with java.lang.String = js.native
  val outline: outline with java.lang.String = js.native
  val paragraph: paragraph with java.lang.String = js.native
  val paragraphFormat: paragraphFormat with java.lang.String = js.native
  val protectedText: protectedText with java.lang.String = js.native
  val revised: revised with java.lang.String = js.native
  val screen: screen with java.lang.String = js.native
  val section: section with java.lang.String = js.native
  val sentence: sentence with java.lang.String = js.native
  val shadow: shadow with java.lang.String = js.native
  val smallCaps: smallCaps with java.lang.String = js.native
  val story: story with java.lang.String = js.native
  val strikethrough: strikethrough with java.lang.String = js.native
  val subscript: subscript with java.lang.String = js.native
  val superscript: superscript with java.lang.String = js.native
  val underline: underline with java.lang.String = js.native
  val window: window with java.lang.String = js.native
  val word: word with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit with java.lang.String] = js.native
}

