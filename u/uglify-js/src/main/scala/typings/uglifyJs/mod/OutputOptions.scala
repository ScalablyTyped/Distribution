package typings.uglifyJs.mod

import typings.std.RegExp
import typings.uglifyJs.uglifyJsStrings.all
import typings.uglifyJs.uglifyJsStrings.some
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputOptions extends js.Object {
  var ascii_only: js.UndefOr[Boolean] = js.native
  var beautify: js.UndefOr[Boolean] = js.native
  var braces: js.UndefOr[Boolean] = js.native
  var comments: js.UndefOr[Boolean | all | some | RegExp] = js.native
  var indent_level: js.UndefOr[Double] = js.native
  var indent_start: js.UndefOr[Boolean] = js.native
  var inline_script: js.UndefOr[Boolean] = js.native
  var keep_quoted_props: js.UndefOr[Boolean] = js.native
  var max_line_len: js.UndefOr[Boolean | Double] = js.native
  var preamble: js.UndefOr[String] = js.native
  var preserve_line: js.UndefOr[Boolean] = js.native
  var quote_keys: js.UndefOr[Boolean] = js.native
  var quote_style: js.UndefOr[OutputQuoteStyle] = js.native
  var semicolons: js.UndefOr[Boolean] = js.native
  var shebang: js.UndefOr[Boolean] = js.native
  var webkit: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
  var wrap_iife: js.UndefOr[Boolean] = js.native
}

object OutputOptions {
  @scala.inline
  def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  @scala.inline
  implicit class OutputOptionsOps[Self <: OutputOptions] (val x: Self) extends AnyVal {
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
    def setAscii_only(value: Boolean): Self = this.set("ascii_only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscii_only: Self = this.set("ascii_only", js.undefined)
    @scala.inline
    def setBeautify(value: Boolean): Self = this.set("beautify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeautify: Self = this.set("beautify", js.undefined)
    @scala.inline
    def setBraces(value: Boolean): Self = this.set("braces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraces: Self = this.set("braces", js.undefined)
    @scala.inline
    def setComments(value: Boolean | all | some | RegExp): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setIndent_level(value: Double): Self = this.set("indent_level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent_level: Self = this.set("indent_level", js.undefined)
    @scala.inline
    def setIndent_start(value: Boolean): Self = this.set("indent_start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent_start: Self = this.set("indent_start", js.undefined)
    @scala.inline
    def setInline_script(value: Boolean): Self = this.set("inline_script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline_script: Self = this.set("inline_script", js.undefined)
    @scala.inline
    def setKeep_quoted_props(value: Boolean): Self = this.set("keep_quoted_props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_quoted_props: Self = this.set("keep_quoted_props", js.undefined)
    @scala.inline
    def setMax_line_len(value: Boolean | Double): Self = this.set("max_line_len", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_line_len: Self = this.set("max_line_len", js.undefined)
    @scala.inline
    def setPreamble(value: String): Self = this.set("preamble", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreamble: Self = this.set("preamble", js.undefined)
    @scala.inline
    def setPreserve_line(value: Boolean): Self = this.set("preserve_line", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserve_line: Self = this.set("preserve_line", js.undefined)
    @scala.inline
    def setQuote_keys(value: Boolean): Self = this.set("quote_keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote_keys: Self = this.set("quote_keys", js.undefined)
    @scala.inline
    def setQuote_style(value: OutputQuoteStyle): Self = this.set("quote_style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote_style: Self = this.set("quote_style", js.undefined)
    @scala.inline
    def setSemicolons(value: Boolean): Self = this.set("semicolons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemicolons: Self = this.set("semicolons", js.undefined)
    @scala.inline
    def setShebang(value: Boolean): Self = this.set("shebang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShebang: Self = this.set("shebang", js.undefined)
    @scala.inline
    def setWebkit(value: Boolean): Self = this.set("webkit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkit: Self = this.set("webkit", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrap_iife(value: Boolean): Self = this.set("wrap_iife", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap_iife: Self = this.set("wrap_iife", js.undefined)
  }
  
}

