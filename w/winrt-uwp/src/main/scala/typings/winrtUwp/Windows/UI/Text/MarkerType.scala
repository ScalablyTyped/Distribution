package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerType extends StObject
/** Specifies the kind of characters used to mark the item paragraphs in a list. */
@JSGlobal("Windows.UI.Text.MarkerType")
@js.native
object MarkerType extends StObject {
  
  /** The list is numbered with Arabic numerals (0, 1, 2, ...). */
  @js.native
  sealed trait arabic
    extends StObject
       with MarkerType
  
  /** Arabic abjadi ( أ ,ب ,ج ,د ,…). */
  @js.native
  sealed trait arabicAbjad
    extends StObject
       with MarkerType
  
  /** Arabic alphabetic ( أ ,ب ,ت ,ث ,…). */
  @js.native
  sealed trait arabicDictionary
    extends StObject
       with MarkerType
  
  /** Full-width ASCII (０, １, ２, ３, …). */
  @js.native
  sealed trait arabicWide
    extends StObject
       with MarkerType
  
  /** The list is ordered with Wingdings black circled digits */
  @js.native
  sealed trait blackCircleWingding
    extends StObject
       with MarkerType
  
  /** The list uses bullets (character code 0x2022). */
  @js.native
  sealed trait bullet
    extends StObject
       with MarkerType
  
  /** The list is ordered with Unicode circled numbers */
  @js.native
  sealed trait circledNumber
    extends StObject
       with MarkerType
  
  /** Devanāgarī consonants (क, ख, ग, घ, …). */
  @js.native
  sealed trait devanagariConsonant
    extends StObject
       with MarkerType
  
  /** Devanāgarī numbers (१, २, ३, ४, …). */
  @js.native
  sealed trait devanagariNumeric
    extends StObject
       with MarkerType
  
  /** Devanāgarī vowels (अ, आ, इ, ई, …). */
  @js.native
  sealed trait devanagariVowel
    extends StObject
       with MarkerType
  
  /** Hebrew alphabet (א, ב, ג, ד, …). */
  @js.native
  sealed trait hebrew
    extends StObject
       with MarkerType
  
  /** Chinese with no 十. */
  @js.native
  sealed trait japanKorea
    extends StObject
       with MarkerType
  
  /** Chinese with a full-width period, no 十. */
  @js.native
  sealed trait japanSimplifiedChinese
    extends StObject
       with MarkerType
  
  /** The list is ordered with lowercase letters (a, b, c, ...). */
  @js.native
  sealed trait lowercaseEnglishLetter
    extends StObject
       with MarkerType
  
  /** The list is ordered with lowercase Roman letters (i, ii, iii, ...). */
  @js.native
  sealed trait lowercaseRoman
    extends StObject
       with MarkerType
  
  /** Not a list paragraph. */
  @js.native
  sealed trait none
    extends StObject
       with MarkerType
  
  /** Chinese with 十 only in items 10 through 99 (一, 二, 三, 四, …). */
  @js.native
  sealed trait simplifiedChinese
    extends StObject
       with MarkerType
  
  /** Thai alphabetic (ก, ข,ค, ง, …). */
  @js.native
  sealed trait thaiAlphabetic
    extends StObject
       with MarkerType
  
  /** Thai numbers (๑, ๒,๓, ๔, …). */
  @js.native
  sealed trait thaiNumeric
    extends StObject
       with MarkerType
  
  /** Chinese with 十 only in items 10 through 19. */
  @js.native
  sealed trait traditionalChinese
    extends StObject
       with MarkerType
  
  /** The list type is not defined. */
  @js.native
  sealed trait undefined
    extends StObject
       with MarkerType
  
  /** The value returned by ITextParagraphFormat.ListStart is treated as the first code in a Unicode sequence. */
  @js.native
  sealed trait unicodeSequence
    extends StObject
       with MarkerType
  
  /** The list is ordered with uppercase letters (A, B, C, ...). */
  @js.native
  sealed trait uppercaseEnglishLetter
    extends StObject
       with MarkerType
  
  /** The list is ordered with uppercase Roman letters (I, II, III, ...). */
  @js.native
  sealed trait uppercaseRoman
    extends StObject
       with MarkerType
  
  /** The list is ordered with Wingdings white circled digits */
  @js.native
  sealed trait whiteCircleWingding
    extends StObject
       with MarkerType
}
