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
  
  val address: address with java.lang.String = js.native
  val addressCity: addressCity with java.lang.String = js.native
  val addressCountryName: addressCountryName with java.lang.String = js.native
  val addressCountryShortName: addressCountryShortName with java.lang.String = js.native
  val addressPostalCode: addressPostalCode with java.lang.String = js.native
  val addressStateOrProvince: addressStateOrProvince with java.lang.String = js.native
  val addressStreet: addressStreet with java.lang.String = js.native
  val alphanumericFullWidth: alphanumericFullWidth with java.lang.String = js.native
  val alphanumericHalfWidth: alphanumericHalfWidth with java.lang.String = js.native
  val bopomofo: bopomofo with java.lang.String = js.native
  val chat: chat with java.lang.String = js.native
  val chineseFullWidth: chineseFullWidth with java.lang.String = js.native
  val chineseHalfWidth: chineseHalfWidth with java.lang.String = js.native
  val currencyAmount: currencyAmount with java.lang.String = js.native
  val currencyAmountAndSymbol: currencyAmountAndSymbol with java.lang.String = js.native
  val currencyChinese: currencyChinese with java.lang.String = js.native
  val date: date with java.lang.String = js.native
  val dateDay: dateDay with java.lang.String = js.native
  val dateDayName: dateDayName with java.lang.String = js.native
  val dateMonth: dateMonth with java.lang.String = js.native
  val dateMonthName: dateMonthName with java.lang.String = js.native
  val dateYear: dateYear with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val emailAddress: emailAddress with java.lang.String = js.native
  val emailUserName: emailUserName with java.lang.String = js.native
  val emailUserNameOrAddress: emailUserNameOrAddress with java.lang.String = js.native
  val fileName: fileName with java.lang.String = js.native
  val filePath: filePath with java.lang.String = js.native
  val formula: formula with java.lang.String = js.native
  val formulaNumber: formulaNumber with java.lang.String = js.native
  val hangulFullWidth: hangulFullWidth with java.lang.String = js.native
  val hangulHalfWidth: hangulHalfWidth with java.lang.String = js.native
  val hanja: hanja with java.lang.String = js.native
  val hiragana: hiragana with java.lang.String = js.native
  val katakanaFullWidth: katakanaFullWidth with java.lang.String = js.native
  val katakanaHalfWidth: katakanaHalfWidth with java.lang.String = js.native
  val maps: maps with java.lang.String = js.native
  val nameOrPhoneNumber: nameOrPhoneNumber with java.lang.String = js.native
  val nativeScript: nativeScript with java.lang.String = js.native
  val number: number with java.lang.String = js.native
  val numberFullWidth: numberFullWidth with java.lang.String = js.native
  val password: password with java.lang.String = js.native
  val passwordNumeric: passwordNumeric with java.lang.String = js.native
  val personalFullName: personalFullName with java.lang.String = js.native
  val personalGivenName: personalGivenName with java.lang.String = js.native
  val personalMiddleName: personalMiddleName with java.lang.String = js.native
  val personalNamePrefix: personalNamePrefix with java.lang.String = js.native
  val personalNameSuffix: personalNameSuffix with java.lang.String = js.native
  val personalSurname: personalSurname with java.lang.String = js.native
  val `private`: `private` with java.lang.String = js.native
  val search: search with java.lang.String = js.native
  val searchIncremental: searchIncremental with java.lang.String = js.native
  val singleCharacter: singleCharacter with java.lang.String = js.native
  val telephoneAreaCode: telephoneAreaCode with java.lang.String = js.native
  val telephoneCountryCode: telephoneCountryCode with java.lang.String = js.native
  val telephoneLocalNumber: telephoneLocalNumber with java.lang.String = js.native
  val telephoneNumber: telephoneNumber with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val time: time with java.lang.String = js.native
  val timeHour: timeHour with java.lang.String = js.native
  val timeMinuteOrSecond: timeMinuteOrSecond with java.lang.String = js.native
  val url: url with java.lang.String = js.native
  val userName: userName with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextInputScope with java.lang.String
  ] = js.native
}

