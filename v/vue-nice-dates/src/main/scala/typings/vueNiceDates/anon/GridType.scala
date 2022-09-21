package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridType extends StObject {
  
  var gridType: String
  
  var receivedInitialDate: js.Date | Null
}
object GridType {
  
  inline def apply(gridType: String): GridType = {
    val __obj = js.Dynamic.literal(gridType = gridType.asInstanceOf[js.Any], receivedInitialDate = null)
    __obj.asInstanceOf[GridType]
  }
  
  extension [Self <: GridType](x: Self) {
    
    inline def setGridType(value: String): Self = StObject.set(x, "gridType", value.asInstanceOf[js.Any])
    
    inline def setReceivedInitialDate(value: js.Date): Self = StObject.set(x, "receivedInitialDate", value.asInstanceOf[js.Any])
    
    inline def setReceivedInitialDateNull: Self = StObject.set(x, "receivedInitialDate", null)
  }
}
