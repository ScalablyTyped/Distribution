package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkNames extends js.Object {
  var chunkNames: js.Array[java.lang.String]
  var chunks: js.Array[scala.Double]
  var emitted: scala.Boolean
  var isOverSizeLimit: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var size: scala.Double
}

object Anon_ChunkNames {
  @scala.inline
  def apply(
    chunkNames: js.Array[java.lang.String],
    chunks: js.Array[scala.Double],
    emitted: scala.Boolean,
    name: java.lang.String,
    size: scala.Double,
    isOverSizeLimit: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ChunkNames = {
    val __obj = js.Dynamic.literal(chunkNames = chunkNames, chunks = chunks, emitted = emitted, name = name, size = size)
    if (!js.isUndefined(isOverSizeLimit)) __obj.updateDynamic("isOverSizeLimit")(isOverSizeLimit)
    __obj.asInstanceOf[Anon_ChunkNames]
  }
}

