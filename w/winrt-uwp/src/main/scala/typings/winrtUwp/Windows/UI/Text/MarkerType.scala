package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerType with Double] = js.native
  /* 3 */ @js.native
  object arabic extends TopLevel[arabic with Double]
  
  /* 18 */ @js.native
  object arabicAbjad extends TopLevel[arabicAbjad with Double]
  
  /* 17 */ @js.native
  object arabicDictionary extends TopLevel[arabicDictionary with Double]
  
  /* 12 */ @js.native
  object arabicWide extends TopLevel[arabicWide with Double]
  
  /* 10 */ @js.native
  object blackCircleWingding extends TopLevel[blackCircleWingding with Double]
  
  /* 2 */ @js.native
  object bullet extends TopLevel[bullet with Double]
  
  /* 9 */ @js.native
  object circledNumber extends TopLevel[circledNumber with Double]
  
  /* 23 */ @js.native
  object devanagariConsonant extends TopLevel[devanagariConsonant with Double]
  
  /* 24 */ @js.native
  object devanagariNumeric extends TopLevel[devanagariNumeric with Double]
  
  /* 22 */ @js.native
  object devanagariVowel extends TopLevel[devanagariVowel with Double]
  
  /* 19 */ @js.native
  object hebrew extends TopLevel[hebrew with Double]
  
  /* 16 */ @js.native
  object japanKorea extends TopLevel[japanKorea with Double]
  
  /* 15 */ @js.native
  object japanSimplifiedChinese extends TopLevel[japanSimplifiedChinese with Double]
  
  /* 4 */ @js.native
  object lowercaseEnglishLetter extends TopLevel[lowercaseEnglishLetter with Double]
  
  /* 6 */ @js.native
  object lowercaseRoman extends TopLevel[lowercaseRoman with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 13 */ @js.native
  object simplifiedChinese extends TopLevel[simplifiedChinese with Double]
  
  /* 20 */ @js.native
  object thaiAlphabetic extends TopLevel[thaiAlphabetic with Double]
  
  /* 21 */ @js.native
  object thaiNumeric extends TopLevel[thaiNumeric with Double]
  
  /* 14 */ @js.native
  object traditionalChinese extends TopLevel[traditionalChinese with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
  /* 8 */ @js.native
  object unicodeSequence extends TopLevel[unicodeSequence with Double]
  
  /* 5 */ @js.native
  object uppercaseEnglishLetter extends TopLevel[uppercaseEnglishLetter with Double]
  
  /* 7 */ @js.native
  object uppercaseRoman extends TopLevel[uppercaseRoman with Double]
  
  /* 11 */ @js.native
  object whiteCircleWingding extends TopLevel[whiteCircleWingding with Double]
  
}

