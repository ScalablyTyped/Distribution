package typings.uglifyJs.mod

import typings.uglifyJs.uglifyJsBooleans.`false`
import typings.uglifyJs.uglifyJsStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinifyOptions extends js.Object {
  /**
    * Pass `false` to skip compressing entirely.
    * Pass an object to specify custom compress options.
    * @default {}
    */
  var compress: js.UndefOr[`false` | CompressOptions] = js.native
  /**
    * Set to true to support IE8
    * @default false
    */
  var ie8: js.UndefOr[Boolean] = js.native
  /**
    * Pass true to prevent discarding or mangling of function names.
    * Useful for code relying on Function.prototype.name.
    * @default false
    */
  var keep_fnames: js.UndefOr[Boolean] = js.native
  /**
    * Pass `false` to skip mangling names,
    * or pass an object to specify mangle options (see below).
    * @default true
    */
  var mangle: js.UndefOr[Boolean | MangleOptions] = js.native
  /**
    * Pass an empty object {} or a previously used nameCache object
    * if you wish to cache mangled variable and property names across multiple invocations of minify().
    * Note: this is a read/write property. `minify()` will read the name cache state of this object
    * and update it during minification so that it may be reused or externally persisted by the user
    */
  var nameCache: js.UndefOr[js.Object] = js.native
  /**
    * Pass an object if you wish to specify additional output options.
    * The defaults are optimized for best compression
    */
  var output: js.UndefOr[OutputOptions] = js.native
  /**
    * Pass an object if you wish to specify some additional parse options.
    */
  var parse: js.UndefOr[ParseOptions] = js.native
  /**
    * Pass an object if you wish to specify source map options.
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.native
  /**
    * Set to `true` if you wish to enable top level variable and function name mangling
    * and to drop unused variables and functions.
    * @default false
    */
  var toplevel: js.UndefOr[Boolean] = js.native
  /**
    * Pass `true` to return compressor warnings in result.warnings.
    * Use the value `verbose` for more detailed warnings.
    * @default false
    */
  var warnings: js.UndefOr[Boolean | verbose] = js.native
}

object MinifyOptions {
  @scala.inline
  def apply(): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOptions]
  }
  @scala.inline
  implicit class MinifyOptionsOps[Self <: MinifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompress(value: `false` | CompressOptions): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setIe8(value: Boolean): Self = this.set("ie8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIe8: Self = this.set("ie8", js.undefined)
    @scala.inline
    def setKeep_fnames(value: Boolean): Self = this.set("keep_fnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_fnames: Self = this.set("keep_fnames", js.undefined)
    @scala.inline
    def setMangle(value: Boolean | MangleOptions): Self = this.set("mangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMangle: Self = this.set("mangle", js.undefined)
    @scala.inline
    def setNameCache(value: js.Object): Self = this.set("nameCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameCache: Self = this.set("nameCache", js.undefined)
    @scala.inline
    def setOutput(value: OutputOptions): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setParse(value: ParseOptions): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean | SourceMapOptions): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    @scala.inline
    def setToplevel(value: Boolean): Self = this.set("toplevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToplevel: Self = this.set("toplevel", js.undefined)
    @scala.inline
    def setWarnings(value: Boolean | verbose): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

