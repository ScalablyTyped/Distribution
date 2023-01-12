package typings.tableauJsApi

import typings.tableauJsApi.enumsMod.DateRangeType
import typings.tableauJsApi.enumsMod.FilterType
import typings.tableauJsApi.enumsMod.NullOption
import typings.tableauJsApi.enumsMod.PeriodType
import typings.tableauJsApi.sheetMod.Worksheet
import typings.tableauJsApi.workbookMod.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringMod {
  
  @JSImport("tableau-js-api/filtering", "CategoricalFilter")
  @js.native
  open class CategoricalFilter () extends Filter {
    
    def getAppliedValues(): js.Array[DataValue] = js.native
    
    def getIsAllSelected(): Boolean = js.native
    
    // properties
    def getIsExcludeMode(): Boolean = js.native
  }
  
  @JSImport("tableau-js-api/filtering", "Filter")
  @js.native
  open class Filter () extends StObject {
    
    // methods
    def getAppliedWorksheetsAsync(): js.Promise[js.Array[String]] = js.native
    
    def getFieldAsync(): js.Promise[Field] = js.native
    
    def getFieldName(): String = js.native
    
    def getFilterType(): FilterType = js.native
    
    // properties
    def getWorksheet(): Worksheet = js.native
    
    def setAppliedWorksheetsAsync(applyToWorksheets: js.Array[String]): js.Promise[js.Array[String]] = js.native
  }
  
  @JSImport("tableau-js-api/filtering", "QuantitativeFilter")
  @js.native
  open class QuantitativeFilter () extends Filter {
    
    def getDomainMax(): DataValue = js.native
    
    def getDomainMin(): DataValue = js.native
    
    def getIncludeNullValues(): Boolean = js.native
    
    def getMax(): DataValue = js.native
    
    def getMin(): DataValue = js.native
  }
  
  @JSImport("tableau-js-api/filtering", "RelativeDateFilter")
  @js.native
  open class RelativeDateFilter () extends Filter {
    
    def getPeriod(): PeriodType = js.native
    
    def getRange(): DateRangeType = js.native
    
    def getRangeN(): Double = js.native
  }
  
  trait DataValue extends StObject {
    
    var formattedValue: String
    
    var value: String | Double | Boolean | js.Date
  }
  object DataValue {
    
    inline def apply(formattedValue: String, value: String | Double | Boolean | js.Date): DataValue = {
      val __obj = js.Dynamic.literal(formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataValue] (val x: Self) extends AnyVal {
      
      inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | Boolean | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilterOptions extends StObject {
    
    var isExcludeMode: Boolean
  }
  object FilterOptions {
    
    inline def apply(isExcludeMode: Boolean): FilterOptions = {
      val __obj = js.Dynamic.literal(isExcludeMode = isExcludeMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterOptions] (val x: Self) extends AnyVal {
      
      inline def setIsExcludeMode(value: Boolean): Self = StObject.set(x, "isExcludeMode", value.asInstanceOf[js.Any])
    }
  }
  
  type HierarchicalFilterOptions = Any
  
  trait RangeFilterOptions extends StObject {
    
    var max: Double | js.Date
    
    var min: Double | js.Date
    
    var nullOption: NullOption
  }
  object RangeFilterOptions {
    
    inline def apply(max: Double | js.Date, min: Double | js.Date, nullOption: NullOption): RangeFilterOptions = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], nullOption = nullOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeFilterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeFilterOptions] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double | js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double | js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setNullOption(value: NullOption): Self = StObject.set(x, "nullOption", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelativeDateFilterOptions extends StObject {
    
    var anchorDate: js.Date
    
    var periodType: PeriodType
    
    var rangeN: Double
    
    var rangeType: DateRangeType
  }
  object RelativeDateFilterOptions {
    
    inline def apply(anchorDate: js.Date, periodType: PeriodType, rangeN: Double, rangeType: DateRangeType): RelativeDateFilterOptions = {
      val __obj = js.Dynamic.literal(anchorDate = anchorDate.asInstanceOf[js.Any], periodType = periodType.asInstanceOf[js.Any], rangeN = rangeN.asInstanceOf[js.Any], rangeType = rangeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeDateFilterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelativeDateFilterOptions] (val x: Self) extends AnyVal {
      
      inline def setAnchorDate(value: js.Date): Self = StObject.set(x, "anchorDate", value.asInstanceOf[js.Any])
      
      inline def setPeriodType(value: PeriodType): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
      
      inline def setRangeN(value: Double): Self = StObject.set(x, "rangeN", value.asInstanceOf[js.Any])
      
      inline def setRangeType(value: DateRangeType): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    }
  }
}
