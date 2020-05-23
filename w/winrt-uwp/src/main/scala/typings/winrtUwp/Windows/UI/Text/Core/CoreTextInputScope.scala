package typings.winrtUwp.Windows.UI.Text.Core

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
  
}

