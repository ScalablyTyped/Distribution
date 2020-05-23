package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows users to select time values.
  **/
@JSGlobal("WinJS.UI.TimePicker")
@js.native
//#region Constructors
/**
  * Initializes a new instance of a TimePicker control.
  * @constructor
  * @param element The DOM element associated with the TimePicker control.
  * @param options The set of options to be applied initially to the TimePicker control. The options are the following: clock.
  **/
class TimePicker ()
  extends typings.winjs.WinJS.UI.TimePicker {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSGlobal("WinJS.UI.TimePicker")
@js.native
object TimePicker extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  def getInformation(clock: js.Any, minuteIncrement: js.Any): js.Any = js.native
  def getInformation(clock: js.Any, minuteIncrement: js.Any, timerPatterns: js.Any): js.Any = js.native
}

