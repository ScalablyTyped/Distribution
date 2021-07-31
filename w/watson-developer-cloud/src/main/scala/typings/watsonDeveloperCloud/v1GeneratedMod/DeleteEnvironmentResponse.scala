package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DeleteEnvironmentResponse. */
trait DeleteEnvironmentResponse extends StObject {
  
  /** The unique identifier for the environment. */
  var environment_id: String
  
  /** Status of the environment. */
  var status: String
}
object DeleteEnvironmentResponse {
  
  @scala.inline
  def apply(environment_id: String, status: String): DeleteEnvironmentResponse = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentResponse]
  }
  
  @scala.inline
  implicit class DeleteEnvironmentResponseMutableBuilder[Self <: DeleteEnvironmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
