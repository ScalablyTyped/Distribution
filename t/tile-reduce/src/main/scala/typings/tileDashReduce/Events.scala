package typings.tileDashReduce

import typings.tileDashReduce.TileReduce.Tile
import typings.tileDashReduce.tileDashReduceStrings.end
import typings.tileDashReduce.tileDashReduceStrings.map
import typings.tileDashReduce.tileDashReduceStrings.reduce
import typings.tileDashReduce.tileDashReduceStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  /**
    * End Event
    *
    * @returns {Events}
    * @example
    * let count = 0
    * tilereduce({...})
    * .on('end', () => {
    *     console.log(`Total count was: ${ count }`)
    * })
    */
  @JSName("on")
  def on_end(`type`: end, callback: js.Function1[/* error */ js.Any, Unit]): Events = js.native
  /**
    * Map Event
    *
    * @param {Tile} tile
    * @param {number} workerId
    * @returns {Events}
    * @example
    * tilereduce({...})
    * .on('map', (tile, workerId) => {
    *     console.log(`about to process [${ tile }] on worker ${ workerId }`)
    * })
    */
  @JSName("on")
  def on_map(`type`: map, callback: js.Function2[/* tile */ Tile, /* workerId */ Double, Unit]): Events = js.native
  /**
    * Reduce Event
    *
    * @param {any} result
    * @param {Tile} tile
    * @returns {Events}
    * @example
    * const count = 0
    * tilereduce({...})
    * .on('reduce', (result, tile) => {
    *     console.log(`got a count of ${ result } from ${ tile }`
    *     count ++
    * })
    */
  @JSName("on")
  def on_reduce(`type`: reduce, callback: js.Function2[/* result */ js.Any, /* tile */ Tile, Unit]): Events = js.native
  /**
    * Start Event
    *
    * @returns {Events}
    * @example
    * tilereduce({...})
    * .on('start', () => {
    *     console.log('starting')
    * })
    */
  @JSName("on")
  def on_start(`type`: start, callback: js.Function0[Unit]): Events = js.native
}

