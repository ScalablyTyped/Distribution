package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherQueryResult extends js.Object {
  /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
  var results: js.Array[PublisherFilterResult]
}

object PublisherQueryResult {
  @scala.inline
  def apply(results: js.Array[PublisherFilterResult]): PublisherQueryResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublisherQueryResult]
  }
}

