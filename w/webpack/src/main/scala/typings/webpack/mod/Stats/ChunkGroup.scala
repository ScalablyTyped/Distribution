package typings.webpack.mod.Stats

import typings.std.Record
import typings.webpack.AnonAssets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkGroup extends js.Object {
  var assets: js.Array[String]
  var childAssets: Record[String, js.Array[String]]
  var children: Record[String, AnonAssets]
  var chunks: js.Array[Double | String]
  var isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
}

object ChunkGroup {
  @scala.inline
  def apply(
    assets: js.Array[String],
    childAssets: Record[String, js.Array[String]],
    children: Record[String, AnonAssets],
    chunks: js.Array[Double | String],
    isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
  ): ChunkGroup = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], childAssets = childAssets.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any])
    if (!js.isUndefined(isOverSizeLimit)) __obj.updateDynamic("isOverSizeLimit")(isOverSizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkGroup]
  }
}

