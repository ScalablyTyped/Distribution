package typings.winrtUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreTextInputScope extends js.Object

/** Defines constants that specify the set of input scope names. Input scope is used by the text input server and input processors to determine the layout of the Soft Input Panel (SIP), and what type of language model to use. */
@JSGlobal("Windows.UI.Text.Core.CoreTextInputScope")
@js.native
object CoreTextInputScope extends js.Object {
  /** Expected input is a full postal address. (For example, "One Microsoft Way, Redmond, WA 98052, U.S.A.") */
  @js.native
  sealed trait address extends CoreTextInputScope
  
  /** Expected input is the city portion a full address. (For example, "Redmond".) */
  @js.native
  sealed trait addressCity extends CoreTextInputScope
  
  /** Expected input is the country name portion a full address. (For example, "United States of America".) */
  @js.native
  sealed trait addressCountryName extends CoreTextInputScope
  
  /** Expected input is the country abbreviation portion a full address. (For example, "U.S.A.") */
  @js.native
  sealed trait addressCountryShortName extends CoreTextInputScope
  
  /** Expected input is the postal code (or zip code) portion a full address. (For example, "98052".) */
  @js.native
  sealed trait addressPostalCode extends CoreTextInputScope
  
  /** Expected input is the state or province portion a full address. (For example, "WA".) */
  @js.native
  sealed trait addressStateOrProvince extends CoreTextInputScope
  
  /** Expected input is the street portion a full address. (For example, "Microsoft Way".) */
  @js.native
  sealed trait addressStreet extends CoreTextInputScope
  
  /** Expected input is full-width alphanumeric characters. */
  @js.native
  sealed trait alphanumericFullWidth extends CoreTextInputScope
  
  /** Expected input is half-width alphanumeric characters. */
  @js.native
  sealed trait alphanumericHalfWidth extends CoreTextInputScope
  
  /** Expected input is the Bopomofo Mandarin Chinese phonetic transcription system. */
  @js.native
  sealed trait bopomofo extends CoreTextInputScope
  
  /** Expected input is chat strings. */
  @js.native
  sealed trait chat extends CoreTextInputScope
  
  /** Expected input is Chinese full-width characters. */
  @js.native
  sealed trait chineseFullWidth extends CoreTextInputScope
  
  /** Expected input is Chinese half-width characters. */
  @js.native
  sealed trait chineseHalfWidth extends CoreTextInputScope
  
  /** Expected input is an amount of currency. */
  @js.native
  sealed trait currencyAmount extends CoreTextInputScope
  
  /** Expected input is an amount of currency and a currency symbol. */
  @js.native
  sealed trait currencyAmountAndSymbol extends CoreTextInputScope
  
  /** Expected input is Chinese currency. */
  @js.native
  sealed trait currencyChinese extends CoreTextInputScope
  
  /** Expected input is a calendar date. */
  @js.native
  sealed trait date extends CoreTextInputScope
  
  /** Expected input is the numeric day portion of a calendar date. */
  @js.native
  sealed trait dateDay extends CoreTextInputScope
  
  /** Expected input is the name of the day in a calendar date. */
  @js.native
  sealed trait dateDayName extends CoreTextInputScope
  
  /** Expected input is the numeric month portion of a calendar date. */
  @js.native
  sealed trait dateMonth extends CoreTextInputScope
  
  /** Expected input is the name of the month portion of a calendar date. */
  @js.native
  sealed trait dateMonthName extends CoreTextInputScope
  
  /** Expected input is the year portion of a calendar date. */
  @js.native
  sealed trait dateYear extends CoreTextInputScope
  
  /** No input scope is applied. */
  @js.native
  sealed trait default extends CoreTextInputScope
  
  /** Expected input is an SMTP form email address (<accountname>@<host>). */
  @js.native
  sealed trait emailAddress extends CoreTextInputScope
  
  /** Expected input is the account name portion of an email address. */
  @js.native
  sealed trait emailUserName extends CoreTextInputScope
  
  /** Expected input is an email user name (<accountname>) or full email address (<accountname>@<host>). */
  @js.native
  sealed trait emailUserNameOrAddress extends CoreTextInputScope
  
  /** Expected input is characters used in describing a file name. */
  @js.native
  sealed trait fileName extends CoreTextInputScope
  
  /** Expected input is characters used in describing a file path. */
  @js.native
  sealed trait filePath extends CoreTextInputScope
  
  /** Expected input is a mathematical formula. */
  @js.native
  sealed trait formula extends CoreTextInputScope
  
  /** Expected input is a mathematical formula. Advises input processors to show the number page of the SIP. */
  @js.native
  sealed trait formulaNumber extends CoreTextInputScope
  
  /** Expected input is Hangul full-width characters. */
  @js.native
  sealed trait hangulFullWidth extends CoreTextInputScope
  
  /** Expected input is Hangul half-width characters. */
  @js.native
  sealed trait hangulHalfWidth extends CoreTextInputScope
  
  /** Expected input is Hanja characters. */
  @js.native
  sealed trait hanja extends CoreTextInputScope
  
  /** Expected input is Hiragana characters. */
  @js.native
  sealed trait hiragana extends CoreTextInputScope
  
  /** Expected input is Katakana full-width characters. */
  @js.native
  sealed trait katakanaFullWidth extends CoreTextInputScope
  
  /** Expected input is Katakana half-width characters. */
  @js.native
  sealed trait katakanaHalfWidth extends CoreTextInputScope
  
  /** Expected input is from the device's Maps layout; does not include typing intelligence. */
  @js.native
  sealed trait maps extends CoreTextInputScope
  
  /** Expected input is a name or a telephone number. */
  @js.native
  sealed trait nameOrPhoneNumber extends CoreTextInputScope
  
  /** Expected input is native script. */
  @js.native
  sealed trait nativeScript extends CoreTextInputScope
  
  /** Expected input is the digits 0-9. */
  @js.native
  sealed trait number extends CoreTextInputScope
  
  /** Expected input is full-width number characters. */
  @js.native
  sealed trait numberFullWidth extends CoreTextInputScope
  
  /** Expected input is a password. */
  @js.native
  sealed trait password extends CoreTextInputScope
  
  /** Expected input is a numeric password, or PIN. */
  @js.native
  sealed trait passwordNumeric extends CoreTextInputScope
  
  /** Expected input is a person’s full name, including prefix, given name, middle name, surname, and suffix. */
  @js.native
  sealed trait personalFullName extends CoreTextInputScope
  
  /** Expected input is the given (or first) name portion of a person’s full name. */
  @js.native
  sealed trait personalGivenName extends CoreTextInputScope
  
  /** Expected input is the middle name portion of a person’s full name. */
  @js.native
  sealed trait personalMiddleName extends CoreTextInputScope
  
  /** Expected input is the prefix portion of a person’s full name. (For example, "Mr.") */
  @js.native
  sealed trait personalNamePrefix extends CoreTextInputScope
  
  /** Expected input is the suffix portion of a person’s full name. (For example, "Jr.") */
  @js.native
  sealed trait personalNameSuffix extends CoreTextInputScope
  
  /** Expected input is the family (or last) name portion of a person’s full name. */
  @js.native
  sealed trait personalSurname extends CoreTextInputScope
  
  /** Expected input is private text. Advises input processors that the text should not be stored nor logged. */
  @js.native
  sealed trait `private` extends CoreTextInputScope
  
  /** Expected input is a search string. */
  @js.native
  sealed trait search extends CoreTextInputScope
  
  /** Expected input is a search string. Use for search boxes where incremental results are displayed as the user types. */
  @js.native
  sealed trait searchIncremental extends CoreTextInputScope
  
  /** Expected input is a single ANSI character, codepage 1252. */
  @js.native
  sealed trait singleCharacter extends CoreTextInputScope
  
  /** Expected input is the area code portion of a full telephone number. (For example, "(800)".) */
  @js.native
  sealed trait telephoneAreaCode extends CoreTextInputScope
  
  /** Expected input is the country code portion of a full telephone number. (For example, "1".) */
  @js.native
  sealed trait telephoneCountryCode extends CoreTextInputScope
  
  /** Expected input is the local number portion of a full telephone number. (For example, "555-5555".) */
  @js.native
  sealed trait telephoneLocalNumber extends CoreTextInputScope
  
  /** Expected input is a full telephone number. (For example, "1(800)555-5555".) */
  @js.native
  sealed trait telephoneNumber extends CoreTextInputScope
  
  /** Expected input is text; turns on typing intelligence. */
  @js.native
  sealed trait text extends CoreTextInputScope
  
  /** Expected input is a time value. */
  @js.native
  sealed trait time extends CoreTextInputScope
  
  /** Expected input is the hour portion of a time value. */
  @js.native
  sealed trait timeHour extends CoreTextInputScope
  
  /** Expected input is the minute or second portion of a time value. */
  @js.native
  sealed trait timeMinuteOrSecond extends CoreTextInputScope
  
  /** Expected input is a URL. */
  @js.native
  sealed trait url extends CoreTextInputScope
  
  /** Expected input is a log-in name and a domain (<accountname> or <domain>\<accountname>). */
  @js.native
  sealed trait userName extends CoreTextInputScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextInputScope with Double] = js.native
  /* 13 */ @js.native
  object address extends TopLevel[address with Double]
  
  /* 17 */ @js.native
  object addressCity extends TopLevel[addressCity with Double]
  
  /* 18 */ @js.native
  object addressCountryName extends TopLevel[addressCountryName with Double]
  
  /* 19 */ @js.native
  object addressCountryShortName extends TopLevel[addressCountryShortName with Double]
  
  /* 14 */ @js.native
  object addressPostalCode extends TopLevel[addressPostalCode with Double]
  
  /* 16 */ @js.native
  object addressStateOrProvince extends TopLevel[addressStateOrProvince with Double]
  
  /* 15 */ @js.native
  object addressStreet extends TopLevel[addressStreet with Double]
  
  /* 40 */ @js.native
  object alphanumericFullWidth extends TopLevel[alphanumericFullWidth with Double]
  
  /* 39 */ @js.native
  object alphanumericHalfWidth extends TopLevel[alphanumericHalfWidth with Double]
  
  /* 42 */ @js.native
  object bopomofo extends TopLevel[bopomofo with Double]
  
  /* 56 */ @js.native
  object chat extends TopLevel[chat with Double]
  
  /* 53 */ @js.native
  object chineseFullWidth extends TopLevel[chineseFullWidth with Double]
  
  /* 52 */ @js.native
  object chineseHalfWidth extends TopLevel[chineseHalfWidth with Double]
  
  /* 21 */ @js.native
  object currencyAmount extends TopLevel[currencyAmount with Double]
  
  /* 20 */ @js.native
  object currencyAmountAndSymbol extends TopLevel[currencyAmountAndSymbol with Double]
  
  /* 41 */ @js.native
  object currencyChinese extends TopLevel[currencyChinese with Double]
  
  /* 22 */ @js.native
  object date extends TopLevel[date with Double]
  
  /* 24 */ @js.native
  object dateDay extends TopLevel[dateDay with Double]
  
  /* 27 */ @js.native
  object dateDayName extends TopLevel[dateDayName with Double]
  
  /* 23 */ @js.native
  object dateMonth extends TopLevel[dateMonth with Double]
  
  /* 26 */ @js.native
  object dateMonthName extends TopLevel[dateMonthName with Double]
  
  /* 25 */ @js.native
  object dateYear extends TopLevel[dateYear with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 5 */ @js.native
  object emailAddress extends TopLevel[emailAddress with Double]
  
  /* 4 */ @js.native
  object emailUserName extends TopLevel[emailUserName with Double]
  
  /* 58 */ @js.native
  object emailUserNameOrAddress extends TopLevel[emailUserNameOrAddress with Double]
  
  /* 3 */ @js.native
  object fileName extends TopLevel[fileName with Double]
  
  /* 2 */ @js.native
  object filePath extends TopLevel[filePath with Double]
  
  /* 50 */ @js.native
  object formula extends TopLevel[formula with Double]
  
  /* 62 */ @js.native
  object formulaNumber extends TopLevel[formulaNumber with Double]
  
  /* 48 */ @js.native
  object hangulFullWidth extends TopLevel[hangulFullWidth with Double]
  
  /* 47 */ @js.native
  object hangulHalfWidth extends TopLevel[hangulHalfWidth with Double]
  
  /* 46 */ @js.native
  object hanja extends TopLevel[hanja with Double]
  
  /* 43 */ @js.native
  object hiragana extends TopLevel[hiragana with Double]
  
  /* 45 */ @js.native
  object katakanaFullWidth extends TopLevel[katakanaFullWidth with Double]
  
  /* 44 */ @js.native
  object katakanaHalfWidth extends TopLevel[katakanaHalfWidth with Double]
  
  /* 60 */ @js.native
  object maps extends TopLevel[maps with Double]
  
  /* 57 */ @js.native
  object nameOrPhoneNumber extends TopLevel[nameOrPhoneNumber with Double]
  
  /* 54 */ @js.native
  object nativeScript extends TopLevel[nativeScript with Double]
  
  /* 28 */ @js.native
  object number extends TopLevel[number with Double]
  
  /* 38 */ @js.native
  object numberFullWidth extends TopLevel[numberFullWidth with Double]
  
  /* 30 */ @js.native
  object password extends TopLevel[password with Double]
  
  /* 61 */ @js.native
  object passwordNumeric extends TopLevel[passwordNumeric with Double]
  
  /* 7 */ @js.native
  object personalFullName extends TopLevel[personalFullName with Double]
  
  /* 9 */ @js.native
  object personalGivenName extends TopLevel[personalGivenName with Double]
  
  /* 10 */ @js.native
  object personalMiddleName extends TopLevel[personalMiddleName with Double]
  
  /* 8 */ @js.native
  object personalNamePrefix extends TopLevel[personalNamePrefix with Double]
  
  /* 12 */ @js.native
  object personalNameSuffix extends TopLevel[personalNameSuffix with Double]
  
  /* 11 */ @js.native
  object personalSurname extends TopLevel[personalSurname with Double]
  
  /* 59 */ @js.native
  object `private` extends TopLevel[`private` with Double]
  
  /* 49 */ @js.native
  object search extends TopLevel[search with Double]
  
  /* 51 */ @js.native
  object searchIncremental extends TopLevel[searchIncremental with Double]
  
  /* 29 */ @js.native
  object singleCharacter extends TopLevel[singleCharacter with Double]
  
  /* 33 */ @js.native
  object telephoneAreaCode extends TopLevel[telephoneAreaCode with Double]
  
  /* 32 */ @js.native
  object telephoneCountryCode extends TopLevel[telephoneCountryCode with Double]
  
  /* 34 */ @js.native
  object telephoneLocalNumber extends TopLevel[telephoneLocalNumber with Double]
  
  /* 31 */ @js.native
  object telephoneNumber extends TopLevel[telephoneNumber with Double]
  
  /* 55 */ @js.native
  object text extends TopLevel[text with Double]
  
  /* 35 */ @js.native
  object time extends TopLevel[time with Double]
  
  /* 36 */ @js.native
  object timeHour extends TopLevel[timeHour with Double]
  
  /* 37 */ @js.native
  object timeMinuteOrSecond extends TopLevel[timeMinuteOrSecond with Double]
  
  /* 1 */ @js.native
  object url extends TopLevel[url with Double]
  
  /* 6 */ @js.native
  object userName extends TopLevel[userName with Double]
  
}

