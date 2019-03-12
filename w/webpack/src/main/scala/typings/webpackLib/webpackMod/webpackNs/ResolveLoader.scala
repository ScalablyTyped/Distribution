package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveLoader extends Resolve {
  var enforceModuleExtension: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of strings to append to a loader's name when trying to resolve it.
    */
  var moduleExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ResolveLoader {
  @scala.inline
  def apply(
    alias: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    aliasFields: js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = null,
    cachePredicate: /* data */ webpackLib.Anon_Path => scala.Boolean = null,
    cacheWithContext: js.UndefOr[scala.Boolean] = js.undefined,
    descriptionFiles: js.Array[java.lang.String] = null,
    enforceExtension: js.UndefOr[scala.Boolean] = js.undefined,
    enforceModuleExtension: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[java.lang.String] = null,
    mainFields: js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = null,
    mainFiles: js.Array[java.lang.String] = null,
    moduleExtensions: js.Array[java.lang.String] = null,
    modules: js.Array[java.lang.String] = null,
    plugins: js.Array[ResolvePlugin] = null,
    symlinks: js.UndefOr[scala.Boolean] = js.undefined,
    unsafeCache: js.Object | scala.Boolean = null
  ): ResolveLoader = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (aliasFields != null) __obj.updateDynamic("aliasFields")(aliasFields.asInstanceOf[js.Any])
    if (cachePredicate != null) __obj.updateDynamic("cachePredicate")(js.Any.fromFunction1(cachePredicate))
    if (!js.isUndefined(cacheWithContext)) __obj.updateDynamic("cacheWithContext")(cacheWithContext)
    if (descriptionFiles != null) __obj.updateDynamic("descriptionFiles")(descriptionFiles)
    if (!js.isUndefined(enforceExtension)) __obj.updateDynamic("enforceExtension")(enforceExtension)
    if (!js.isUndefined(enforceModuleExtension)) __obj.updateDynamic("enforceModuleExtension")(enforceModuleExtension)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields.asInstanceOf[js.Any])
    if (mainFiles != null) __obj.updateDynamic("mainFiles")(mainFiles)
    if (moduleExtensions != null) __obj.updateDynamic("moduleExtensions")(moduleExtensions)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(symlinks)) __obj.updateDynamic("symlinks")(symlinks)
    if (unsafeCache != null) __obj.updateDynamic("unsafeCache")(unsafeCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveLoader]
  }
}

