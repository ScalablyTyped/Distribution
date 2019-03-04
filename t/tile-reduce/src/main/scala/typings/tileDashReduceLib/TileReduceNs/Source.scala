package typings
package tileDashReduceLib.TileReduceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var layers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxrate: js.UndefOr[scala.Double] = js.undefined
  var mbtiles: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    name: java.lang.String,
    layers: js.Array[java.lang.String] = null,
    maxrate: scala.Int | scala.Double = null,
    mbtiles: java.lang.String = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): Source = {
    val __obj = js.Dynamic.literal(name = name)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (maxrate != null) __obj.updateDynamic("maxrate")(maxrate.asInstanceOf[js.Any])
    if (mbtiles != null) __obj.updateDynamic("mbtiles")(mbtiles)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Source]
  }
}

