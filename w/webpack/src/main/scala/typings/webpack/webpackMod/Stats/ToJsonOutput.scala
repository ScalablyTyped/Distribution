package typings.webpack.webpackMod.Stats

import typings.std.Record
import typings.webpack.Anon_Children
import typings.webpack.Anon_ChunkNames
import typings.webpack.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToJsonOutput extends js.Object {
  var _showErrors: Boolean
  var _showWarnings: Boolean
  var assets: js.UndefOr[js.Array[Anon_ChunkNames]] = js.undefined
  var assetsByChunkName: js.UndefOr[Record[String, Record[String, js.Array[String]]]] = js.undefined
  var builtAt: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[js.Array[ToJsonOutput with Anon_Name]] = js.undefined
  var chunks: js.UndefOr[js.Array[Anon_Children]] = js.undefined
  var entrypoints: js.UndefOr[Record[String, ChunkGroup]] = js.undefined
  var env: js.UndefOr[Record[String, _]] = js.undefined
  var errors: js.Array[String]
  var filteredAssets: js.UndefOr[Double] = js.undefined
  var filteredModules: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var modules: js.UndefOr[js.Array[FnModules]] = js.undefined
  var namedChunkGroups: js.UndefOr[Record[String, ChunkGroup]] = js.undefined
  var needAdditionalPass: js.UndefOr[Boolean] = js.undefined
  var outputPath: js.UndefOr[String] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var warnings: js.Array[String]
}

object ToJsonOutput {
  @scala.inline
  def apply(
    _showErrors: Boolean,
    _showWarnings: Boolean,
    errors: js.Array[String],
    warnings: js.Array[String],
    assets: js.Array[Anon_ChunkNames] = null,
    assetsByChunkName: Record[String, Record[String, js.Array[String]]] = null,
    builtAt: Int | Double = null,
    children: js.Array[ToJsonOutput with Anon_Name] = null,
    chunks: js.Array[Anon_Children] = null,
    entrypoints: Record[String, ChunkGroup] = null,
    env: Record[String, _] = null,
    filteredAssets: Int | Double = null,
    filteredModules: js.UndefOr[Boolean] = js.undefined,
    hash: String = null,
    modules: js.Array[FnModules] = null,
    namedChunkGroups: Record[String, ChunkGroup] = null,
    needAdditionalPass: js.UndefOr[Boolean] = js.undefined,
    outputPath: String = null,
    publicPath: String = null,
    time: Int | Double = null,
    version: String = null
  ): ToJsonOutput = {
    val __obj = js.Dynamic.literal(_showErrors = _showErrors, _showWarnings = _showWarnings, errors = errors, warnings = warnings)
    if (assets != null) __obj.updateDynamic("assets")(assets)
    if (assetsByChunkName != null) __obj.updateDynamic("assetsByChunkName")(assetsByChunkName)
    if (builtAt != null) __obj.updateDynamic("builtAt")(builtAt.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (chunks != null) __obj.updateDynamic("chunks")(chunks)
    if (entrypoints != null) __obj.updateDynamic("entrypoints")(entrypoints)
    if (env != null) __obj.updateDynamic("env")(env)
    if (filteredAssets != null) __obj.updateDynamic("filteredAssets")(filteredAssets.asInstanceOf[js.Any])
    if (!js.isUndefined(filteredModules)) __obj.updateDynamic("filteredModules")(filteredModules)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (namedChunkGroups != null) __obj.updateDynamic("namedChunkGroups")(namedChunkGroups)
    if (!js.isUndefined(needAdditionalPass)) __obj.updateDynamic("needAdditionalPass")(needAdditionalPass)
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath)
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ToJsonOutput]
  }
}

