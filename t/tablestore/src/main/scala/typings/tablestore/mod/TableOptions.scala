package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOptions extends StObject {
  
  var maxTimeDeviation: js.UndefOr[Double] = js.undefined
  
  var maxVersions: Double
  
  var timeToLive: Double
}
object TableOptions {
  
  inline def apply(maxVersions: Double, timeToLive: Double): TableOptions = {
    val __obj = js.Dynamic.literal(maxVersions = maxVersions.asInstanceOf[js.Any], timeToLive = timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxTimeDeviation(value: Double): Self = StObject.set(x, "maxTimeDeviation", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeDeviationUndefined: Self = StObject.set(x, "maxTimeDeviation", js.undefined)
    
    inline def setMaxVersions(value: Double): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
  }
}
