package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listConfigurations` operation. */
trait ListConfigurationsParams extends StObject {
  
  /** The ID of the environment. */
  var environment_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Find configurations with the given name. */
  var name: js.UndefOr[String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object ListConfigurationsParams {
  
  @scala.inline
  def apply(environment_id: String): ListConfigurationsParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationsParams]
  }
  
  @scala.inline
  implicit class ListConfigurationsParamsMutableBuilder[Self <: ListConfigurationsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
