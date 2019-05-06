package typings
package webpackLib.webpackMod.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToJsonOutput extends js.Object {
  var _showErrors: scala.Boolean
  var _showWarnings: scala.Boolean
  var assets: js.UndefOr[js.Array[webpackLib.Anon_ChunkNames]] = js.undefined
  var assetsByChunkName: js.UndefOr[
    stdLib.Record[java.lang.String, stdLib.Record[java.lang.String, js.Array[java.lang.String]]]
  ] = js.undefined
  var builtAt: js.UndefOr[scala.Double] = js.undefined
  var children: js.UndefOr[js.Array[ToJsonOptions] with webpackLib.Anon_Name] = js.undefined
  var chunks: js.UndefOr[webpackLib.Anon_Children] = js.undefined
  var entrypoints: js.UndefOr[stdLib.Record[java.lang.String, ChunkGroup]] = js.undefined
  var env: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var errors: js.Array[java.lang.String]
  var filteredAssets: js.UndefOr[scala.Double] = js.undefined
  var filteredModules: js.UndefOr[scala.Boolean] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var modules: js.UndefOr[js.Array[FnModules]] = js.undefined
  var namedChunkGroups: js.UndefOr[stdLib.Record[java.lang.String, ChunkGroup]] = js.undefined
  var needAdditionalPass: js.UndefOr[scala.Boolean] = js.undefined
  var outputPath: js.UndefOr[java.lang.String] = js.undefined
  var publicPath: js.UndefOr[java.lang.String] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var warnings: js.Array[java.lang.String]
}

object ToJsonOutput {
  @scala.inline
  def apply(
    _showErrors: scala.Boolean,
    _showWarnings: scala.Boolean,
    errors: js.Array[java.lang.String],
    warnings: js.Array[java.lang.String],
    assets: js.Array[webpackLib.Anon_ChunkNames] = null,
    assetsByChunkName: stdLib.Record[java.lang.String, stdLib.Record[java.lang.String, js.Array[java.lang.String]]] = null,
    builtAt: scala.Int | scala.Double = null,
    children: js.Array[ToJsonOptions] with webpackLib.Anon_Name = null,
    chunks: webpackLib.Anon_Children = null,
    entrypoints: stdLib.Record[java.lang.String, ChunkGroup] = null,
    env: stdLib.Record[java.lang.String, _] = null,
    filteredAssets: scala.Int | scala.Double = null,
    filteredModules: js.UndefOr[scala.Boolean] = js.undefined,
    hash: java.lang.String = null,
    modules: js.Array[FnModules] = null,
    namedChunkGroups: stdLib.Record[java.lang.String, ChunkGroup] = null,
    needAdditionalPass: js.UndefOr[scala.Boolean] = js.undefined,
    outputPath: java.lang.String = null,
    publicPath: java.lang.String = null,
    time: scala.Int | scala.Double = null,
    version: java.lang.String = null
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

