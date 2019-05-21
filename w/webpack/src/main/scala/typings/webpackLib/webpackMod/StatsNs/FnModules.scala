package typings
package webpackLib.webpackMod.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FnModules extends js.Object {
  var assets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var built: scala.Boolean
  var cacheable: scala.Boolean
  var chunks: js.Array[scala.Double]
  var depth: js.UndefOr[scala.Double] = js.undefined
  var errors: scala.Double
  var failed: scala.Boolean
  var filteredModules: js.UndefOr[scala.Boolean] = js.undefined
  var id: scala.Double | java.lang.String
  var identifier: java.lang.String
  var index: scala.Double
  var index2: scala.Double
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  var issuerId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var issuerName: js.UndefOr[java.lang.String] = js.undefined
  var issuerPath: js.Array[webpackLib.Anon_Id]
  var modules: js.Array[FnModules]
  var name: java.lang.String
  var optimizationBailout: js.UndefOr[java.lang.String] = js.undefined
  var optional: scala.Boolean
  var prefetched: scala.Boolean
  var profile: js.Any
   // TODO
  var providedExports: js.UndefOr[js.Any] = js.undefined
   // TODO
  var reasons: webpackLib.Anon_Explanation
  var size: scala.Double
  var source: js.UndefOr[java.lang.String] = js.undefined
  var usedExports: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: scala.Double
}

object FnModules {
  @scala.inline
  def apply(
    built: scala.Boolean,
    cacheable: scala.Boolean,
    chunks: js.Array[scala.Double],
    errors: scala.Double,
    failed: scala.Boolean,
    id: scala.Double | java.lang.String,
    identifier: java.lang.String,
    index: scala.Double,
    index2: scala.Double,
    issuerPath: js.Array[webpackLib.Anon_Id],
    modules: js.Array[FnModules],
    name: java.lang.String,
    optional: scala.Boolean,
    prefetched: scala.Boolean,
    profile: js.Any,
    reasons: webpackLib.Anon_Explanation,
    size: scala.Double,
    warnings: scala.Double,
    assets: js.Array[java.lang.String] = null,
    depth: scala.Int | scala.Double = null,
    filteredModules: js.UndefOr[scala.Boolean] = js.undefined,
    issuer: java.lang.String = null,
    issuerId: scala.Double | java.lang.String = null,
    issuerName: java.lang.String = null,
    optimizationBailout: java.lang.String = null,
    providedExports: js.Any = null,
    source: java.lang.String = null,
    usedExports: js.UndefOr[scala.Boolean] = js.undefined
  ): FnModules = {
    val __obj = js.Dynamic.literal(built = built, cacheable = cacheable, chunks = chunks, errors = errors, failed = failed, id = id.asInstanceOf[js.Any], identifier = identifier, index = index, index2 = index2, issuerPath = issuerPath, modules = modules, name = name, optional = optional, prefetched = prefetched, profile = profile, reasons = reasons, size = size, warnings = warnings)
    if (assets != null) __obj.updateDynamic("assets")(assets)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(filteredModules)) __obj.updateDynamic("filteredModules")(filteredModules)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (issuerId != null) __obj.updateDynamic("issuerId")(issuerId.asInstanceOf[js.Any])
    if (issuerName != null) __obj.updateDynamic("issuerName")(issuerName)
    if (optimizationBailout != null) __obj.updateDynamic("optimizationBailout")(optimizationBailout)
    if (providedExports != null) __obj.updateDynamic("providedExports")(providedExports)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(usedExports)) __obj.updateDynamic("usedExports")(usedExports)
    __obj.asInstanceOf[FnModules]
  }
}

