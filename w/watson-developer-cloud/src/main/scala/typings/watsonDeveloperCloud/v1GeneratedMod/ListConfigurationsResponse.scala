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
  
  @scala.inline
  def apply(): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListConfigurationsResponseMutableBuilder[Self <: ListConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurations(value: js.Array[Configuration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "configurations", js.Array(value :_*))
  }
}
