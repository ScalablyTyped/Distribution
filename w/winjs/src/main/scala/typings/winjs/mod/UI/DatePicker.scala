package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows users to pick a date value.
  **/
@JSImport("winjs", "UI.DatePicker")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the DatePicker control.
  * @constructor
  * @param element The DOM element associated with the DatePicker control.
  * @param options The set of options to be applied initially to the DatePicker control. The options are the following: calendar, current, datePattern, disabled, maxYear, minYear, monthPattern, yearPattern.
  **/
class DatePicker ()
  extends typings.winjs.WinJS.UI.DatePicker {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object DatePicker {
  
  @JSImport("winjs", "UI.DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use render instead.
    **/
  /* static member */
  @JSImport("winjs", "UI.DatePicker.getInformation")
  @js.native
  def getInformation(startDate: js.Any, endDate: js.Any): js.Any = js.native
  @JSImport("winjs", "UI.DatePicker.getInformation")
  @js.native
  def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.UndefOr[scala.Nothing], datePatterns: js.Any): js.Any = js.native
  @JSImport("winjs", "UI.DatePicker.getInformation")
  @js.native
  def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.Any): js.Any = js.native
  @JSImport("winjs", "UI.DatePicker.getInformation")
  @js.native
  def getInformation(startDate: js.Any, endDate: js.Any, calendar: js.Any, datePatterns: js.Any): js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.DatePicker.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
