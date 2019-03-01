package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[PublisherQueryResult]
  }
}

