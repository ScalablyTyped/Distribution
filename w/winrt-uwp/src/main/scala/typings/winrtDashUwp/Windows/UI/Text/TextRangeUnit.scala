package typings.winrtDashUwp.Windows.UI.Text

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
  sealed trait allCaps extends TextRangeUnit
  
  /** Bold text. */
  @js.native
  sealed trait bold extends TextRangeUnit
  
  /** A single character. */
  @js.native
  sealed trait character extends TextRangeUnit
  
  /** A text run of characters that all have identical character formatting properties. */
  @js.native
  sealed trait characterFormat extends TextRangeUnit
  
  /** A complex-script cluster (occurs, for example, in Indic scripts). */
  @js.native
  sealed trait cluster extends TextRangeUnit
  
  /** Disabled text. */
  @js.native
  sealed trait disabled extends TextRangeUnit
  
  /** Text is in a font-bound font. That is, characters that can't be displayed with the current font were assigned a different font that could display the characters. */
  @js.native
  sealed trait fontBound extends TextRangeUnit
  
  /** A paragraph that is ended by a carriage return (CR) or CR/LF. */
  @js.native
  sealed trait hardParagraph extends TextRangeUnit
  
  /** Hidden text. */
  @js.native
  sealed trait hidden extends TextRangeUnit
  
  /** Imprinted (engraved) text. */
  @js.native
  sealed trait imprint extends TextRangeUnit
  
  /** Italic text. */
  @js.native
  sealed trait italic extends TextRangeUnit
  
  /** A single line of text on a display, provided that the display is associated with the range. If no display is associated with a range, Line is treated as Paragraph. A selection automatically has a display. */
  @js.native
  sealed trait line extends TextRangeUnit
  
  /** Hyperlink text. */
  @js.native
  sealed trait link extends TextRangeUnit
  
  /** Characters in one or more contiguous, friendly-name hyperlinks. To work with single links that might be adjacent, use the Link unit. */
  @js.native
  sealed trait linkProtected extends TextRangeUnit
  
  /** An embedded object. */
  @js.native
  sealed trait `object` extends TextRangeUnit
  
  /** Outline text. */
  @js.native
  sealed trait outline extends TextRangeUnit
  
  /** A string of text terminated by an end-of-paragraph mark, such as CR/LF, carriage return (CR), vertical tab(VT), line feed (LF), form feed (FF), or the Unicode paragraph separator (0x2029). */
  @js.native
  sealed trait paragraph extends TextRangeUnit
  
  /** A text run of characters that all have identical paragraph formatting properties. */
  @js.native
  sealed trait paragraphFormat extends TextRangeUnit
  
  /** Protected text. */
  @js.native
  sealed trait protectedText extends TextRangeUnit
  
  /** Revised text. */
  @js.native
  sealed trait revised extends TextRangeUnit
  
  /** The contents of a screen. Typically, a screen is the amount of content associated with the Page Up or Page Down key. */
  @js.native
  sealed trait screen extends TextRangeUnit
  
  /** A section. */
  @js.native
  sealed trait section extends TextRangeUnit
  
  /** A string of text that meets the following criteria: */
  @js.native
  sealed trait sentence extends TextRangeUnit
  
  /** Shadow text. */
  @js.native
  sealed trait shadow extends TextRangeUnit
  
  /** Text in small caps. */
  @js.native
  sealed trait smallCaps extends TextRangeUnit
  
  /** A story, which is a contiguous range of text in a document. For example, a story can contain one of the various parts of a document, such as the main text of a document, headers and footers, footnotes, or annotations. In a rich edit control, there is only one story per document, although a client can use multiple documents to represent multiple stories. */
  @js.native
  sealed trait story extends TextRangeUnit
  
  /** Strikethrough text. */
  @js.native
  sealed trait strikethrough extends TextRangeUnit
  
  /** Text in the subscript character format. */
  @js.native
  sealed trait subscript extends TextRangeUnit
  
  /** Text in the superscript character format. */
  @js.native
  sealed trait superscript extends TextRangeUnit
  
  /** Underlined text. */
  @js.native
  sealed trait underline extends TextRangeUnit
  
  /** The characters between the upper-left and lower-right corners of the window. */
  @js.native
  sealed trait window extends TextRangeUnit
  
  /** A span of alphanumeric characters, an end of paragraph, or punctuation that includes any blanks that follow. */
  @js.native
  sealed trait word extends TextRangeUnit
  
  /* 21 */ val allCaps: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.allCaps with Double = js.native
  /* 14 */ val bold: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.bold with Double = js.native
  /* 0 */ val character: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.character with Double = js.native
  /* 9 */ val characterFormat: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.characterFormat with Double = js.native
  /* 13 */ val cluster: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.cluster with Double = js.native
  /* 26 */ val disabled: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.disabled with Double = js.native
  /* 30 */ val fontBound: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.fontBound with Double = js.native
  /* 12 */ val hardParagraph: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.hardParagraph with Double = js.native
  /* 22 */ val hidden: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.hidden with Double = js.native
  /* 25 */ val imprint: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.imprint with Double = js.native
  /* 15 */ val italic: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.italic with Double = js.native
  /* 4 */ val line: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.line with Double = js.native
  /* 19 */ val link: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.link with Double = js.native
  /* 31 */ val linkProtected: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.linkProtected with Double = js.native
  /* 11 */ val `object`: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.`object` with Double = js.native
  /* 23 */ val outline: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.outline with Double = js.native
  /* 3 */ val paragraph: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.paragraph with Double = js.native
  /* 10 */ val paragraphFormat: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.paragraphFormat with Double = js.native
  /* 18 */ val protectedText: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.protectedText with Double = js.native
  /* 27 */ val revised: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.revised with Double = js.native
  /* 6 */ val screen: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.screen with Double = js.native
  /* 7 */ val section: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.section with Double = js.native
  /* 2 */ val sentence: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.sentence with Double = js.native
  /* 24 */ val shadow: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.shadow with Double = js.native
  /* 20 */ val smallCaps: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.smallCaps with Double = js.native
  /* 5 */ val story: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.story with Double = js.native
  /* 17 */ val strikethrough: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.strikethrough with Double = js.native
  /* 28 */ val subscript: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.subscript with Double = js.native
  /* 29 */ val superscript: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.superscript with Double = js.native
  /* 16 */ val underline: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.underline with Double = js.native
  /* 8 */ val window: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.window with Double = js.native
  /* 1 */ val word: typings.winrtDashUwp.Windows.UI.Text.TextRangeUnit.word with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextRangeUnit with Double] = js.native
}

