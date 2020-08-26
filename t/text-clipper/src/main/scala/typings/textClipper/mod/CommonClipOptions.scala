package typings.textClipper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonClipOptions extends js.Object {
  /**
    * By default, we try to break only at word boundaries. Set to true if this is undesired.
    */
  var breakWords: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` if the string is HTML-encoded. If so, this method will take extra care to make
    * sure the HTML-encoding is correctly maintained.
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * The string to insert to indicate clipping. Default: "…".
    */
  var indicator: js.UndefOr[String] = js.native
  /**
    * Maximum amount of lines allowed. If given, the string will be clipped either at the moment
    * the maximum amount of characters is exceeded or the moment maxLines newlines are discovered,
    * whichever comes first.
    */
  var maxLines: js.UndefOr[Double] = js.native
}

object CommonClipOptions {
  @scala.inline
  def apply(): CommonClipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonClipOptions]
  }
  @scala.inline
  implicit class CommonClipOptionsOps[Self <: CommonClipOptions] (val x: Self) extends AnyVal {
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
    def setBreakWords(value: Boolean): Self = this.set("breakWords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakWords: Self = this.set("breakWords", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setIndicator(value: String): Self = this.set("indicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
  }
  
}

