package typings.wixStyleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Calendar")
@js.native
open class Calendar ()
  extends typings.wixStyleReact.distTypesCalendarMod.default
/* static members */
object Calendar {
  
  @JSImport("wix-style-react", "Calendar")
  @js.native
  val ^ : js.Any = js.native
  
  inline def areValuesEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")().asInstanceOf[Boolean]
  inline def areValuesEqual(value1: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def areValuesEqual(value1: js.Object, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def areValuesEqual(value1: Unit, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getUpdatedMonth(nextPropsValue: Any, numOfMonths: Double, currentMonthDate: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatedMonth")(nextPropsValue.asInstanceOf[js.Any], numOfMonths.asInstanceOf[js.Any], currentMonthDate.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isRangeValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRangeValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSingleDay(value: Any): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleDay")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def optionalParse(dateOrString: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optionalParse")(dateOrString.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def optionalParse(dateOrString: js.Date): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optionalParse")(dateOrString.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseValue(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def renderDay(day: Any, modifiers: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDay")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
