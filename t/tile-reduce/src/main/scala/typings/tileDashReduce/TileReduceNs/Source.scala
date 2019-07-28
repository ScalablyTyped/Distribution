package typings.tileDashReduce.TileReduceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var layers: js.UndefOr[js.Array[String]] = js.undefined
  var maxrate: js.UndefOr[Double] = js.undefined
  var mbtiles: js.UndefOr[String] = js.undefined
  var name: String
  var raw: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    name: String,
    layers: js.Array[String] = null,
    maxrate: Int | Double = null,
    mbtiles: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    url: String = null
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

