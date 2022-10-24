package typings.wixStyleReact

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.std.Record
import typings.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typings.wixStyleReact.anon.Date
import typings.wixStyleReact.anon.From
import typings.wixStyleReact.wixStyleReactInts.`0`
import typings.wixStyleReact.wixStyleReactInts.`1`
import typings.wixStyleReact.wixStyleReactInts.`2`
import typings.wixStyleReact.wixStyleReactInts.`3`
import typings.wixStyleReact.wixStyleReactInts.`4`
import typings.wixStyleReact.wixStyleReactInts.`5`
import typings.wixStyleReact.wixStyleReactInts.`6`
import typings.wixStyleReact.wixStyleReactStrings.day
import typings.wixStyleReact.wixStyleReactStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarBaseCalendarBaseCalendarMod {
  
  @JSImport("wix-style-react/dist/types/Calendar/BaseCalendar/BaseCalendar", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[BaseCalendarProps, js.Object, Any]
  
  type BaseCalendar = PureComponent[BaseCalendarProps, js.Object, Any]
  
  @js.native
  trait BaseCalendarProps extends StObject {
    
    /** Allow selecting dates that are outside of the current displayed month. */
    var allowSelectingOutsideDays: js.UndefOr[Boolean] = js.native
    
    /** Focus selected day automatically when component mounts or updates */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    /** The Calendar head components which includes the navigation arrows, and the captions elements. */
    var captionElement: ReactElement | (ComponentClass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CaptionElementProps */ Any, 
        ComponentState
      ]) | (FC[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CaptionElementProps */ Any
      ]) = js.native
    
    /** A single CSS class name to be appended to the root element. */
    var className: js.UndefOr[String] = js.native
    
    /** Applies as data-hook HTML attribute that can be used in the tests */
    var dataHook: js.UndefOr[String] = js.native
    
    /**
      ##### Add an indication under a specific date.
      Function returns the indication node of a specific date or null if this day doesn't have an indication.
      * - `param` {date: Date, isSelected: boolean }
      * - `date` - a date
      * - `isSelected` - whether this date is the selected date
      * - `return` {React.node} - the indication node of a specific date or null if this day doesn't have an indication.
      */
    var dateIndication: js.UndefOr[js.Function1[/* param */ Date, Unit]] = js.native
    
    /** The current displayed month */
    var displayedMonth: js.Date = js.native
    
    /** Specify whether past dates should be selectable or not */
    var excludePastDates: js.UndefOr[Boolean] = js.native
    
    /**
      * ##### Specify selectable dates:
      *  * `param` {Date} `date` - a date to check
      *  * `return` {boolean} - true if `date` should be selectable, false otherwise
      */
    var filterDate: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.native
    
    /** First day of the week, allowing only from 0 to 6 (Sunday to Saturday). The default value is 1 which means Monday. */
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
    
    /** Specify date picker instance locale */
    var locale: js.UndefOr[SupportedWixLocales_] = js.native
    
    /** Responsible for adding a new modifier for the day elements. For example: `hidden` for dates that shouldn’t be displayed.
      It should be passed as an object according to `ReactDayPicker` API.
      https://react-day-picker.js.org/docs/matching-days/
      */
    var modifiers: js.UndefOr[Record[String, Any]] = js.native
    
    /** Allows to display multiple months at once. Currently it shows 1 or 2 months only. */
    var numOfMonths: js.UndefOr[`1` | `2`] = js.native
    
    def onChange(date: js.Date, modifiers: Any): Unit = js.native
    /** Provides a callback function when  day in selected in the calendar */
    def onChange(date: From, modifiers: Any): Unit = js.native
    
    /** Defines a callback function that is  called whenever a user presses escape, clicks outside of the element or a date is selected and `shouldCloseOnSelect` is set. Receives an event as a first argument. */
    var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[Any], Unit]] = js.native
    
    /**
      * ##### A callback function that would be invoked every time that the displayed month / week would be changed.
      * ##### This would be passed as a prop (onMonthChange) for the ReactDayPicker component.
      * - `month` - The current displayed month
      *  `return` void
      */
    var onDisplayedViewChange: js.UndefOr[js.Function1[/* month */ js.Date, Unit]] = js.native
    
    /** Specify whether RTL mode is enabled or not. When true, the keyboard navigation will be changed means pressing on the right arrow will navigate to the previous day, and pressing on the left arrow will navigate to the next day. */
    var rtl: js.UndefOr[Boolean] = js.native
    
    /** Whether the user should be able to select a date range, or just a single day */
    var selectionMode: js.UndefOr[day | range] = js.native
    
    /** Specify whether the calendar closes on day selection */
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.native
    
    /** Sets today's date. The today indication is added automatically according to the user timezone but in some cases, we need the ability to add the today indication based on the business timezone. */
    var today: js.UndefOr[js.Date] = js.native
    
    /** Defines the selected date */
    var value: js.UndefOr[js.Date | From] = js.native
  }
}
