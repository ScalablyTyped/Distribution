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
  
  /* 21 */ val allCaps: allCaps with scala.Double = js.native
  /* 14 */ val bold: bold with scala.Double = js.native
  /* 0 */ val character: character with scala.Double = js.native
  /* 9 */ val characterFormat: characterFormat with scala.Double = js.native
  /* 13 */ val cluster: cluster with scala.Double = js.native
  /* 26 */ val disabled: disabled with scala.Double = js.native
  /* 30 */ val fontBound: fontBound with scala.Double = js.native
  /* 12 */ val hardParagraph: hardParagraph with scala.Double = js.native
  /* 22 */ val hidden: hidden with scala.Double = js.native
  /* 25 */ val imprint: imprint with scala.Double = js.native
  /* 15 */ val italic: italic with scala.Double = js.native
  /* 4 */ val line: line with scala.Double = js.native
  /* 19 */ val link: link with scala.Double = js.native
  /* 31 */ val linkProtected: linkProtected with scala.Double = js.native
  /* 11 */ val `object`: `object` with scala.Double = js.native
  /* 23 */ val outline: outline with scala.Double = js.native
  /* 3 */ val paragraph: paragraph with scala.Double = js.native
  /* 10 */ val paragraphFormat: paragraphFormat with scala.Double = js.native
  /* 18 */ val protectedText: protectedText with scala.Double = js.native
  /* 27 */ val revised: revised with scala.Double = js.native
  /* 6 */ val screen: screen with scala.Double = js.native
  /* 7 */ val section: section with scala.Double = js.native
  /* 2 */ val sentence: sentence with scala.Double = js.native
  /* 24 */ val shadow: shadow with scala.Double = js.native
  /* 20 */ val smallCaps: smallCaps with scala.Double = js.native
  /* 5 */ val story: story with scala.Double = js.native
  /* 17 */ val strikethrough: strikethrough with scala.Double = js.native
  /* 28 */ val subscript: subscript with scala.Double = js.native
  /* 29 */ val superscript: superscript with scala.Double = js.native
  /* 16 */ val underline: underline with scala.Double = js.native
  /* 8 */ val window: window with scala.Double = js.native
  /* 1 */ val word: word with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.TextRangeUnit with scala.Double] = js.native
}

