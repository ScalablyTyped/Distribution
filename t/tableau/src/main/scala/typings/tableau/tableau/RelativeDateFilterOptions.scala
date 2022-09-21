package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeDateFilterOptions extends StObject {
  
  /** The UTC date from which to filter. */
  var anchorDate: js.Date
  
  /** Year, quarter, month, etc. */
  var periodType: PeriodType
  
  /** The number used when the rangeType is LASTN or NEXTN. */
  var rangeN: Double
  
  /** LAST, LASTN, NEXT, etc. */
  var rangeType: DateRangeType
}
object RelativeDateFilterOptions {
  
  inline def apply(anchorDate: js.Date, periodType: PeriodType, rangeN: Double, rangeType: DateRangeType): RelativeDateFilterOptions = {
    val __obj = js.Dynamic.literal(anchorDate = anchorDate.asInstanceOf[js.Any], periodType = periodType.asInstanceOf[js.Any], rangeN = rangeN.asInstanceOf[js.Any], rangeType = rangeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeDateFilterOptions]
  }
  
  extension [Self <: RelativeDateFilterOptions](x: Self) {
    
    inline def setAnchorDate(value: js.Date): Self = StObject.set(x, "anchorDate", value.asInstanceOf[js.Any])
    
    inline def setPeriodType(value: PeriodType): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
    
    inline def setRangeN(value: Double): Self = StObject.set(x, "rangeN", value.asInstanceOf[js.Any])
    
    inline def setRangeType(value: DateRangeType): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
  }
}
