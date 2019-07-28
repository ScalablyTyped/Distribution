package typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs

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
  
  /* 13 */ val address: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.address with Double = js.native
  /* 17 */ val addressCity: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.addressCity with Double = js.native
  /* 18 */ val addressCountryName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.addressCountryName with Double = js.native
  /* 19 */ val addressCountryShortName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.addressCountryShortName with Double = js.native
  /* 14 */ val addressPostalCode: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.addressPostalCode with Double = js.native
  /* 16 */ val addressStateOrProvince: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.addressStateOrProvince with Double = js.native
  /* 15 */ val addressStreet: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.addressStreet with Double = js.native
  /* 40 */ val alphanumericFullWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.alphanumericFullWidth with Double = js.native
  /* 39 */ val alphanumericHalfWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.alphanumericHalfWidth with Double = js.native
  /* 42 */ val bopomofo: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.bopomofo with Double = js.native
  /* 56 */ val chat: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.chat with Double = js.native
  /* 53 */ val chineseFullWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.chineseFullWidth with Double = js.native
  /* 52 */ val chineseHalfWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.chineseHalfWidth with Double = js.native
  /* 21 */ val currencyAmount: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.currencyAmount with Double = js.native
  /* 20 */ val currencyAmountAndSymbol: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.currencyAmountAndSymbol with Double = js.native
  /* 41 */ val currencyChinese: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.currencyChinese with Double = js.native
  /* 22 */ val date: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.date with Double = js.native
  /* 24 */ val dateDay: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.dateDay with Double = js.native
  /* 27 */ val dateDayName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.dateDayName with Double = js.native
  /* 23 */ val dateMonth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.dateMonth with Double = js.native
  /* 26 */ val dateMonthName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.dateMonthName with Double = js.native
  /* 25 */ val dateYear: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.dateYear with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.default with Double = js.native
  /* 5 */ val emailAddress: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.emailAddress with Double = js.native
  /* 4 */ val emailUserName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.emailUserName with Double = js.native
  /* 58 */ val emailUserNameOrAddress: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.emailUserNameOrAddress with Double = js.native
  /* 3 */ val fileName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.fileName with Double = js.native
  /* 2 */ val filePath: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.filePath with Double = js.native
  /* 50 */ val formula: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.formula with Double = js.native
  /* 62 */ val formulaNumber: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.formulaNumber with Double = js.native
  /* 48 */ val hangulFullWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.hangulFullWidth with Double = js.native
  /* 47 */ val hangulHalfWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.hangulHalfWidth with Double = js.native
  /* 46 */ val hanja: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.hanja with Double = js.native
  /* 43 */ val hiragana: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.hiragana with Double = js.native
  /* 45 */ val katakanaFullWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.katakanaFullWidth with Double = js.native
  /* 44 */ val katakanaHalfWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.katakanaHalfWidth with Double = js.native
  /* 60 */ val maps: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.maps with Double = js.native
  /* 57 */ val nameOrPhoneNumber: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.nameOrPhoneNumber with Double = js.native
  /* 54 */ val nativeScript: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.nativeScript with Double = js.native
  /* 28 */ val number: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.number with Double = js.native
  /* 38 */ val numberFullWidth: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.numberFullWidth with Double = js.native
  /* 30 */ val password: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.password with Double = js.native
  /* 61 */ val passwordNumeric: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.passwordNumeric with Double = js.native
  /* 7 */ val personalFullName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.personalFullName with Double = js.native
  /* 9 */ val personalGivenName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.personalGivenName with Double = js.native
  /* 10 */ val personalMiddleName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.personalMiddleName with Double = js.native
  /* 8 */ val personalNamePrefix: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.personalNamePrefix with Double = js.native
  /* 12 */ val personalNameSuffix: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.personalNameSuffix with Double = js.native
  /* 11 */ val personalSurname: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.personalSurname with Double = js.native
  /* 59 */ val `private`: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.`private` with Double = js.native
  /* 49 */ val search: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.search with Double = js.native
  /* 51 */ val searchIncremental: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.searchIncremental with Double = js.native
  /* 29 */ val singleCharacter: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.singleCharacter with Double = js.native
  /* 33 */ val telephoneAreaCode: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.telephoneAreaCode with Double = js.native
  /* 32 */ val telephoneCountryCode: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.telephoneCountryCode with Double = js.native
  /* 34 */ val telephoneLocalNumber: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.telephoneLocalNumber with Double = js.native
  /* 31 */ val telephoneNumber: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.telephoneNumber with Double = js.native
  /* 55 */ val text: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.text with Double = js.native
  /* 35 */ val time: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.time with Double = js.native
  /* 36 */ val timeHour: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.timeHour with Double = js.native
  /* 37 */ val timeMinuteOrSecond: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.timeMinuteOrSecond with Double = js.native
  /* 1 */ val url: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.url with Double = js.native
  /* 6 */ val userName: typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope.userName with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreTextInputScope with Double] = js.native
}

