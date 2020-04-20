package typings.uglifyJs.mod

import typings.uglifyJs.uglifyJsBooleans.`false`
import typings.uglifyJs.uglifyJsStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOptions extends js.Object {
  /**
    * Pass `false` to skip compressing entirely.
    * Pass an object to specify custom compress options.
    * @default {}
    */
  var compress: js.UndefOr[`false` | CompressOptions] = js.undefined
  /**
    * Set to true to support IE8
    * @default false
    */
  var ie8: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass true to prevent discarding or mangling of function names.
    * Useful for code relying on Function.prototype.name.
    * @default false
    */
  var keep_fnames: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass `false` to skip mangling names,
    * or pass an object to specify mangle options (see below).
    * @default true
    */
  var mangle: js.UndefOr[Boolean | MangleOptions] = js.undefined
  /**
    * Pass an empty object {} or a previously used nameCache object
    * if you wish to cache mangled variable and property names across multiple invocations of minify().
    * Note: this is a read/write property. `minify()` will read the name cache state of this object
    * and update it during minification so that it may be reused or externally persisted by the user
    */
  var nameCache: js.UndefOr[js.Object] = js.undefined
  /**
    * Pass an object if you wish to specify additional output options.
    * The defaults are optimized for best compression
    */
  var output: js.UndefOr[OutputOptions] = js.undefined
  /**
    * Pass an object if you wish to specify some additional parse options.
    */
  var parse: js.UndefOr[ParseOptions] = js.undefined
  /**
    * Pass an object if you wish to specify source map options.
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.undefined
  /**
    * Set to `true` if you wish to enable top level variable and function name mangling
    * and to drop unused variables and functions.
    * @default false
    */
  var toplevel: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass `true` to return compressor warnings in result.warnings.
    * Use the value `verbose` for more detailed warnings.
    * @default false
    */
  var warnings: js.UndefOr[Boolean | verbose] = js.undefined
}

object MinifyOptions {
  @scala.inline
  def apply(
    compress: `false` | CompressOptions = null,
    ie8: js.UndefOr[Boolean] = js.undefined,
    keep_fnames: js.UndefOr[Boolean] = js.undefined,
    mangle: Boolean | MangleOptions = null,
    nameCache: js.Object = null,
    output: OutputOptions = null,
    parse: ParseOptions = null,
    sourceMap: Boolean | SourceMapOptions = null,
    toplevel: js.UndefOr[Boolean] = js.undefined,
    warnings: Boolean | verbose = null
  ): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (nameCache != null) __obj.updateDynamic("nameCache")(nameCache.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinifyOptions]
  }
}

