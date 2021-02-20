package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listFields` operation. */
@js.native
trait ListFieldsParams extends StObject {
  
  /** A comma-separated list of collection IDs to be queried against. */
  var collection_ids: js.Array[String] = js.native
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object ListFieldsParams {
  
  @scala.inline
  def apply(collection_ids: js.Array[String], environment_id: String): ListFieldsParams = {
    val __obj = js.Dynamic.literal(collection_ids = collection_ids.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFieldsParams]
  }
  
  @scala.inline
  implicit class ListFieldsParamsMutableBuilder[Self <: ListFieldsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_ids(value: js.Array[String]): Self = StObject.set(x, "collection_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection_idsVarargs(value: String*): Self = StObject.set(x, "collection_ids", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
