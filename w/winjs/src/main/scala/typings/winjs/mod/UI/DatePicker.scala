package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows users to pick a date value.
  **/
@JSImport("winjs", "UI.DatePicker")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the DatePicker control.
  * @param element The DOM element associated with the DatePicker control.
  * @param options The set of options to be applied initially to the DatePicker control. The options are the following: calendar, current, datePattern, disabled, maxYear, minYear, monthPattern, yearPattern.
  **/
open class DatePicker ()
  extends StObject
     with typings.winjs.WinJS.UI.DatePicker {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: Any) = this()
  def this(element: HTMLElement, options: Any) = this()
}
object DatePicker {
  
  @JSImport("winjs", "UI.DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  /* static member */
  inline def getInformation(startDate: Any, endDate: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInformation")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getInformation(startDate: Any, endDate: Any, calendar: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInformation")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], calendar.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getInformation(startDate: Any, endDate: Any, calendar: Any, datePatterns: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInformation")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], calendar.asInstanceOf[js.Any], datePatterns.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getInformation(startDate: Any, endDate: Any, calendar: Unit, datePatterns: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInformation")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], calendar.asInstanceOf[js.Any], datePatterns.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.DatePicker.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
