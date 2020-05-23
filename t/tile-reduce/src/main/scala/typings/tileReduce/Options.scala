package typings.tileReduce

import typings.tileReduce.TileReduce.BBox
import typings.tileReduce.TileReduce.Source
import typings.tileReduce.TileReduce.Tile
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
    maxWorkers: js.UndefOr[Double] = js.undefined,
    output: js.Any = null,
    sourceCover: String = null,
    tileStream: js.Any = null,
    tiles: js.Array[Tile] = null
  ): Options = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (geojson != null) __obj.updateDynamic("geojson")(geojson.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWorkers)) __obj.updateDynamic("maxWorkers")(maxWorkers.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (sourceCover != null) __obj.updateDynamic("sourceCover")(sourceCover.asInstanceOf[js.Any])
    if (tileStream != null) __obj.updateDynamic("tileStream")(tileStream.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

