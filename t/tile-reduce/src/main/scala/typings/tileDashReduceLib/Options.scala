package typings
package tileDashReduceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bbox: js.UndefOr[tileDashReduceLib.TileReduceNs.BBox] = js.undefined
  var geojson: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[scala.Boolean] = js.undefined
  var map: java.lang.String
  var mapOptions: js.UndefOr[js.Any] = js.undefined
  var maxWorkers: js.UndefOr[scala.Double] = js.undefined
  var output: js.UndefOr[js.Any] = js.undefined
  var sourceCover: js.UndefOr[java.lang.String] = js.undefined
  var sources: js.Array[tileDashReduceLib.TileReduceNs.Source]
  var tileStream: js.UndefOr[js.Any] = js.undefined
  var tiles: js.UndefOr[js.Array[tileDashReduceLib.TileReduceNs.Tile]] = js.undefined
  var zoom: scala.Double
}

object Options {
  @scala.inline
  def apply(
    map: java.lang.String,
    sources: js.Array[tileDashReduceLib.TileReduceNs.Source],
    zoom: scala.Double,
    bbox: tileDashReduceLib.TileReduceNs.BBox = null,
    geojson: js.Any = null,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    mapOptions: js.Any = null,
    maxWorkers: scala.Int | scala.Double = null,
    output: js.Any = null,
    sourceCover: java.lang.String = null,
    tileStream: js.Any = null,
    tiles: js.Array[tileDashReduceLib.TileReduceNs.Tile] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("sources")(sources)
    __obj.updateDynamic("zoom")(zoom)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox)
    if (geojson != null) __obj.updateDynamic("geojson")(geojson)
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (sourceCover != null) __obj.updateDynamic("sourceCover")(sourceCover)
    if (tileStream != null) __obj.updateDynamic("tileStream")(tileStream)
    if (tiles != null) __obj.updateDynamic("tiles")(tiles)
    __obj.asInstanceOf[Options]
  }
}

