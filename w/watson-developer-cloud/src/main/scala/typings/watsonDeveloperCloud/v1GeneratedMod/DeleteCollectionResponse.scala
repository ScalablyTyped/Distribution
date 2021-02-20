package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DeleteCollectionResponse. */
@js.native
trait DeleteCollectionResponse extends StObject {
  
  /** The unique identifier of the collection that is being deleted. */
  var collection_id: String = js.native
  
  /** The status of the collection. The status of a successful deletion operation is `deleted`. */
  var status: String = js.native
}
object DeleteCollectionResponse {
  
  @scala.inline
  def apply(collection_id: String, status: String): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
  
  @scala.inline
  implicit class DeleteCollectionResponseMutableBuilder[Self <: DeleteCollectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
