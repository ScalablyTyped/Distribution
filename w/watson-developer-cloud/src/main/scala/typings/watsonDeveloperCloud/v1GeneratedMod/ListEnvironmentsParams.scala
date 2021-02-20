package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listEnvironments` operation. */
@js.native
trait ListEnvironmentsParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** Show only the environment with the given name. */
  var name: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object ListEnvironmentsParams {
  
  @scala.inline
  def apply(): ListEnvironmentsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsParams]
  }
  
  @scala.inline
  implicit class ListEnvironmentsParamsMutableBuilder[Self <: ListEnvironmentsParams] (val x: Self) extends AnyVal {
    
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
