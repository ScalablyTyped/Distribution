package typings.w3cWebHid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hidreportitem-dictionary */
trait HIDReportItem extends StObject {
  
  var hasNull: js.UndefOr[Boolean] = js.undefined
  
  var hasPreferredState: js.UndefOr[Boolean] = js.undefined
  
  var isAbsolute: js.UndefOr[Boolean] = js.undefined
  
  var isArray: js.UndefOr[Boolean] = js.undefined
  
  var isBufferedBytes: js.UndefOr[Boolean] = js.undefined
  
  var isConstant: js.UndefOr[Boolean] = js.undefined
  
  var isLinear: js.UndefOr[Boolean] = js.undefined
  
  var isRange: js.UndefOr[Boolean] = js.undefined
  
  var isVolatile: js.UndefOr[Boolean] = js.undefined
  
  var logicalMaximum: js.UndefOr[Double] = js.undefined
  
  var logicalMinimum: js.UndefOr[Double] = js.undefined
  
  var physicalMaximum: js.UndefOr[Double] = js.undefined
  
  var physicalMinimum: js.UndefOr[Double] = js.undefined
  
  var reportCount: js.UndefOr[Double] = js.undefined
  
  var reportSize: js.UndefOr[Double] = js.undefined
  
  var strings: js.UndefOr[js.Array[String]] = js.undefined
  
  var unitExponent: js.UndefOr[Double] = js.undefined
  
  var unitFactorCurrentExponent: js.UndefOr[Double] = js.undefined
  
  var unitFactorLengthExponent: js.UndefOr[Double] = js.undefined
  
  var unitFactorLuminousIntensityExponent: js.UndefOr[Double] = js.undefined
  
  var unitFactorMassExponent: js.UndefOr[Double] = js.undefined
  
  var unitFactorTemperatureExponent: js.UndefOr[Double] = js.undefined
  
  var unitFactorTimeExponent: js.UndefOr[Double] = js.undefined
  
  var unitSystem: js.UndefOr[HIDUnitSystem] = js.undefined
  
  var usageMaximum: js.UndefOr[Double] = js.undefined
  
  var usageMinimum: js.UndefOr[Double] = js.undefined
  
  var usages: js.UndefOr[js.Array[Double]] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object HIDReportItem {
  
  inline def apply(): HIDReportItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HIDReportItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HIDReportItem] (val x: Self) extends AnyVal {
    
    inline def setHasNull(value: Boolean): Self = StObject.set(x, "hasNull", value.asInstanceOf[js.Any])
    
    inline def setHasNullUndefined: Self = StObject.set(x, "hasNull", js.undefined)
    
    inline def setHasPreferredState(value: Boolean): Self = StObject.set(x, "hasPreferredState", value.asInstanceOf[js.Any])
    
    inline def setHasPreferredStateUndefined: Self = StObject.set(x, "hasPreferredState", js.undefined)
    
    inline def setIsAbsolute(value: Boolean): Self = StObject.set(x, "isAbsolute", value.asInstanceOf[js.Any])
    
    inline def setIsAbsoluteUndefined: Self = StObject.set(x, "isAbsolute", js.undefined)
    
    inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    inline def setIsBufferedBytes(value: Boolean): Self = StObject.set(x, "isBufferedBytes", value.asInstanceOf[js.Any])
    
    inline def setIsBufferedBytesUndefined: Self = StObject.set(x, "isBufferedBytes", js.undefined)
    
    inline def setIsConstant(value: Boolean): Self = StObject.set(x, "isConstant", value.asInstanceOf[js.Any])
    
    inline def setIsConstantUndefined: Self = StObject.set(x, "isConstant", js.undefined)
    
    inline def setIsLinear(value: Boolean): Self = StObject.set(x, "isLinear", value.asInstanceOf[js.Any])
    
    inline def setIsLinearUndefined: Self = StObject.set(x, "isLinear", js.undefined)
    
    inline def setIsRange(value: Boolean): Self = StObject.set(x, "isRange", value.asInstanceOf[js.Any])
    
    inline def setIsRangeUndefined: Self = StObject.set(x, "isRange", js.undefined)
    
    inline def setIsVolatile(value: Boolean): Self = StObject.set(x, "isVolatile", value.asInstanceOf[js.Any])
    
    inline def setIsVolatileUndefined: Self = StObject.set(x, "isVolatile", js.undefined)
    
    inline def setLogicalMaximum(value: Double): Self = StObject.set(x, "logicalMaximum", value.asInstanceOf[js.Any])
    
    inline def setLogicalMaximumUndefined: Self = StObject.set(x, "logicalMaximum", js.undefined)
    
    inline def setLogicalMinimum(value: Double): Self = StObject.set(x, "logicalMinimum", value.asInstanceOf[js.Any])
    
    inline def setLogicalMinimumUndefined: Self = StObject.set(x, "logicalMinimum", js.undefined)
    
    inline def setPhysicalMaximum(value: Double): Self = StObject.set(x, "physicalMaximum", value.asInstanceOf[js.Any])
    
    inline def setPhysicalMaximumUndefined: Self = StObject.set(x, "physicalMaximum", js.undefined)
    
    inline def setPhysicalMinimum(value: Double): Self = StObject.set(x, "physicalMinimum", value.asInstanceOf[js.Any])
    
    inline def setPhysicalMinimumUndefined: Self = StObject.set(x, "physicalMinimum", js.undefined)
    
    inline def setReportCount(value: Double): Self = StObject.set(x, "reportCount", value.asInstanceOf[js.Any])
    
    inline def setReportCountUndefined: Self = StObject.set(x, "reportCount", js.undefined)
    
    inline def setReportSize(value: Double): Self = StObject.set(x, "reportSize", value.asInstanceOf[js.Any])
    
    inline def setReportSizeUndefined: Self = StObject.set(x, "reportSize", js.undefined)
    
    inline def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value*))
    
    inline def setUnitExponent(value: Double): Self = StObject.set(x, "unitExponent", value.asInstanceOf[js.Any])
    
    inline def setUnitExponentUndefined: Self = StObject.set(x, "unitExponent", js.undefined)
    
    inline def setUnitFactorCurrentExponent(value: Double): Self = StObject.set(x, "unitFactorCurrentExponent", value.asInstanceOf[js.Any])
    
    inline def setUnitFactorCurrentExponentUndefined: Self = StObject.set(x, "unitFactorCurrentExponent", js.undefined)
    
    inline def setUnitFactorLengthExponent(value: Double): Self = StObject.set(x, "unitFactorLengthExponent", value.asInstanceOf[js.Any])
    
    inline def setUnitFactorLengthExponentUndefined: Self = StObject.set(x, "unitFactorLengthExponent", js.undefined)
    
    inline def setUnitFactorLuminousIntensityExponent(value: Double): Self = StObject.set(x, "unitFactorLuminousIntensityExponent", value.asInstanceOf[js.Any])
    
    inline def setUnitFactorLuminousIntensityExponentUndefined: Self = StObject.set(x, "unitFactorLuminousIntensityExponent", js.undefined)
    
    inline def setUnitFactorMassExponent(value: Double): Self = StObject.set(x, "unitFactorMassExponent", value.asInstanceOf[js.Any])
    
    inline def setUnitFactorMassExponentUndefined: Self = StObject.set(x, "unitFactorMassExponent", js.undefined)
    
    inline def setUnitFactorTemperatureExponent(value: Double): Self = StObject.set(x, "unitFactorTemperatureExponent", value.asInstanceOf[js.Any])
    
    inline def setUnitFactorTemperatureExponentUndefined: Self = StObject.set(x, "unitFactorTemperatureExponent", js.undefined)
    
    inline def setUnitFactorTimeExponent(value: Double): Self = StObject.set(x, "unitFactorTimeExponent", value.asInstanceOf[js.Any])
    
    inline def setUnitFactorTimeExponentUndefined: Self = StObject.set(x, "unitFactorTimeExponent", js.undefined)
    
    inline def setUnitSystem(value: HIDUnitSystem): Self = StObject.set(x, "unitSystem", value.asInstanceOf[js.Any])
    
    inline def setUnitSystemUndefined: Self = StObject.set(x, "unitSystem", js.undefined)
    
    inline def setUsageMaximum(value: Double): Self = StObject.set(x, "usageMaximum", value.asInstanceOf[js.Any])
    
    inline def setUsageMaximumUndefined: Self = StObject.set(x, "usageMaximum", js.undefined)
    
    inline def setUsageMinimum(value: Double): Self = StObject.set(x, "usageMinimum", value.asInstanceOf[js.Any])
    
    inline def setUsageMinimumUndefined: Self = StObject.set(x, "usageMinimum", js.undefined)
    
    inline def setUsages(value: js.Array[Double]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    inline def setUsagesUndefined: Self = StObject.set(x, "usages", js.undefined)
    
    inline def setUsagesVarargs(value: Double*): Self = StObject.set(x, "usages", js.Array(value*))
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
