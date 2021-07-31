package typings.wixStyleReact.mod

import typings.std.Date
import typings.wixStyleReact.calendarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Calendar")
@js.native
class Calendar () extends default
/* static members */
object Calendar {
  
  @JSImport("wix-style-react", "Calendar")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def areValuesEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")().asInstanceOf[Boolean]
  @scala.inline
  def areValuesEqual(value1: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def areValuesEqual(value1: js.Object, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def areValuesEqual(value1: Unit, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getUpdatedMonth(nextPropsValue: js.Any, numOfMonths: Double, currentMonthDate: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatedMonth")(nextPropsValue.asInstanceOf[js.Any], numOfMonths.asInstanceOf[js.Any], currentMonthDate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isRangeValue(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRangeValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSingleDay(value: js.Any): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleDay")(value.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def optionalParse(dateOrString: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optionalParse")(dateOrString.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def optionalParse(dateOrString: Date): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optionalParse")(dateOrString.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def parseValue(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def renderDay(day: js.Any, modifiers: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDay")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
