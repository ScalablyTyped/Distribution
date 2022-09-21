package typings.w3cWebHid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hidreportinfo-dictionary */
trait HIDReportInfo extends StObject {
  
  var items: js.UndefOr[js.Array[HIDReportItem]] = js.undefined
  
  var reportId: js.UndefOr[Double] = js.undefined
}
object HIDReportInfo {
  
  inline def apply(): HIDReportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HIDReportInfo]
  }
  
  extension [Self <: HIDReportInfo](x: Self) {
    
    inline def setItems(value: js.Array[HIDReportItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: HIDReportItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setReportId(value: Double): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
