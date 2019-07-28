package typings.webpack.webpackMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveLoader extends Resolve {
  var enforceModuleExtension: js.UndefOr[Boolean] = js.undefined
  /**
    * List of strings to append to a loader's name when trying to resolve it.
    */
  var moduleExtensions: js.UndefOr[js.Array[String]] = js.undefined
}

object ResolveLoader {
  @scala.inline
  def apply(
    alias: StringDictionary[String] = null,
    aliasFields: js.Array[js.Array[String] | String] = null,
    cachePredicate: /* data */ Anon_Path => Boolean = null,
    cacheWithContext: js.UndefOr[Boolean] = js.undefined,
    descriptionFiles: js.Array[String] = null,
    enforceExtension: js.UndefOr[Boolean] = js.undefined,
    enforceModuleExtension: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    mainFields: js.Array[js.Array[String] | String] = null,
    mainFiles: js.Array[String] = null,
    moduleExtensions: js.Array[String] = null,
    modules: js.Array[String] = null,
    plugins: js.Array[ResolvePlugin] = null,
    symlinks: js.UndefOr[Boolean] = js.undefined,
    unsafeCache: js.Object | Boolean = null
  ): ResolveLoader = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (aliasFields != null) __obj.updateDynamic("aliasFields")(aliasFields)
    if (cachePredicate != null) __obj.updateDynamic("cachePredicate")(js.Any.fromFunction1(cachePredicate))
    if (!js.isUndefined(cacheWithContext)) __obj.updateDynamic("cacheWithContext")(cacheWithContext)
    if (descriptionFiles != null) __obj.updateDynamic("descriptionFiles")(descriptionFiles)
    if (!js.isUndefined(enforceExtension)) __obj.updateDynamic("enforceExtension")(enforceExtension)
    if (!js.isUndefined(enforceModuleExtension)) __obj.updateDynamic("enforceModuleExtension")(enforceModuleExtension)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields)
    if (mainFiles != null) __obj.updateDynamic("mainFiles")(mainFiles)
    if (moduleExtensions != null) __obj.updateDynamic("moduleExtensions")(moduleExtensions)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(symlinks)) __obj.updateDynamic("symlinks")(symlinks)
    if (unsafeCache != null) __obj.updateDynamic("unsafeCache")(unsafeCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveLoader]
  }
}

