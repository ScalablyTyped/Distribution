package typings
package webpackLib.webpackMod.webpackNs.optimizeNs.AggressiveMergingPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When options.moveToParents is set, moving to an entry chunk is more expensive.
    * Defaults to 10, which means moving to an entry chunk is ten times more expensive than moving to a
    * normal chunk.
    */
  var entryChunkMultiplicator: js.UndefOr[scala.Double] = js.undefined
  /**
    * A factor which defines the minimum required size reduction for chunk merging.
    * Defaults to 1.5 which means that the total size needs to be reduced by 50% for chunk merging.
    */
  var minSizeReduce: js.UndefOr[scala.Double] = js.undefined
  /**
    * When set, modules that are not in both merged chunks are moved to all parents of the chunk.
    * Defaults to false.
    */
  var moveToParents: js.UndefOr[scala.Boolean] = js.undefined
}

