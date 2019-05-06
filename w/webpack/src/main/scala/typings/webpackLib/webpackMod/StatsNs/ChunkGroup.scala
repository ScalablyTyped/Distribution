package typings
package webpackLib.webpackMod.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkGroup extends js.Object {
  var assets: js.Array[java.lang.String]
  var childAssets: stdLib.Record[java.lang.String, js.Array[java.lang.String]]
  var children: stdLib.Record[java.lang.String, webpackLib.Anon_Assets]
  var chunks: js.Array[scala.Double]
  var isOverSizeLimit: js.UndefOr[scala.Boolean] = js.undefined
}

object ChunkGroup {
  @scala.inline
  def apply(
    assets: js.Array[java.lang.String],
    childAssets: stdLib.Record[java.lang.String, js.Array[java.lang.String]],
    children: stdLib.Record[java.lang.String, webpackLib.Anon_Assets],
    chunks: js.Array[scala.Double],
    isOverSizeLimit: js.UndefOr[scala.Boolean] = js.undefined
  ): ChunkGroup = {
    val __obj = js.Dynamic.literal(assets = assets, childAssets = childAssets, children = children, chunks = chunks)
    if (!js.isUndefined(isOverSizeLimit)) __obj.updateDynamic("isOverSizeLimit")(isOverSizeLimit)
    __obj.asInstanceOf[ChunkGroup]
  }
}

