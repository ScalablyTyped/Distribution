package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DeleteCollectionResponse. */
@js.native
trait DeleteCollectionResponse extends js.Object {
  
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
  implicit class DeleteCollectionResponseOps[Self <: DeleteCollectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
