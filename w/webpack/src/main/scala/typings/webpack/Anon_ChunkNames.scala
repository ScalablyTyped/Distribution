package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkNames extends js.Object {
  var chunkNames: js.Array[String]
  var chunks: js.Array[Double]
  var emitted: Boolean
  var isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
  var name: String
  var size: Double
}

object Anon_ChunkNames {
  @scala.inline
  def apply(
    chunkNames: js.Array[String],
    chunks: js.Array[Double],
    emitted: Boolean,
    name: String,
    size: Double,
    isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChunkNames = {
    val __obj = js.Dynamic.literal(chunkNames = chunkNames, chunks = chunks, emitted = emitted, name = name, size = size)
    if (!js.isUndefined(isOverSizeLimit)) __obj.updateDynamic("isOverSizeLimit")(isOverSizeLimit)
    __obj.asInstanceOf[Anon_ChunkNames]
  }
}

