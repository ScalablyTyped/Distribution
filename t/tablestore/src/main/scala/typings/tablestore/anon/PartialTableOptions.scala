package typings.tablestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tablestore.tablestore.TableOptions> */
trait PartialTableOptions extends StObject {
  
  var maxTimeDeviation: js.UndefOr[Double] = js.undefined
  
  var maxVersions: js.UndefOr[Double] = js.undefined
  
  var timeToLive: js.UndefOr[Double] = js.undefined
}
object PartialTableOptions {
  
  inline def apply(): PartialTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTableOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxTimeDeviation(value: Double): Self = StObject.set(x, "maxTimeDeviation", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeDeviationUndefined: Self = StObject.set(x, "maxTimeDeviation", js.undefined)
    
    inline def setMaxVersions(value: Double): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionsUndefined: Self = StObject.set(x, "maxVersions", js.undefined)
    
    inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
  }
}
