package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

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
  sealed trait address
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the city portion a full address. (For example, "Redmond".) */
  @js.native
  sealed trait addressCity
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the country name portion a full address. (For example, "United States of America".) */
  @js.native
  sealed trait addressCountryName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the country abbreviation portion a full address. (For example, "U.S.A.") */
  @js.native
  sealed trait addressCountryShortName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the postal code (or zip code) portion a full address. (For example, "98052".) */
  @js.native
  sealed trait addressPostalCode
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the state or province portion a full address. (For example, "WA".) */
  @js.native
  sealed trait addressStateOrProvince
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the street portion a full address. (For example, "Microsoft Way".) */
  @js.native
  sealed trait addressStreet
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is full-width alphanumeric characters. */
  @js.native
  sealed trait alphanumericFullWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is half-width alphanumeric characters. */
  @js.native
  sealed trait alphanumericHalfWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the Bopomofo Mandarin Chinese phonetic transcription system. */
  @js.native
  sealed trait bopomofo
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is chat strings. */
  @js.native
  sealed trait chat
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Chinese full-width characters. */
  @js.native
  sealed trait chineseFullWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Chinese half-width characters. */
  @js.native
  sealed trait chineseHalfWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is an amount of currency. */
  @js.native
  sealed trait currencyAmount
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is an amount of currency and a currency symbol. */
  @js.native
  sealed trait currencyAmountAndSymbol
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Chinese currency. */
  @js.native
  sealed trait currencyChinese
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a calendar date. */
  @js.native
  sealed trait date
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the numeric day portion of a calendar date. */
  @js.native
  sealed trait dateDay
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the name of the day in a calendar date. */
  @js.native
  sealed trait dateDayName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the numeric month portion of a calendar date. */
  @js.native
  sealed trait dateMonth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the name of the month portion of a calendar date. */
  @js.native
  sealed trait dateMonthName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the year portion of a calendar date. */
  @js.native
  sealed trait dateYear
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** No input scope is applied. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is an SMTP form email address (<accountname>@<host>). */
  @js.native
  sealed trait emailAddress
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the account name portion of an email address. */
  @js.native
  sealed trait emailUserName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is an email user name (<accountname>) or full email address (<accountname>@<host>). */
  @js.native
  sealed trait emailUserNameOrAddress
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is characters used in describing a file name. */
  @js.native
  sealed trait fileName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is characters used in describing a file path. */
  @js.native
  sealed trait filePath
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a mathematical formula. */
  @js.native
  sealed trait formula
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a mathematical formula. Advises input processors to show the number page of the SIP. */
  @js.native
  sealed trait formulaNumber
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Hangul full-width characters. */
  @js.native
  sealed trait hangulFullWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Hangul half-width characters. */
  @js.native
  sealed trait hangulHalfWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Hanja characters. */
  @js.native
  sealed trait hanja
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Hiragana characters. */
  @js.native
  sealed trait hiragana
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Katakana full-width characters. */
  @js.native
  sealed trait katakanaFullWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is Katakana half-width characters. */
  @js.native
  sealed trait katakanaHalfWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is from the device's Maps layout; does not include typing intelligence. */
  @js.native
  sealed trait maps
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a name or a telephone number. */
  @js.native
  sealed trait nameOrPhoneNumber
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is native script. */
  @js.native
  sealed trait nativeScript
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the digits 0-9. */
  @js.native
  sealed trait number
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is full-width number characters. */
  @js.native
  sealed trait numberFullWidth
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a password. */
  @js.native
  sealed trait password
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a numeric password, or PIN. */
  @js.native
  sealed trait passwordNumeric
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a person’s full name, including prefix, given name, middle name, surname, and suffix. */
  @js.native
  sealed trait personalFullName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the given (or first) name portion of a person’s full name. */
  @js.native
  sealed trait personalGivenName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the middle name portion of a person’s full name. */
  @js.native
  sealed trait personalMiddleName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the prefix portion of a person’s full name. (For example, "Mr.") */
  @js.native
  sealed trait personalNamePrefix
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the suffix portion of a person’s full name. (For example, "Jr.") */
  @js.native
  sealed trait personalNameSuffix
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the family (or last) name portion of a person’s full name. */
  @js.native
  sealed trait personalSurname
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is private text. Advises input processors that the text should not be stored nor logged. */
  @js.native
  sealed trait `private`
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a search string. */
  @js.native
  sealed trait search
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a search string. Use for search boxes where incremental results are displayed as the user types. */
  @js.native
  sealed trait searchIncremental
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a single ANSI character, codepage 1252. */
  @js.native
  sealed trait singleCharacter
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the area code portion of a full telephone number. (For example, "(800)".) */
  @js.native
  sealed trait telephoneAreaCode
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the country code portion of a full telephone number. (For example, "1".) */
  @js.native
  sealed trait telephoneCountryCode
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the local number portion of a full telephone number. (For example, "555-5555".) */
  @js.native
  sealed trait telephoneLocalNumber
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a full telephone number. (For example, "1(800)555-5555".) */
  @js.native
  sealed trait telephoneNumber
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is text; turns on typing intelligence. */
  @js.native
  sealed trait text
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a time value. */
  @js.native
  sealed trait time
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the hour portion of a time value. */
  @js.native
  sealed trait timeHour
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is the minute or second portion of a time value. */
  @js.native
  sealed trait timeMinuteOrSecond
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a URL. */
  @js.native
  sealed trait url
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /** Expected input is a log-in name and a domain (<accountname> or <domain>\<accountname>). */
  @js.native
  sealed trait userName
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope
  
  /* 13 */ val address: address with scala.Double = js.native
  /* 17 */ val addressCity: addressCity with scala.Double = js.native
  /* 18 */ val addressCountryName: addressCountryName with scala.Double = js.native
  /* 19 */ val addressCountryShortName: addressCountryShortName with scala.Double = js.native
  /* 14 */ val addressPostalCode: addressPostalCode with scala.Double = js.native
  /* 16 */ val addressStateOrProvince: addressStateOrProvince with scala.Double = js.native
  /* 15 */ val addressStreet: addressStreet with scala.Double = js.native
  /* 40 */ val alphanumericFullWidth: alphanumericFullWidth with scala.Double = js.native
  /* 39 */ val alphanumericHalfWidth: alphanumericHalfWidth with scala.Double = js.native
  /* 42 */ val bopomofo: bopomofo with scala.Double = js.native
  /* 56 */ val chat: chat with scala.Double = js.native
  /* 53 */ val chineseFullWidth: chineseFullWidth with scala.Double = js.native
  /* 52 */ val chineseHalfWidth: chineseHalfWidth with scala.Double = js.native
  /* 21 */ val currencyAmount: currencyAmount with scala.Double = js.native
  /* 20 */ val currencyAmountAndSymbol: currencyAmountAndSymbol with scala.Double = js.native
  /* 41 */ val currencyChinese: currencyChinese with scala.Double = js.native
  /* 22 */ val date: date with scala.Double = js.native
  /* 24 */ val dateDay: dateDay with scala.Double = js.native
  /* 27 */ val dateDayName: dateDayName with scala.Double = js.native
  /* 23 */ val dateMonth: dateMonth with scala.Double = js.native
  /* 26 */ val dateMonthName: dateMonthName with scala.Double = js.native
  /* 25 */ val dateYear: dateYear with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 5 */ val emailAddress: emailAddress with scala.Double = js.native
  /* 4 */ val emailUserName: emailUserName with scala.Double = js.native
  /* 58 */ val emailUserNameOrAddress: emailUserNameOrAddress with scala.Double = js.native
  /* 3 */ val fileName: fileName with scala.Double = js.native
  /* 2 */ val filePath: filePath with scala.Double = js.native
  /* 50 */ val formula: formula with scala.Double = js.native
  /* 62 */ val formulaNumber: formulaNumber with scala.Double = js.native
  /* 48 */ val hangulFullWidth: hangulFullWidth with scala.Double = js.native
  /* 47 */ val hangulHalfWidth: hangulHalfWidth with scala.Double = js.native
  /* 46 */ val hanja: hanja with scala.Double = js.native
  /* 43 */ val hiragana: hiragana with scala.Double = js.native
  /* 45 */ val katakanaFullWidth: katakanaFullWidth with scala.Double = js.native
  /* 44 */ val katakanaHalfWidth: katakanaHalfWidth with scala.Double = js.native
  /* 60 */ val maps: maps with scala.Double = js.native
  /* 57 */ val nameOrPhoneNumber: nameOrPhoneNumber with scala.Double = js.native
  /* 54 */ val nativeScript: nativeScript with scala.Double = js.native
  /* 28 */ val number: number with scala.Double = js.native
  /* 38 */ val numberFullWidth: numberFullWidth with scala.Double = js.native
  /* 30 */ val password: password with scala.Double = js.native
  /* 61 */ val passwordNumeric: passwordNumeric with scala.Double = js.native
  /* 7 */ val personalFullName: personalFullName with scala.Double = js.native
  /* 9 */ val personalGivenName: personalGivenName with scala.Double = js.native
  /* 10 */ val personalMiddleName: personalMiddleName with scala.Double = js.native
  /* 8 */ val personalNamePrefix: personalNamePrefix with scala.Double = js.native
  /* 12 */ val personalNameSuffix: personalNameSuffix with scala.Double = js.native
  /* 11 */ val personalSurname: personalSurname with scala.Double = js.native
  /* 59 */ val `private`: `private` with scala.Double = js.native
  /* 49 */ val search: search with scala.Double = js.native
  /* 51 */ val searchIncremental: searchIncremental with scala.Double = js.native
  /* 29 */ val singleCharacter: singleCharacter with scala.Double = js.native
  /* 33 */ val telephoneAreaCode: telephoneAreaCode with scala.Double = js.native
  /* 32 */ val telephoneCountryCode: telephoneCountryCode with scala.Double = js.native
  /* 34 */ val telephoneLocalNumber: telephoneLocalNumber with scala.Double = js.native
  /* 31 */ val telephoneNumber: telephoneNumber with scala.Double = js.native
  /* 55 */ val text: text with scala.Double = js.native
  /* 35 */ val time: time with scala.Double = js.native
  /* 36 */ val timeHour: timeHour with scala.Double = js.native
  /* 37 */ val timeMinuteOrSecond: timeMinuteOrSecond with scala.Double = js.native
  /* 1 */ val url: url with scala.Double = js.native
  /* 6 */ val userName: userName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope with scala.Double
  ] = js.native
}

