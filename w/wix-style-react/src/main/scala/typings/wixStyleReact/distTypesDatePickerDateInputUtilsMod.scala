package typings.wixStyleReact

import typings.wixStyleReact.anon.DateFormat
import typings.wixStyleReact.anon.ParsedDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDatePickerDateInputUtilsMod {
  
  @JSImport("wix-style-react/dist/types/DatePicker/DateInput/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInvalidValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInvalidValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValid(date: Any, minDate: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(date.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseDate(value: Any, dateStyle: Any, locale: Any): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(value.asInstanceOf[js.Any], dateStyle.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
  
  inline def parseStrictInputValue(value: Any, dateStyle: Any, locale: Any): DateFormat | ParsedDate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStrictInputValue")(value.asInstanceOf[js.Any], dateStyle.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[DateFormat | ParsedDate]
}
