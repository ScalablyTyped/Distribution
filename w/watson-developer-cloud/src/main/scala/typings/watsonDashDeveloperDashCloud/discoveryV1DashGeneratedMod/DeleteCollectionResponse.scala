package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DeleteCollectionResponse. */
trait DeleteCollectionResponse extends js.Object {
  /** The unique identifier of the collection that is being deleted. */
  var collection_id: String
  /** The status of the collection. The status of a successful deletion operation is `deleted`. */
  var status: String
}

object DeleteCollectionResponse {
  @scala.inline
  def apply(collection_id: String, status: String): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal(collection_id = collection_id, status = status)
  
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
}

