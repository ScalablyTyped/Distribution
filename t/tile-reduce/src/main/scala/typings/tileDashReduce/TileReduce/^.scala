package typings.tileDashReduce.TileReduce

import typings.tileDashReduce.Events
import typings.tileDashReduce.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TileReduce")
@js.native
object ^ extends js.Object {
  /**
    * Tile Reduce
    *
    * @param {Options} options Tile Reduce Options
    * @param {string} options.map Path to the map script, which will be executed against each tile
    * @param {number} options.zoom Zoom specifies the zoom level of tiles to retrieve from each source.
    * @param {Array<Source>} options.source Sources are specified as an array
    * @param {BBox} [options.bbox] BBox extent in [minX, minY, maxX, maxY] order
    * @param {GeoJSON} [options.geojson] GeoJSON Feature or Feature Collection
    * @param {boolean} [options.log] Disables logging and progress output
    * @param {any} [options.mapOptions] Passes through arbitrary options to workers. Options are made available to map scripts as global.mapOptions
    * @param {number} [options.maxWorkers] By default, TileReduce creates one worker process per CPU. maxWorkers may be used to limit the number of workers created
    * @param {any} [options.output] By default, any data written from workers is piped to process.stdout on the main process. You can pipe to an alternative writable stream using the output option.
    * @param {Array<Tile>} [options.tiles] An array of quadtiles represented as xyz arrays.
    * @param {any} [options.tileStream] Tiles can be read from an object mode node stream. Each object in the stream should be either a string in the format x y z or an array in the format [x, y, z].
    * @param {string} [options.sourceCover] When using MBTiles sources, a list of tiles to process can be automatically retrieved from the source metadata
    * @return {Events} TileReduce returns an EventEmitter.
    * @example
    * tilereduce({...})
    * .on('start', () => {
    *     console.log('starting')
    * })
    */
  def apply(options: Options): Events = js.native
}

