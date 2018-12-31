package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows users to pick a date value.
  **/
@JSGlobal("WinJS.UI.DatePicker")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the DatePicker control.
  * @constructor
  * @param element The DOM element associated with the DatePicker control.
  * @param options The set of options to be applied initially to the DatePicker control. The options are the following: calendar, current, datePattern, disabled, maxYear, minYear, monthPattern, yearPattern.
  **/
class DatePicker () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the calendar to use.
    **/
  var calendar: java.lang.String = js.native
  /**
    * Gets or sets the current date of the DatePicker. You can use either a date string or a Date object to set this property.
    **/
  var current: stdLib.Date = js.native
  /**
    * Gets or sets the display pattern for the date. The default date pattern is day.integer(2). You can change the date pattern by changing the number of integers displayed.
    **/
  var datePattern: java.lang.String = js.native
  /**
    * Specifies whether the DatePicker is disabled.
    **/
  var disabled: scala.Boolean = js.native
  /**
    * Gets the DOM element for the DatePicker.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets the maximum Gregorian year available for picking.
    **/
  var maxYear: scala.Double = js.native
  /**
    * Gets or sets the minimum Gregorian year available for picking.
    **/
  var minYear: scala.Double = js.native
  /**
    * Gets or sets the display pattern for the month. The default month pattern is month.abbreviated. You can change the month pattern to the following values: month.full. The full name of the month. month.abbreviated(n). You can use abbreviated with or without specifying the number of letters in the abbreviation. If you do specify the number of letters, the actual length of the month name that appears may vary. month.solo.full. A representation of the month that is suitable for stand-alone display. You can also use month.solo.abbreviated(n). month.integer(n). You can use integer with or without specifying the number of integers.
    **/
  var monthPattern: java.lang.String = js.native
  /**
    * Gets or sets the display pattern for the year. The default year pattern is year.full. You can change the year pattern to the following values: year.abbreviated(n). You can use abbreviated with or without specifying the number of letters in the abbreviation.
    **/
  var yearPattern: java.lang.String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Adds an event listener.
    * @param type The type (name) of the event.
    * @param listener The function that handles the event.
    * @param capture If true, specifies that capture should be initiated, otherwise false.
    **/
  def addEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function, capture: scala.Boolean): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this DatePicker. Call this method when the DatePicker is no longer needed. After calling this method, the DatePicker becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when any of the controls are changed by the user.
    * @param eventInfo An object that contains information about the event.
    **/
  def onchange(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Removes a listener for the specified event.
    * @param type The name of the event for which to remove a listener.
    * @param listener The listener.
    * @param useCapture Optional. The same value that was passed to addEventListener for this listener. It may be omitted if it was omitted when calling addEventListener.
    **/
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: js.Any): scala.Unit = js.native
}

/**
  * Allows users to pick a date value.
  **/
@JSGlobal("WinJS.UI.DatePicker")
@js.native
object DatePicker extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  def getInformation(startDate: js.Any, endDate: js.Any): js.Any = js.native
  def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.Any): js.Any = js.native
  def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.Any, datePatterns: js.Any): js.Any = js.native
}

