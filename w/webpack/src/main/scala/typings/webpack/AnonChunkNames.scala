package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChunkNames extends js.Object {
  var chunkNames: js.Array[String]
  var chunks: js.Array[Double | String]
  var emitted: Boolean
  var isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
  var name: String
  var size: Double
}

object AnonChunkNames {
  @scala.inline
  def apply(
    chunkNames: js.Array[String],
    chunks: js.Array[Double | String],
    emitted: Boolean,
    name: String,
    size: Double,
    isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
  ): AnonChunkNames = {
    val __obj = js.Dynamic.literal(chunkNames = chunkNames.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], emitted = emitted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (!js.isUndefined(isOverSizeLimit)) __obj.updateDynamic("isOverSizeLimit")(isOverSizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChunkNames]
  }
}

