package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.winjs.WinJS.UI.TimePicker {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object TimePicker {
  
  @JSGlobal("WinJS.UI.TimePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  /* static member */
  @scala.inline
  def getInformation(clock: js.Any, minuteIncrement: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInformation")(clock.asInstanceOf[js.Any], minuteIncrement.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getInformation(clock: js.Any, minuteIncrement: js.Any, timerPatterns: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInformation")(clock.asInstanceOf[js.Any], minuteIncrement.asInstanceOf[js.Any], timerPatterns.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.TimePicker.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
