package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ListConfigurationsResponse. */
trait ListConfigurationsResponse extends StObject {
  
  /** An array of Configurations that are available for the service instance. */
  var configurations: js.UndefOr[js.Array[Configuration]] = js.undefined
}
object ListConfigurationsResponse {
  
  inline def apply(): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
  
  extension [Self <: ListConfigurationsResponse](x: Self) {
    
    inline def setConfigurations(value: js.Array[Configuration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "configurations", js.Array(value :_*))
  }
}
