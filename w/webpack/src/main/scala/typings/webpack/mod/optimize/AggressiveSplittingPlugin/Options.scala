package typings.webpack.mod.optimize.AggressiveSplittingPlugin

import typings.webpack.webpackNumbers.`0`
import typings.webpack.webpackNumbers.`1`
import typings.webpack.webpackNumbers.`30000`
import typings.webpack.webpackNumbers.`50000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chunkOverhead: `0`
  var entryChunkMultiplicator: `1`
  /**
    * Size in byte.
    * maximum size prefered for each chunk.
    *
    * Default: 51200
    */
  var maxSize: `50000`
  /**
    * Size in byte.
    * Only chunks bigger than the specified minSize are stored in records.
    * This ensures the chunks fill up as your application grows,
    * instead of creating too many chunks for every change.
    *
    * Default: 30720
    */
  var minSize: `30000`
}

object Options {
  @scala.inline
  def apply(chunkOverhead: `0`, entryChunkMultiplicator: `1`, maxSize: `50000`, minSize: `30000`): Options = {
    val __obj = js.Dynamic.literal(chunkOverhead = chunkOverhead.asInstanceOf[js.Any], entryChunkMultiplicator = entryChunkMultiplicator.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

