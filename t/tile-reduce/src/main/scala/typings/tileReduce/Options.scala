package typings.tileReduce

import typings.tileReduce.TileReduce.BBox
import typings.tileReduce.TileReduce.Source
import typings.tileReduce.TileReduce.Tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bbox: js.UndefOr[BBox] = js.native
  var geojson: js.UndefOr[js.Any] = js.native
  var log: js.UndefOr[Boolean] = js.native
  var map: String = js.native
  var mapOptions: js.UndefOr[js.Any] = js.native
  var maxWorkers: js.UndefOr[Double] = js.native
  var output: js.UndefOr[js.Any] = js.native
  var sourceCover: js.UndefOr[String] = js.native
  var sources: js.Array[Source] = js.native
  var tileStream: js.UndefOr[js.Any] = js.native
  var tiles: js.UndefOr[js.Array[Tile]] = js.native
  var zoom: Double = js.native
}

object Options {
  @scala.inline
  def apply(map: String, sources: js.Array[Source], zoom: Double): Options = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMap(value: String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[Source]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setBbox(value: BBox): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    @scala.inline
    def setGeojson(value: js.Any): Self = this.set("geojson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeojson: Self = this.set("geojson", js.undefined)
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMapOptions(value: js.Any): Self = this.set("mapOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapOptions: Self = this.set("mapOptions", js.undefined)
    @scala.inline
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWorkers: Self = this.set("maxWorkers", js.undefined)
    @scala.inline
    def setOutput(value: js.Any): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setSourceCover(value: String): Self = this.set("sourceCover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCover: Self = this.set("sourceCover", js.undefined)
    @scala.inline
    def setTileStream(value: js.Any): Self = this.set("tileStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileStream: Self = this.set("tileStream", js.undefined)
    @scala.inline
    def setTilesVarargs(value: Tile*): Self = this.set("tiles", js.Array(value :_*))
    @scala.inline
    def setTiles(value: js.Array[Tile]): Self = this.set("tiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiles: Self = this.set("tiles", js.undefined)
  }
  
}

