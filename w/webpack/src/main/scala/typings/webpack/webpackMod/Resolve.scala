package typings.webpack.webpackMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve extends js.Object {
  /**
    * Replace the given module requests with other modules or paths.
    *
    * @see aliasFields
    */
  var alias: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * A list of fields in a package description object to try to parse
    * in the same format as the `alias` resolve option.
    *
    * Defaults to `["browser"]` or `[]`, depending on the value of the
    * `target` `Configuration` value.
    *
    * @see alias
    */
  var aliasFields: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  /**
    * A function used to decide whether to cache the given resolve request.
    *
    * Defaults to `() => true`.
    */
  var cachePredicate: js.UndefOr[js.Function1[/* data */ Anon_Path, Boolean]] = js.undefined
  /**
    * If unsafe cache is enabled, includes request.context in the cache key.
    * This option is taken into account by the enhanced-resolve module.
    * Since webpack 3.1.0 context in resolve caching is ignored when resolve or resolveLoader plugins are provided.
    * This addresses a performance regression.
    */
  var cacheWithContext: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of package description files to search for.
    *
    * Defaults to `["package.json"]`
    */
  var descriptionFiles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If true, requires that all requested paths must use an extension
    * from `extensions`.
    */
  var enforceExtension: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of file extensions to try when requesting files.
    *
    * An empty string is considered invalid.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of fields in a package description object to use for finding
    * the entry point.
    *
    * Defaults to `["browser", "module", "main"]` or `["module", "main"]`,
    * depending on the value of the `target` `Configuration` value.
    */
  var mainFields: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  /**
    * A list of file names to search for when requiring directories that
    * don't contain a package description file.
    *
    * Defaults to `["index"]`.
    */
  var mainFiles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of directories to resolve modules from.
    *
    * Absolute paths will be searched once.
    *
    * If an entry is relative, will be resolved using node's resolution algorithm
    * relative to the requested file.
    *
    * Defaults to `["node_modules"]`
    */
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of additional resolve plugins which should be applied.
    */
  var plugins: js.UndefOr[js.Array[ResolvePlugin]] = js.undefined
  /**
    * Whether to resolve symlinks to their symlinked location.
    *
    * Defaults to `true`
    */
  var symlinks: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use a cache for resolving, or the specific object
    * to use for caching. Sharing objects may be useful when running
    * multiple webpack compilers.
    *
    * Defaults to `true`.
    */
  var unsafeCache: js.UndefOr[js.Object | Boolean] = js.undefined
}

object Resolve {
  @scala.inline
  def apply(
    alias: StringDictionary[String] = null,
    aliasFields: js.Array[js.Array[String] | String] = null,
    cachePredicate: /* data */ Anon_Path => Boolean = null,
    cacheWithContext: js.UndefOr[Boolean] = js.undefined,
    descriptionFiles: js.Array[String] = null,
    enforceExtension: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    mainFields: js.Array[js.Array[String] | String] = null,
    mainFiles: js.Array[String] = null,
    modules: js.Array[String] = null,
    plugins: js.Array[ResolvePlugin] = null,
    symlinks: js.UndefOr[Boolean] = js.undefined,
    unsafeCache: js.Object | Boolean = null
  ): Resolve = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (aliasFields != null) __obj.updateDynamic("aliasFields")(aliasFields.asInstanceOf[js.Any])
    if (cachePredicate != null) __obj.updateDynamic("cachePredicate")(js.Any.fromFunction1(cachePredicate))
    if (!js.isUndefined(cacheWithContext)) __obj.updateDynamic("cacheWithContext")(cacheWithContext.asInstanceOf[js.Any])
    if (descriptionFiles != null) __obj.updateDynamic("descriptionFiles")(descriptionFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceExtension)) __obj.updateDynamic("enforceExtension")(enforceExtension.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields.asInstanceOf[js.Any])
    if (mainFiles != null) __obj.updateDynamic("mainFiles")(mainFiles.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(symlinks)) __obj.updateDynamic("symlinks")(symlinks.asInstanceOf[js.Any])
    if (unsafeCache != null) __obj.updateDynamic("unsafeCache")(unsafeCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolve]
  }
}

