package typings
package webpackLib.webpackMod.webpackNs.optimizeNs.AggressiveSplittingPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chunkOverhead: webpackLib.webpackLibNumbers.`0`
  var entryChunkMultiplicator: webpackLib.webpackLibNumbers.`1`
  /**
    * Size in byte.
    * maximum size prefered for each chunk.
    *
    * Default: 51200
    */
  var maxSize: webpackLib.webpackLibNumbers.`50000`
  /**
    * Size in byte.
    * Only chunks bigger than the specified minSize are stored in records.
    * This ensures the chunks fill up as your application grows,
    * instead of creating too many chunks for every change.
    *
    * Default: 30720
    */
  var minSize: webpackLib.webpackLibNumbers.`30000`
}

