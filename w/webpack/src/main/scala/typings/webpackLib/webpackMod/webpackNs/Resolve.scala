package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve extends js.Object {
  /**
    * Replace the given module requests with other modules or paths.
    *
    * @see aliasFields
    */
  var alias: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * A list of fields in a package description object to try to parse
    * in the same format as the `alias` resolve option.
    *
    * Defaults to `["browser"]` or `[]`, depending on the value of the
    * `target` `Configuration` value.
    *
    * @see alias
    */
  var aliasFields: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
    * A function used to decide whether to cache the given resolve request.
    *
    * Defaults to `() => true`.
    */
  var cachePredicate: js.UndefOr[js.Function1[/* data */ webpackLib.Anon_Path, scala.Boolean]] = js.undefined
  /**
    * If unsafe cache is enabled, includes request.context in the cache key.
    * This option is taken into account by the enhanced-resolve module.
    * Since webpack 3.1.0 context in resolve caching is ignored when resolve or resolveLoader plugins are provided.
    * This addresses a performance regression.
    */
  var cacheWithContext: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of package description files to search for.
    *
    * Defaults to `["package.json"]`
    */
  var descriptionFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If true, requires that all requested paths must use an extension
    * from `extensions`.
    */
  var enforceExtension: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of file extensions to try when requesting files.
    *
    * An empty string is considered invalid.
    */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A list of fields in a package description object to use for finding
    * the entry point.
    *
    * Defaults to `["browser", "module", "main"]` or `["module", "main"]`,
    * depending on the value of the `target` `Configuration` value.
    */
  var mainFields: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
    * A list of file names to search for when requiring directories that
    * don't contain a package description file.
    *
    * Defaults to `["index"]`.
    */
  var mainFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var modules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A list of additional resolve plugins which should be applied.
    */
  var plugins: js.UndefOr[js.Array[ResolvePlugin]] = js.undefined
  /**
    * Whether to resolve symlinks to their symlinked location.
    *
    * Defaults to `true`
    */
  var symlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to use a cache for resolving, or the specific object
    * to use for caching. Sharing objects may be useful when running
    * multiple webpack compilers.
    *
    * Defaults to `true`.
    */
  var unsafeCache: js.UndefOr[js.Object | scala.Boolean] = js.undefined
}

