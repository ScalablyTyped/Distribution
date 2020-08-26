package typings.urlPattern.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlPatternOptions extends js.Object {
  var escapeChar: js.UndefOr[String] = js.native
  var optionalSegmentEndChar: js.UndefOr[String] = js.native
  var optionalSegmentStartChar: js.UndefOr[String] = js.native
  var segmentNameCharset: js.UndefOr[String] = js.native
  var segmentNameStartChar: js.UndefOr[String] = js.native
  var segmentValueCharset: js.UndefOr[String] = js.native
  var wildcardChar: js.UndefOr[String] = js.native
}

object UrlPatternOptions {
  @scala.inline
  def apply(): UrlPatternOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlPatternOptions]
  }
  @scala.inline
  implicit class UrlPatternOptionsOps[Self <: UrlPatternOptions] (val x: Self) extends AnyVal {
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
    def setEscapeChar(value: String): Self = this.set("escapeChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeChar: Self = this.set("escapeChar", js.undefined)
    @scala.inline
    def setOptionalSegmentEndChar(value: String): Self = this.set("optionalSegmentEndChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalSegmentEndChar: Self = this.set("optionalSegmentEndChar", js.undefined)
    @scala.inline
    def setOptionalSegmentStartChar(value: String): Self = this.set("optionalSegmentStartChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalSegmentStartChar: Self = this.set("optionalSegmentStartChar", js.undefined)
    @scala.inline
    def setSegmentNameCharset(value: String): Self = this.set("segmentNameCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentNameCharset: Self = this.set("segmentNameCharset", js.undefined)
    @scala.inline
    def setSegmentNameStartChar(value: String): Self = this.set("segmentNameStartChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentNameStartChar: Self = this.set("segmentNameStartChar", js.undefined)
    @scala.inline
    def setSegmentValueCharset(value: String): Self = this.set("segmentValueCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentValueCharset: Self = this.set("segmentValueCharset", js.undefined)
    @scala.inline
    def setWildcardChar(value: String): Self = this.set("wildcardChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWildcardChar: Self = this.set("wildcardChar", js.undefined)
  }
  
}

