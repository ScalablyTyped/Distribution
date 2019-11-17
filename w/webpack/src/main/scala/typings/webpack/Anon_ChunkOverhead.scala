package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkOverhead extends js.Object {
  var chunkOverhead: js.UndefOr[Double] = js.undefined
  var entryChunkMultiplicator: js.UndefOr[Double] = js.undefined
}

object Anon_ChunkOverhead {
  @scala.inline
  def apply(chunkOverhead: Int | Double = null, entryChunkMultiplicator: Int | Double = null): Anon_ChunkOverhead = {
    val __obj = js.Dynamic.literal()
    if (chunkOverhead != null) __obj.updateDynamic("chunkOverhead")(chunkOverhead.asInstanceOf[js.Any])
    if (entryChunkMultiplicator != null) __obj.updateDynamic("entryChunkMultiplicator")(entryChunkMultiplicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChunkOverhead]
  }
}

