package typings.unsplashDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collections extends js.Object {
  var collections: js.UndefOr[js.Array[String]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var featured: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Collections {
  @scala.inline
  def apply(
    collections: js.Array[String] = null,
    count: Int | Double = null,
    featured: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    query: String = null,
    username: String = null,
    width: Int | Double = null
  ): Anon_Collections = {
    val __obj = js.Dynamic.literal()
    if (collections != null) __obj.updateDynamic("collections")(collections)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(featured)) __obj.updateDynamic("featured")(featured)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (username != null) __obj.updateDynamic("username")(username)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Collections]
  }
}

