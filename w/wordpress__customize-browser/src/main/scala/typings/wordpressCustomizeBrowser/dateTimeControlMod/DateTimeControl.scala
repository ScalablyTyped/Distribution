package typings.wordpressCustomizeBrowser.dateTimeControlMod

import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.wordpressCustomizeBrowserStrings.am
import typings.wordpressCustomizeBrowser.wordpressCustomizeBrowserStrings.pm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/DateTimeControl", "DateTimeControl")
@js.native
class DateTimeControl () extends Control {
  
  @JSName("convertHourToTwentyFourHourFormat")
  def convertHourToTwentyFourHourFormat_am(hourInTwelveHourFormat: String, meridian: am): String = js.native
  @JSName("convertHourToTwentyFourHourFormat")
  def convertHourToTwentyFourHourFormat_pm(hourInTwelveHourFormat: String, meridian: pm): String = js.native
  
  def convertInputDateToString(): String = js.native
  
  def isFutureDate(): Boolean = js.native
  
  def parseDateTime(datetime: String): DateTime | Null = js.native
  
  def populateDateInputs(): Boolean = js.native
  
  def populateSetting(): Boolean = js.native
  
  def toggleFutureDateNotification(notify: Boolean): DateTimeControl = js.native
  
  def updateDaysForMonth(): Unit = js.native
  
  def validateInputs(): Boolean = js.native
}
