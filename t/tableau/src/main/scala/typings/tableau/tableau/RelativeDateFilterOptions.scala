package typings.tableau.tableau

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeDateFilterOptions extends StObject {
  
  /** The UTC date from which to filter. */
  var anchorDate: Date = js.native
  
  /** Year, quarter, month, etc. */
  var periodType: PeriodType = js.native
  
  /** The number used when the rangeType is LASTN or NEXTN. */
  var rangeN: Double = js.native
  
  /** LAST, LASTN, NEXT, etc. */
  var rangeType: DateRangeType = js.native
}
object RelativeDateFilterOptions {
  
  @scala.inline
  def apply(anchorDate: Date, periodType: PeriodType, rangeN: Double, rangeType: DateRangeType): RelativeDateFilterOptions = {
    val __obj = js.Dynamic.literal(anchorDate = anchorDate.asInstanceOf[js.Any], periodType = periodType.asInstanceOf[js.Any], rangeN = rangeN.asInstanceOf[js.Any], rangeType = rangeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeDateFilterOptions]
  }
  
  @scala.inline
  implicit class RelativeDateFilterOptionsMutableBuilder[Self <: RelativeDateFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorDate(value: Date): Self = StObject.set(x, "anchorDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodType(value: PeriodType): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeN(value: Double): Self = StObject.set(x, "rangeN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeType(value: DateRangeType): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
  }
}
