package typings.svgo.mod

import typings.svgo.svgoStrings.base64
import typings.svgo.svgoStrings.enc
import typings.svgo.svgoStrings.unenc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Output as Data URI string. */
  var datauri: js.UndefOr[base64 | enc | unenc] = js.native
  /** Precision of floating point numbers. Will be passed to each plugin that suppors this param. */
  var floatPrecision: js.UndefOr[Double] = js.native
  /** Use full set of plugins. */
  var full: js.UndefOr[Boolean] = js.native
  /** Options for rendering optimized SVG from AST. */
  var js2svg: js.UndefOr[Js2SvgOptions] = js.native
  /**
    * Individual plugin configurations.
    * For specific options, see plugin source in https://github.com/svg/svgo/tree/master/plugins.
    */
  var plugins: js.UndefOr[js.Array[PluginConfig]] = js.native
  /** Options for parsing original SVG into AST. */
  var svg2js: js.UndefOr[Svg2JsOptions] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDatauri(value: base64 | enc | unenc): Self = this.set("datauri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatauri: Self = this.set("datauri", js.undefined)
    @scala.inline
    def setFloatPrecision(value: Double): Self = this.set("floatPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatPrecision: Self = this.set("floatPrecision", js.undefined)
    @scala.inline
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    @scala.inline
    def setJs2svg(value: Js2SvgOptions): Self = this.set("js2svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJs2svg: Self = this.set("js2svg", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: PluginConfig*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[PluginConfig]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setSvg2js(value: Svg2JsOptions): Self = this.set("svg2js", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg2js: Self = this.set("svg2js", js.undefined)
  }
  
}

