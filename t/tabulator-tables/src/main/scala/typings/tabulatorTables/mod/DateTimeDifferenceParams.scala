package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesStrings.days
import typings.tabulatorTables.tabulatorTablesStrings.hours
import typings.tabulatorTables.tabulatorTablesStrings.minutes
import typings.tabulatorTables.tabulatorTablesStrings.months
import typings.tabulatorTables.tabulatorTablesStrings.seconds
import typings.tabulatorTables.tabulatorTablesStrings.weeks
import typings.tabulatorTables.tabulatorTablesStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tabulatorTables.mod._FormatterParams because Already inherited */ trait DateTimeDifferenceParams
  extends StObject
     with DateTimeParams {
  
  // Date Time Difference
  var date: js.UndefOr[Any] = js.undefined
  
  var humanize: js.UndefOr[Boolean] = js.undefined
  
  var suffix: js.UndefOr[Boolean] = js.undefined
  
  var unit: js.UndefOr[years | months | weeks | days | hours | minutes | seconds] = js.undefined
}
object DateTimeDifferenceParams {
  
  inline def apply(): DateTimeDifferenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeDifferenceParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeDifferenceParams] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setHumanize(value: Boolean): Self = StObject.set(x, "humanize", value.asInstanceOf[js.Any])
    
    inline def setHumanizeUndefined: Self = StObject.set(x, "humanize", js.undefined)
    
    inline def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setUnit(value: years | months | weeks | days | hours | minutes | seconds): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
