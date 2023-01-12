package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listEnvironments` operation. */
trait ListEnvironmentsParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Show only the environment with the given name. */
  var name: js.UndefOr[String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object ListEnvironmentsParams {
  
  inline def apply(): ListEnvironmentsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnvironmentsParams] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
