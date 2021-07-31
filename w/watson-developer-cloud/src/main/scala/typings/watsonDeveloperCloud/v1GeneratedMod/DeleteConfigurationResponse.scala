package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DeleteConfigurationResponse. */
trait DeleteConfigurationResponse extends StObject {
  
  /** The unique identifier for the configuration. */
  var configuration_id: String
  
  /** An array of notice messages, if any. */
  var notices: js.UndefOr[js.Array[Notice]] = js.undefined
  
  /** Status of the configuration. A deleted configuration has the status deleted. */
  var status: String
}
object DeleteConfigurationResponse {
  
  @scala.inline
  def apply(configuration_id: String, status: String): DeleteConfigurationResponse = {
    val __obj = js.Dynamic.literal(configuration_id = configuration_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationResponse]
  }
  
  @scala.inline
  implicit class DeleteConfigurationResponseMutableBuilder[Self <: DeleteConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotices(value: js.Array[Notice]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
    
    @scala.inline
    def setNoticesVarargs(value: Notice*): Self = StObject.set(x, "notices", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
