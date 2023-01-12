package typings.w3cWebHid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hidcollectioninfo-dictionary */
trait HIDCollectionInfo extends StObject {
  
  var children: js.UndefOr[js.Array[HIDCollectionInfo]] = js.undefined
  
  var featureReports: js.UndefOr[js.Array[HIDReportInfo]] = js.undefined
  
  var inputReports: js.UndefOr[js.Array[HIDReportInfo]] = js.undefined
  
  var outputReports: js.UndefOr[js.Array[HIDReportInfo]] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
  
  var usage: js.UndefOr[Double] = js.undefined
  
  var usagePage: js.UndefOr[Double] = js.undefined
}
object HIDCollectionInfo {
  
  inline def apply(): HIDCollectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HIDCollectionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HIDCollectionInfo] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[HIDCollectionInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: HIDCollectionInfo*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setFeatureReports(value: js.Array[HIDReportInfo]): Self = StObject.set(x, "featureReports", value.asInstanceOf[js.Any])
    
    inline def setFeatureReportsUndefined: Self = StObject.set(x, "featureReports", js.undefined)
    
    inline def setFeatureReportsVarargs(value: HIDReportInfo*): Self = StObject.set(x, "featureReports", js.Array(value*))
    
    inline def setInputReports(value: js.Array[HIDReportInfo]): Self = StObject.set(x, "inputReports", value.asInstanceOf[js.Any])
    
    inline def setInputReportsUndefined: Self = StObject.set(x, "inputReports", js.undefined)
    
    inline def setInputReportsVarargs(value: HIDReportInfo*): Self = StObject.set(x, "inputReports", js.Array(value*))
    
    inline def setOutputReports(value: js.Array[HIDReportInfo]): Self = StObject.set(x, "outputReports", value.asInstanceOf[js.Any])
    
    inline def setOutputReportsUndefined: Self = StObject.set(x, "outputReports", js.undefined)
    
    inline def setOutputReportsVarargs(value: HIDReportInfo*): Self = StObject.set(x, "outputReports", js.Array(value*))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
    
    inline def setUsagePageUndefined: Self = StObject.set(x, "usagePage", js.undefined)
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
