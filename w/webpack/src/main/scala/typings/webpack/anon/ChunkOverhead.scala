package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkOverhead extends js.Object {
  var chunkOverhead: js.UndefOr[Double] = js.undefined
  var entryChunkMultiplicator: js.UndefOr[Double] = js.undefined
}

object ChunkOverhead {
  @scala.inline
  def apply(
    chunkOverhead: js.UndefOr[Double] = js.undefined,
    entryChunkMultiplicator: js.UndefOr[Double] = js.undefined
  ): ChunkOverhead = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkOverhead)) __obj.updateDynamic("chunkOverhead")(chunkOverhead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(entryChunkMultiplicator)) __obj.updateDynamic("entryChunkMultiplicator")(entryChunkMultiplicator.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkOverhead]
  }
}

