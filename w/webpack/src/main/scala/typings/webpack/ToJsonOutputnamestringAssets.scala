package typings.webpack

import typings.std.Record
import typings.webpack.mod.Stats.ChunkGroup
import typings.webpack.mod.Stats.FnModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined webpack.webpack.Stats.ToJsonOutput & {  name ? :string} */
trait ToJsonOutputnamestringAssets extends js.Object {
  var _showErrors: Boolean
  var _showWarnings: Boolean
  var assets: js.UndefOr[js.Array[AnonChunkNames]] = js.undefined
  var assetsByChunkName: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  var builtAt: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[js.Array[ToJsonOutputnamestring]] = js.undefined
  var chunks: js.UndefOr[js.Array[AnonChildren]] = js.undefined
  var entrypoints: js.UndefOr[Record[String, ChunkGroup]] = js.undefined
  var env: js.UndefOr[Record[String, _]] = js.undefined
  var errors: js.Array[String]
  var filteredAssets: js.UndefOr[Double] = js.undefined
  var filteredModules: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var modules: js.UndefOr[js.Array[FnModules]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namedChunkGroups: js.UndefOr[Record[String, ChunkGroup]] = js.undefined
  var needAdditionalPass: js.UndefOr[Boolean] = js.undefined
  var outputPath: js.UndefOr[String] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var warnings: js.Array[String]
}

object ToJsonOutputnamestringAssets {
  @scala.inline
  def apply(
    _showErrors: Boolean,
    _showWarnings: Boolean,
    errors: js.Array[String],
    warnings: js.Array[String],
    assets: js.Array[AnonChunkNames] = null,
    assetsByChunkName: Record[String, String | js.Array[String]] = null,
    builtAt: Int | Double = null,
    children: js.Array[ToJsonOutputnamestring] = null,
    chunks: js.Array[AnonChildren] = null,
    entrypoints: Record[String, ChunkGroup] = null,
    env: Record[String, _] = null,
    filteredAssets: Int | Double = null,
    filteredModules: js.UndefOr[Boolean] = js.undefined,
    hash: String = null,
    modules: js.Array[FnModules] = null,
    name: String = null,
    namedChunkGroups: Record[String, ChunkGroup] = null,
    needAdditionalPass: js.UndefOr[Boolean] = js.undefined,
    outputPath: String = null,
    publicPath: String = null,
    time: Int | Double = null,
    version: String = null
  ): ToJsonOutputnamestringAssets = {
    val __obj = js.Dynamic.literal(_showErrors = _showErrors.asInstanceOf[js.Any], _showWarnings = _showWarnings.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (assetsByChunkName != null) __obj.updateDynamic("assetsByChunkName")(assetsByChunkName.asInstanceOf[js.Any])
    if (builtAt != null) __obj.updateDynamic("builtAt")(builtAt.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (entrypoints != null) __obj.updateDynamic("entrypoints")(entrypoints.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (filteredAssets != null) __obj.updateDynamic("filteredAssets")(filteredAssets.asInstanceOf[js.Any])
    if (!js.isUndefined(filteredModules)) __obj.updateDynamic("filteredModules")(filteredModules.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedChunkGroups != null) __obj.updateDynamic("namedChunkGroups")(namedChunkGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(needAdditionalPass)) __obj.updateDynamic("needAdditionalPass")(needAdditionalPass.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToJsonOutputnamestringAssets]
  }
}

