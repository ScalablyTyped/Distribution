package typings
package unsplashDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collections extends js.Object {
  var collections: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var featured: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Collections {
  @scala.inline
  def apply(
    collections: js.Array[java.lang.String] = null,
    count: scala.Int | scala.Double = null,
    featured: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    query: java.lang.String = null,
    username: java.lang.String = null,
    width: scala.Int | scala.Double = null
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

