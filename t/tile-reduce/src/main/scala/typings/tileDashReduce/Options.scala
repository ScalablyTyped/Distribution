package typings.tileDashReduce

import typings.tileDashReduce.TileReduceNs.BBox
import typings.tileDashReduce.TileReduceNs.Source
import typings.tileDashReduce.TileReduceNs.Tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bbox: js.UndefOr[BBox] = js.undefined
  var geojson: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var map: String
  var mapOptions: js.UndefOr[js.Any] = js.undefined
  var maxWorkers: js.UndefOr[Double] = js.undefined
  var output: js.UndefOr[js.Any] = js.undefined
  var sourceCover: js.UndefOr[String] = js.undefined
  var sources: js.Array[Source]
  var tileStream: js.UndefOr[js.Any] = js.undefined
  var tiles: js.UndefOr[js.Array[Tile]] = js.undefined
  var zoom: Double
}

object Options {
  @scala.inline
  def apply(
    map: String,
    sources: js.Array[Source],
    zoom: Double,
    bbox: BBox = null,
    geojson: js.Any = null,
    log: js.UndefOr[Boolean] = js.undefined,
    mapOptions: js.Any = null,
    maxWorkers: Int | Double = null,
    output: js.Any = null,
    sourceCover: String = null,
    tileStream: js.Any = null,
    tiles: js.Array[Tile] = null
  ): Options = {
    val __obj = js.Dynamic.literal(map = map, sources = sources, zoom = zoom)
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

