package typings.webpack.webpackMod.Stats

import typings.std.Record
import typings.webpack.Anon_Assets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkGroup extends js.Object {
  var assets: js.Array[String]
  var childAssets: Record[String, js.Array[String]]
  var children: Record[String, Anon_Assets]
  var chunks: js.Array[Double | String]
  var isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
}

object ChunkGroup {
  @scala.inline
  def apply(
    assets: js.Array[String],
    childAssets: Record[String, js.Array[String]],
    children: Record[String, Anon_Assets],
    chunks: js.Array[Double | String],
    isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
  ): ChunkGroup = {
    val __obj = js.Dynamic.literal(assets = assets, childAssets = childAssets, children = children, chunks = chunks)
    if (!js.isUndefined(isOverSizeLimit)) __obj.updateDynamic("isOverSizeLimit")(isOverSizeLimit)
    __obj.asInstanceOf[ChunkGroup]
  }
}

