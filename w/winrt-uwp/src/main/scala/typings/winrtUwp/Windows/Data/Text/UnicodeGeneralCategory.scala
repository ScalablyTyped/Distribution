package typings.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnicodeGeneralCategory extends StObject
/** Defines the Unicode general category of a character. */
@JSGlobal("Windows.Data.Text.UnicodeGeneralCategory")
@js.native
object UnicodeGeneralCategory extends StObject {
  
  /** Closing character of one of the paired punctuation marks, such as parentheses, square brackets, and braces. Signified by the Unicode designation "Pe" (punctuation, close). */
  @js.native
  sealed trait closePunctuation
    extends StObject
       with UnicodeGeneralCategory
  
  /** Connector punctuation character that connects two characters. Signified by the Unicode designation "Pc" (punctuation, connector). */
  @js.native
  sealed trait connectorPunctuation
    extends StObject
       with UnicodeGeneralCategory
  
  /** Control code character, with a Unicode value of U+007F or in the range U+0000 through U+001F or U+0080 through U+009F. Signified by the Unicode designation "Cc" (other, control). */
  @js.native
  sealed trait control
    extends StObject
       with UnicodeGeneralCategory
  
  /** Currency symbol character. Signified by the Unicode designation "Sc" (symbol, currency). */
  @js.native
  sealed trait currencySymbol
    extends StObject
       with UnicodeGeneralCategory
  
  /** Dash or hyphen character. Signified by the Unicode designation "Pd" (punctuation, dash). */
  @js.native
  sealed trait dashPunctuation
    extends StObject
       with UnicodeGeneralCategory
  
  /** Decimal digit character, which is a character in the range 0 through 9. Signified by the Unicode designation "Nd" (number, decimal digit). */
  @js.native
  sealed trait decimalDigitNumber
    extends StObject
       with UnicodeGeneralCategory
  
  /** Enclosing mark character, which is a nonspacing combining character that surrounds all previous characters up to and including a base character. Signified by the Unicode designation "Me" (mark, enclosing). */
  @js.native
  sealed trait enclosingMark
    extends StObject
       with UnicodeGeneralCategory
  
  /** Closing or final quotation mark character. Signified by the Unicode designation "Pf" (punctuation, final quote). */
  @js.native
  sealed trait finalQuotePunctuation
    extends StObject
       with UnicodeGeneralCategory
  
  /** Format character that affects the layout of text or the operation of text processes, but is not normally rendered. Signified by the Unicode designation "Cf" (other, format). */
  @js.native
  sealed trait format
    extends StObject
       with UnicodeGeneralCategory
  
  /** Opening or initial quotation mark character. Signified by the Unicode designation "Pi" (punctuation, initial quote). */
  @js.native
  sealed trait initialQuotePunctuation
    extends StObject
       with UnicodeGeneralCategory
  
  /** Number represented by a letter, instead of a decimal digit. For example, the Roman numeral for five, which is "V". The indicator is signified by the Unicode designation "Nl" (number, letter). */
  @js.native
  sealed trait letterNumber
    extends StObject
       with UnicodeGeneralCategory
  
  /** Character that is used to separate lines of text. Signified by the Unicode designation "Zl" (separator, line). */
  @js.native
  sealed trait lineSeparator
    extends StObject
       with UnicodeGeneralCategory
  
  /** Lowercase letter. Signified by the Unicode designation "Ll" (letter, lowercase). */
  @js.native
  sealed trait lowercaseLetter
    extends StObject
       with UnicodeGeneralCategory
  
  /** Mathematical symbol character, such as "+" or "=". Signified by the Unicode designation "Sm" (symbol, math). */
  @js.native
  sealed trait mathSymbol
    extends StObject
       with UnicodeGeneralCategory
  
  /** Modifier letter character, which is a free-standing spacing character that indicates modifications of a preceding letter. Signified by the Unicode designation "Lm" (letter, modifier). */
  @js.native
  sealed trait modifierLetter
    extends StObject
       with UnicodeGeneralCategory
  
  /** Modifier symbol character, which indicates modifications of surrounding characters. For example, the fraction slash indicates that the number to the left is the numerator and the number to the right is the denominator. The indicator is signified by the Unicode designation "Sk" (symbol, modifier). */
  @js.native
  sealed trait modifierSymbol
    extends StObject
       with UnicodeGeneralCategory
  
  /** Nonspacing character that indicates modifications of a base character. Signified by the Unicode designation "Mn" (mark, nonspacing), */
  @js.native
  sealed trait nonspacingMark
    extends StObject
       with UnicodeGeneralCategory
  
  /** Character that is not assigned to any Unicode category. Signified by the Unicode code designation "Cn" (other, not assigned). */
  @js.native
  sealed trait notAssigned
    extends StObject
       with UnicodeGeneralCategory
  
  /** Opening character of one of the paired punctuation marks, such as parentheses, square brackets, and braces. Signified by the Unicode designation "Ps" (punctuation, open). */
  @js.native
  sealed trait openPunctuation
    extends StObject
       with UnicodeGeneralCategory
  
  /** Letter that is not an uppercase letter, a lowercase letter, a titlecase letter, or a modifier letter. Signified by the Unicode designation "Lo" (letter, other). */
  @js.native
  sealed trait otherLetter
    extends StObject
       with UnicodeGeneralCategory
  
  /** Number that is neither a decimal digit nor a letter number. For example, the fraction 1/2. The indicator is signified by the Unicode designation "No" (number, other). */
  @js.native
  sealed trait otherNumber
    extends StObject
       with UnicodeGeneralCategory
  
  /** Punctuation character that is not a connector, a dash, open punctuation, close punctuation, an initial quote, or a final quote. Signified by the Unicode designation "Po" (punctuation, other). */
  @js.native
  sealed trait otherPunctuation
    extends StObject
       with UnicodeGeneralCategory
  
  /** Symbol character that is not a mathematical symbol, a currency symbol or a modifier symbol. Signified by the Unicode designation "So" (symbol, other). */
  @js.native
  sealed trait otherSymbol
    extends StObject
       with UnicodeGeneralCategory
  
  /** Character that is used to separate paragraphs. Signified by the Unicode designation "Zp" (separator, paragraph). */
  @js.native
  sealed trait paragraphSeparator
    extends StObject
       with UnicodeGeneralCategory
  
  /** Private-use character, with a Unicode value in the range U+E000 through U+F8FF. Signified by the Unicode designation "Co" (other, private use). */
  @js.native
  sealed trait privateUse
    extends StObject
       with UnicodeGeneralCategory
  
  /** Space character, which has no glyph but is not a control or format character. Signified by the Unicode designation "Zs" (separator, space). */
  @js.native
  sealed trait spaceSeparator
    extends StObject
       with UnicodeGeneralCategory
  
  /** Spacing character that indicates modifications of a base character and affects the width of the glyph for that base character. Signified by the Unicode designation "Mc" (mark, spacing combining). */
  @js.native
  sealed trait spacingCombiningMark
    extends StObject
       with UnicodeGeneralCategory
  
  /** High surrogate or low surrogate character. Surrogate code values are in the range U+D800 through U+DFFF. Signified by the Unicode designation "Cs" (other, surrogate). */
  @js.native
  sealed trait surrogate
    extends StObject
       with UnicodeGeneralCategory
  
  /** Titlecase letter. Signified by the Unicode designation "Lt" (letter, titlecase). */
  @js.native
  sealed trait titlecaseLetter
    extends StObject
       with UnicodeGeneralCategory
  
  /** Uppercase letter. Signified by the Unicode designation "Lu" (letter, uppercase). */
  @js.native
  sealed trait uppercaseLetter
    extends StObject
       with UnicodeGeneralCategory
}
