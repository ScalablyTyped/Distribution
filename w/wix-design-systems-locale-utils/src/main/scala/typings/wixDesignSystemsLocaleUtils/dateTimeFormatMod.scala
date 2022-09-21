package typings.wixDesignSystemsLocaleUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFormatMod {
  
  object dateTimeFormat {
    
    @JSImport("wix-design-systems-locale-utils/dist/types/dateTimeFormat", "dateTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getLongTime(
      locale: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 54 */ Any,
      date: js.Date
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLongTime")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    
    inline def getMediumDate(
      locale: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 54 */ Any,
      date: js.Date
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMediumDate")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getShortDate(
      locale: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 54 */ Any,
      date: js.Date
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShortDate")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    
    inline def getShortTime(
      locale: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 54 */ Any,
      date: js.Date
    ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShortTime")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  }
  
  @JSImport("wix-design-systems-locale-utils/dist/types/dateTimeFormat", "supportedWixlocales")
  @js.native
  val supportedWixlocales: js.Array[Any] = js.native
}
