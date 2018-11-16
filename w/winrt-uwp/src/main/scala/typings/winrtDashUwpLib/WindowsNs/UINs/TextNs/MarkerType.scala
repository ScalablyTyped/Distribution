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
  
  val arabic: arabic with java.lang.String = js.native
  val arabicAbjad: arabicAbjad with java.lang.String = js.native
  val arabicDictionary: arabicDictionary with java.lang.String = js.native
  val arabicWide: arabicWide with java.lang.String = js.native
  val blackCircleWingding: blackCircleWingding with java.lang.String = js.native
  val bullet: bullet with java.lang.String = js.native
  val circledNumber: circledNumber with java.lang.String = js.native
  val devanagariConsonant: devanagariConsonant with java.lang.String = js.native
  val devanagariNumeric: devanagariNumeric with java.lang.String = js.native
  val devanagariVowel: devanagariVowel with java.lang.String = js.native
  val hebrew: hebrew with java.lang.String = js.native
  val japanKorea: japanKorea with java.lang.String = js.native
  val japanSimplifiedChinese: japanSimplifiedChinese with java.lang.String = js.native
  val lowercaseEnglishLetter: lowercaseEnglishLetter with java.lang.String = js.native
  val lowercaseRoman: lowercaseRoman with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val simplifiedChinese: simplifiedChinese with java.lang.String = js.native
  val thaiAlphabetic: thaiAlphabetic with java.lang.String = js.native
  val thaiNumeric: thaiNumeric with java.lang.String = js.native
  val traditionalChinese: traditionalChinese with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  val unicodeSequence: unicodeSequence with java.lang.String = js.native
  val uppercaseEnglishLetter: uppercaseEnglishLetter with java.lang.String = js.native
  val uppercaseRoman: uppercaseRoman with java.lang.String = js.native
  val whiteCircleWingding: whiteCircleWingding with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerType with java.lang.String] = js.native
}

