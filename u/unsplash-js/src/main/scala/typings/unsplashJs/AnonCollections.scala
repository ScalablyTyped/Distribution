package typings.unsplashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollections extends js.Object {
  var collections: js.UndefOr[js.Array[String]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var featured: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object AnonCollections {
  @scala.inline
  def apply(
    collections: js.Array[String] = null,
    count: Int | Double = null,
    featured: js.UndefOr[Boolean] = js.undefined,
    orientation: String = null,
    query: String = null,
    username: String = null
  ): AnonCollections = {
    val __obj = js.Dynamic.literal()
    if (collections != null) __obj.updateDynamic("collections")(collections.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(featured)) __obj.updateDynamic("featured")(featured.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollections]
  }
}

