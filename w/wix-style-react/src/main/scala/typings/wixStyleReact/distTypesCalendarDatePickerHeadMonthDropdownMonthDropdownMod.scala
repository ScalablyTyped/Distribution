package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Months
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarDatePickerHeadMonthDropdownMonthDropdownMod {
  
  object default {
    
    inline def apply(param0: Months): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.ariaLabel")
      @js.native
      val ariaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.ariaLabelledBy")
      @js.native
      val ariaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.date")
      @js.native
      val date: Validator[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.months")
      @js.native
      val months: Validator[js.Array[js.UndefOr[String | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.onChange")
      @js.native
      val onChange: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
}
