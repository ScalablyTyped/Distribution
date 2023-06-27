package typings.wojtekmajDateUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wojtekmaj/date-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCenturyEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenturyEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getCenturyRange(date: DateLike): js.Tuple2[js.Date, js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenturyRange")(date.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Date, js.Date]]
  
  inline def getCenturyStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenturyStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getDate(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDayEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getDayRange(date: js.Date): js.Tuple2[js.Date, js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayRange")(date.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Date, js.Date]]
  
  inline def getDayStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getDaysInMonth(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaysInMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getDecadeEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecadeEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getDecadeRange(date: DateLike): js.Tuple2[js.Date, js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecadeRange")(date.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Date, js.Date]]
  
  inline def getDecadeStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecadeStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getHours(date: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getHours(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getHoursMinutes(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoursMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getHoursMinutes(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoursMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getHoursMinutesSeconds(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoursMinutesSeconds")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getHoursMinutesSeconds(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoursMinutesSeconds")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getISOLocalDate(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOLocalDate")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getISOLocalDateTime(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOLocalDateTime")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getISOLocalMonth(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getISOLocalMonth")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getMinutes(date: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getMinutes(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMonth(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonth")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMonthEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getMonthHuman(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthHuman")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMonthRange(date: js.Date): js.Tuple2[js.Date, js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthRange")(date.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Date, js.Date]]
  
  inline def getMonthStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getNextCenturyEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextCenturyEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextCenturyEnd(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextCenturyEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextCenturyStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextCenturyStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextCenturyStart(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextCenturyStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextDayEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextDayEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextDayEnd(date: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextDayEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextDayStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextDayStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextDayStart(date: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextDayStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextDecadeEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextDecadeEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextDecadeEnd(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextDecadeEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextDecadeStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextDecadeStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextDecadeStart(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextDecadeStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextMonthEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextMonthEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextMonthEnd(date: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextMonthEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextMonthStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextMonthStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextMonthStart(date: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextMonthStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextYearEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextYearEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextYearEnd(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextYearEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getNextYearStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextYearStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getNextYearStart(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextYearStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousCenturyEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousCenturyEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousCenturyEnd(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousCenturyEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousCenturyStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousCenturyStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousCenturyStart(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousCenturyStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousDayEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDayEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousDayEnd(date: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDayEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousDayStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDayStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousDayStart(date: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDayStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousDecadeEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDecadeEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousDecadeEnd(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDecadeEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousDecadeStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDecadeStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousDecadeStart(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousDecadeStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousMonthEnd(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMonthEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousMonthEnd(date: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMonthEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousMonthStart(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMonthStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousMonthStart(date: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMonthStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousYearEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousYearEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousYearEnd(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousYearEnd")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getPreviousYearStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousYearStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def getPreviousYearStart(date: DateLike, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousYearStart")(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getSeconds(date: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getSeconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getYear(date: DateLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getYearEnd(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearEnd")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getYearRange(date: DateLike): js.Tuple2[js.Date, js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearRange")(date.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Date, js.Date]]
  
  inline def getYearStart(date: DateLike): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getYearStart")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  type DateLike = js.Date | Double | String
}
