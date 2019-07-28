package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  sealed trait arabic extends MarkerType
  
  /** Arabic abjadi ( أ ,ب ,ج ,د ,…). */
  @js.native
  sealed trait arabicAbjad extends MarkerType
  
  /** Arabic alphabetic ( أ ,ب ,ت ,ث ,…). */
  @js.native
  sealed trait arabicDictionary extends MarkerType
  
  /** Full-width ASCII (０, １, ２, ３, …). */
  @js.native
  sealed trait arabicWide extends MarkerType
  
  /** The list is ordered with Wingdings black circled digits */
  @js.native
  sealed trait blackCircleWingding extends MarkerType
  
  /** The list uses bullets (character code 0x2022). */
  @js.native
  sealed trait bullet extends MarkerType
  
  /** The list is ordered with Unicode circled numbers */
  @js.native
  sealed trait circledNumber extends MarkerType
  
  /** Devanāgarī consonants (क, ख, ग, घ, …). */
  @js.native
  sealed trait devanagariConsonant extends MarkerType
  
  /** Devanāgarī numbers (१, २, ३, ४, …). */
  @js.native
  sealed trait devanagariNumeric extends MarkerType
  
  /** Devanāgarī vowels (अ, आ, इ, ई, …). */
  @js.native
  sealed trait devanagariVowel extends MarkerType
  
  /** Hebrew alphabet (א, ב, ג, ד, …). */
  @js.native
  sealed trait hebrew extends MarkerType
  
  /** Chinese with no 十. */
  @js.native
  sealed trait japanKorea extends MarkerType
  
  /** Chinese with a full-width period, no 十. */
  @js.native
  sealed trait japanSimplifiedChinese extends MarkerType
  
  /** The list is ordered with lowercase letters (a, b, c, ...). */
  @js.native
  sealed trait lowercaseEnglishLetter extends MarkerType
  
  /** The list is ordered with lowercase Roman letters (i, ii, iii, ...). */
  @js.native
  sealed trait lowercaseRoman extends MarkerType
  
  /** Not a list paragraph. */
  @js.native
  sealed trait none extends MarkerType
  
  /** Chinese with 十 only in items 10 through 99 (一, 二, 三, 四, …). */
  @js.native
  sealed trait simplifiedChinese extends MarkerType
  
  /** Thai alphabetic (ก, ข,ค, ง, …). */
  @js.native
  sealed trait thaiAlphabetic extends MarkerType
  
  /** Thai numbers (๑, ๒,๓, ๔, …). */
  @js.native
  sealed trait thaiNumeric extends MarkerType
  
  /** Chinese with 十 only in items 10 through 19. */
  @js.native
  sealed trait traditionalChinese extends MarkerType
  
  /** The list type is not defined. */
  @js.native
  sealed trait undefined extends MarkerType
  
  /** The value returned by ITextParagraphFormat.ListStart is treated as the first code in a Unicode sequence. */
  @js.native
  sealed trait unicodeSequence extends MarkerType
  
  /** The list is ordered with uppercase letters (A, B, C, ...). */
  @js.native
  sealed trait uppercaseEnglishLetter extends MarkerType
  
  /** The list is ordered with uppercase Roman letters (I, II, III, ...). */
  @js.native
  sealed trait uppercaseRoman extends MarkerType
  
  /** The list is ordered with Wingdings white circled digits */
  @js.native
  sealed trait whiteCircleWingding extends MarkerType
  
  /* 3 */ val arabic: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.arabic with Double = js.native
  /* 18 */ val arabicAbjad: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.arabicAbjad with Double = js.native
  /* 17 */ val arabicDictionary: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.arabicDictionary with Double = js.native
  /* 12 */ val arabicWide: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.arabicWide with Double = js.native
  /* 10 */ val blackCircleWingding: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.blackCircleWingding with Double = js.native
  /* 2 */ val bullet: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.bullet with Double = js.native
  /* 9 */ val circledNumber: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.circledNumber with Double = js.native
  /* 23 */ val devanagariConsonant: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.devanagariConsonant with Double = js.native
  /* 24 */ val devanagariNumeric: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.devanagariNumeric with Double = js.native
  /* 22 */ val devanagariVowel: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.devanagariVowel with Double = js.native
  /* 19 */ val hebrew: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.hebrew with Double = js.native
  /* 16 */ val japanKorea: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.japanKorea with Double = js.native
  /* 15 */ val japanSimplifiedChinese: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.japanSimplifiedChinese with Double = js.native
  /* 4 */ val lowercaseEnglishLetter: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.lowercaseEnglishLetter with Double = js.native
  /* 6 */ val lowercaseRoman: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.lowercaseRoman with Double = js.native
  /* 1 */ val none: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.none with Double = js.native
  /* 13 */ val simplifiedChinese: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.simplifiedChinese with Double = js.native
  /* 20 */ val thaiAlphabetic: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.thaiAlphabetic with Double = js.native
  /* 21 */ val thaiNumeric: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.thaiNumeric with Double = js.native
  /* 14 */ val traditionalChinese: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.traditionalChinese with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.undefined with Double = js.native
  /* 8 */ val unicodeSequence: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.unicodeSequence with Double = js.native
  /* 5 */ val uppercaseEnglishLetter: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.uppercaseEnglishLetter with Double = js.native
  /* 7 */ val uppercaseRoman: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.uppercaseRoman with Double = js.native
  /* 11 */ val whiteCircleWingding: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerType.whiteCircleWingding with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerType with Double] = js.native
}

