package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ListCollectionsResponse. */
trait ListCollectionsResponse extends js.Object {
  /** An array containing information about each collection in the environment. */
  var collections: js.UndefOr[js.Array[Collection]] = js.undefined
}

object ListCollectionsResponse {
  @scala.inline
  def apply(collections: js.Array[Collection] = null): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (collections != null) __obj.updateDynamic("collections")(collections)
    __obj.asInstanceOf[ListCollectionsResponse]
  }
}

