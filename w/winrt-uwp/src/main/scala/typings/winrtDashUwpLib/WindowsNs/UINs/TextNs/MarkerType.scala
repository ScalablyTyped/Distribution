package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerType extends js.Object

/** Specifies the kind of characters used to mark the item paragraphs in a list. */
@JSGlobal("Windows.UI.Text.MarkerType")
@js.native
object MarkerType extends js.Object {
  /** The list is numbered with Arabic numerals (0, 1, 2, ...). */
  @js.native
  sealed trait arabic
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Arabic abjadi ( أ ,ب ,ج ,د ,…). */
  @js.native
  sealed trait arabicAbjad
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Arabic alphabetic ( أ ,ب ,ت ,ث ,…). */
  @js.native
  sealed trait arabicDictionary
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Full-width ASCII (０, １, ２, ３, …). */
  @js.native
  sealed trait arabicWide
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list is ordered with Wingdings black circled digits */
  @js.native
  sealed trait blackCircleWingding
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list uses bullets (character code 0x2022). */
  @js.native
  sealed trait bullet
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list is ordered with Unicode circled numbers */
  @js.native
  sealed trait circledNumber
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Devanāgarī consonants (क, ख, ग, घ, …). */
  @js.native
  sealed trait devanagariConsonant
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Devanāgarī numbers (१, २, ३, ४, …). */
  @js.native
  sealed trait devanagariNumeric
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Devanāgarī vowels (अ, आ, इ, ई, …). */
  @js.native
  sealed trait devanagariVowel
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Hebrew alphabet (א, ב, ג, ד, …). */
  @js.native
  sealed trait hebrew
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Chinese with no 十. */
  @js.native
  sealed trait japanKorea
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Chinese with a full-width period, no 十. */
  @js.native
  sealed trait japanSimplifiedChinese
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list is ordered with lowercase letters (a, b, c, ...). */
  @js.native
  sealed trait lowercaseEnglishLetter
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list is ordered with lowercase Roman letters (i, ii, iii, ...). */
  @js.native
  sealed trait lowercaseRoman
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Not a list paragraph. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Chinese with 十 only in items 10 through 99 (一, 二, 三, 四, …). */
  @js.native
  sealed trait simplifiedChinese
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Thai alphabetic (ก, ข,ค, ง, …). */
  @js.native
  sealed trait thaiAlphabetic
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Thai numbers (๑, ๒,๓, ๔, …). */
  @js.native
  sealed trait thaiNumeric
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** Chinese with 十 only in items 10 through 19. */
  @js.native
  sealed trait traditionalChinese
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list type is not defined. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The value returned by ITextParagraphFormat.ListStart is treated as the first code in a Unicode sequence. */
  @js.native
  sealed trait unicodeSequence
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list is ordered with uppercase letters (A, B, C, ...). */
  @js.native
  sealed trait uppercaseEnglishLetter
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list is ordered with uppercase Roman letters (I, II, III, ...). */
  @js.native
  sealed trait uppercaseRoman
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /** The list is ordered with Wingdings white circled digits */
  @js.native
  sealed trait whiteCircleWingding
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType
  
  /* 3 */ val arabic: arabic with scala.Double = js.native
  /* 18 */ val arabicAbjad: arabicAbjad with scala.Double = js.native
  /* 17 */ val arabicDictionary: arabicDictionary with scala.Double = js.native
  /* 12 */ val arabicWide: arabicWide with scala.Double = js.native
  /* 10 */ val blackCircleWingding: blackCircleWingding with scala.Double = js.native
  /* 2 */ val bullet: bullet with scala.Double = js.native
  /* 9 */ val circledNumber: circledNumber with scala.Double = js.native
  /* 23 */ val devanagariConsonant: devanagariConsonant with scala.Double = js.native
  /* 24 */ val devanagariNumeric: devanagariNumeric with scala.Double = js.native
  /* 22 */ val devanagariVowel: devanagariVowel with scala.Double = js.native
  /* 19 */ val hebrew: hebrew with scala.Double = js.native
  /* 16 */ val japanKorea: japanKorea with scala.Double = js.native
  /* 15 */ val japanSimplifiedChinese: japanSimplifiedChinese with scala.Double = js.native
  /* 4 */ val lowercaseEnglishLetter: lowercaseEnglishLetter with scala.Double = js.native
  /* 6 */ val lowercaseRoman: lowercaseRoman with scala.Double = js.native
  /* 1 */ val none: none with scala.Double = js.native
  /* 13 */ val simplifiedChinese: simplifiedChinese with scala.Double = js.native
  /* 20 */ val thaiAlphabetic: thaiAlphabetic with scala.Double = js.native
  /* 21 */ val thaiNumeric: thaiNumeric with scala.Double = js.native
  /* 14 */ val traditionalChinese: traditionalChinese with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  /* 8 */ val unicodeSequence: unicodeSequence with scala.Double = js.native
  /* 5 */ val uppercaseEnglishLetter: uppercaseEnglishLetter with scala.Double = js.native
  /* 7 */ val uppercaseRoman: uppercaseRoman with scala.Double = js.native
  /* 11 */ val whiteCircleWingding: whiteCircleWingding with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType with scala.Double] = js.native
}

