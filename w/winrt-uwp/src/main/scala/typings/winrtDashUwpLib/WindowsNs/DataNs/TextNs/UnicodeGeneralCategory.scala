package typings
package winrtDashUwpLib.WindowsNs.DataNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnicodeGeneralCategory extends js.Object

/** Defines the Unicode general category of a character. */
@JSGlobal("Windows.Data.Text.UnicodeGeneralCategory")
@js.native
object UnicodeGeneralCategory extends js.Object {
  /** Closing character of one of the paired punctuation marks, such as parentheses, square brackets, and braces. Signified by the Unicode designation "Pe" (punctuation, close). */
  @js.native
  sealed trait closePunctuation
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Connector punctuation character that connects two characters. Signified by the Unicode designation "Pc" (punctuation, connector). */
  @js.native
  sealed trait connectorPunctuation
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Control code character, with a Unicode value of U+007F or in the range U+0000 through U+001F or U+0080 through U+009F. Signified by the Unicode designation "Cc" (other, control). */
  @js.native
  sealed trait control
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Currency symbol character. Signified by the Unicode designation "Sc" (symbol, currency). */
  @js.native
  sealed trait currencySymbol
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Dash or hyphen character. Signified by the Unicode designation "Pd" (punctuation, dash). */
  @js.native
  sealed trait dashPunctuation
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Decimal digit character, which is a character in the range 0 through 9. Signified by the Unicode designation "Nd" (number, decimal digit). */
  @js.native
  sealed trait decimalDigitNumber
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Enclosing mark character, which is a nonspacing combining character that surrounds all previous characters up to and including a base character. Signified by the Unicode designation "Me" (mark, enclosing). */
  @js.native
  sealed trait enclosingMark
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Closing or final quotation mark character. Signified by the Unicode designation "Pf" (punctuation, final quote). */
  @js.native
  sealed trait finalQuotePunctuation
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Format character that affects the layout of text or the operation of text processes, but is not normally rendered. Signified by the Unicode designation "Cf" (other, format). */
  @js.native
  sealed trait format
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Opening or initial quotation mark character. Signified by the Unicode designation "Pi" (punctuation, initial quote). */
  @js.native
  sealed trait initialQuotePunctuation
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Number represented by a letter, instead of a decimal digit. For example, the Roman numeral for five, which is "V". The indicator is signified by the Unicode designation "Nl" (number, letter). */
  @js.native
  sealed trait letterNumber
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Character that is used to separate lines of text. Signified by the Unicode designation "Zl" (separator, line). */
  @js.native
  sealed trait lineSeparator
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Lowercase letter. Signified by the Unicode designation "Ll" (letter, lowercase). */
  @js.native
  sealed trait lowercaseLetter
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Mathematical symbol character, such as "+" or "=". Signified by the Unicode designation "Sm" (symbol, math). */
  @js.native
  sealed trait mathSymbol
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Modifier letter character, which is a free-standing spacing character that indicates modifications of a preceding letter. Signified by the Unicode designation "Lm" (letter, modifier). */
  @js.native
  sealed trait modifierLetter
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Modifier symbol character, which indicates modifications of surrounding characters. For example, the fraction slash indicates that the number to the left is the numerator and the number to the right is the denominator. The indicator is signified by the Unicode designation "Sk" (symbol, modifier). */
  @js.native
  sealed trait modifierSymbol
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Nonspacing character that indicates modifications of a base character. Signified by the Unicode designation "Mn" (mark, nonspacing), */
  @js.native
  sealed trait nonspacingMark
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Character that is not assigned to any Unicode category. Signified by the Unicode code designation "Cn" (other, not assigned). */
  @js.native
  sealed trait notAssigned
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Opening character of one of the paired punctuation marks, such as parentheses, square brackets, and braces. Signified by the Unicode designation "Ps" (punctuation, open). */
  @js.native
  sealed trait openPunctuation
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Letter that is not an uppercase letter, a lowercase letter, a titlecase letter, or a modifier letter. Signified by the Unicode designation "Lo" (letter, other). */
  @js.native
  sealed trait otherLetter
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Number that is neither a decimal digit nor a letter number. For example, the fraction 1/2. The indicator is signified by the Unicode designation "No" (number, other). */
  @js.native
  sealed trait otherNumber
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Punctuation character that is not a connector, a dash, open punctuation, close punctuation, an initial quote, or a final quote. Signified by the Unicode designation "Po" (punctuation, other). */
  @js.native
  sealed trait otherPunctuation
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Symbol character that is not a mathematical symbol, a currency symbol or a modifier symbol. Signified by the Unicode designation "So" (symbol, other). */
  @js.native
  sealed trait otherSymbol
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Character that is used to separate paragraphs. Signified by the Unicode designation "Zp" (separator, paragraph). */
  @js.native
  sealed trait paragraphSeparator
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Private-use character, with a Unicode value in the range U+E000 through U+F8FF. Signified by the Unicode designation "Co" (other, private use). */
  @js.native
  sealed trait privateUse
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Space character, which has no glyph but is not a control or format character. Signified by the Unicode designation "Zs" (separator, space). */
  @js.native
  sealed trait spaceSeparator
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Spacing character that indicates modifications of a base character and affects the width of the glyph for that base character. Signified by the Unicode designation "Mc" (mark, spacing combining). */
  @js.native
  sealed trait spacingCombiningMark
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** High surrogate or low surrogate character. Surrogate code values are in the range U+D800 through U+DFFF. Signified by the Unicode designation "Cs" (other, surrogate). */
  @js.native
  sealed trait surrogate
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Titlecase letter. Signified by the Unicode designation "Lt" (letter, titlecase). */
  @js.native
  sealed trait titlecaseLetter
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /** Uppercase letter. Signified by the Unicode designation "Lu" (letter, uppercase). */
  @js.native
  sealed trait uppercaseLetter
    extends winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory
  
  /* 21 */ val closePunctuation: closePunctuation with scala.Double = js.native
  /* 18 */ val connectorPunctuation: connectorPunctuation with scala.Double = js.native
  /* 14 */ val control: control with scala.Double = js.native
  /* 26 */ val currencySymbol: currencySymbol with scala.Double = js.native
  /* 19 */ val dashPunctuation: dashPunctuation with scala.Double = js.native
  /* 8 */ val decimalDigitNumber: decimalDigitNumber with scala.Double = js.native
  /* 7 */ val enclosingMark: enclosingMark with scala.Double = js.native
  /* 23 */ val finalQuotePunctuation: finalQuotePunctuation with scala.Double = js.native
  /* 15 */ val format: format with scala.Double = js.native
  /* 22 */ val initialQuotePunctuation: initialQuotePunctuation with scala.Double = js.native
  /* 9 */ val letterNumber: letterNumber with scala.Double = js.native
  /* 12 */ val lineSeparator: lineSeparator with scala.Double = js.native
  /* 1 */ val lowercaseLetter: lowercaseLetter with scala.Double = js.native
  /* 25 */ val mathSymbol: mathSymbol with scala.Double = js.native
  /* 3 */ val modifierLetter: modifierLetter with scala.Double = js.native
  /* 27 */ val modifierSymbol: modifierSymbol with scala.Double = js.native
  /* 5 */ val nonspacingMark: nonspacingMark with scala.Double = js.native
  /* 29 */ val notAssigned: notAssigned with scala.Double = js.native
  /* 20 */ val openPunctuation: openPunctuation with scala.Double = js.native
  /* 4 */ val otherLetter: otherLetter with scala.Double = js.native
  /* 10 */ val otherNumber: otherNumber with scala.Double = js.native
  /* 24 */ val otherPunctuation: otherPunctuation with scala.Double = js.native
  /* 28 */ val otherSymbol: otherSymbol with scala.Double = js.native
  /* 13 */ val paragraphSeparator: paragraphSeparator with scala.Double = js.native
  /* 17 */ val privateUse: privateUse with scala.Double = js.native
  /* 11 */ val spaceSeparator: spaceSeparator with scala.Double = js.native
  /* 6 */ val spacingCombiningMark: spacingCombiningMark with scala.Double = js.native
  /* 16 */ val surrogate: surrogate with scala.Double = js.native
  /* 2 */ val titlecaseLetter: titlecaseLetter with scala.Double = js.native
  /* 0 */ val uppercaseLetter: uppercaseLetter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DataNs.TextNs.UnicodeGeneralCategory with scala.Double] = js.native
}

