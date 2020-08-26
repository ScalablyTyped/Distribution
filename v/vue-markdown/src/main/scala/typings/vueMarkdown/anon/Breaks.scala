package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breaks extends js.Object {
  var breaks: Boolean = js.native
  var highlight: js.Any = js.native
  var html: Boolean = js.native
  var langPrefix: String = js.native
  var linkify: Boolean = js.native
  var maxNesting: Double = js.native
  var quotes: String = js.native
  var typographer: Boolean = js.native
  var xhtmlOut: Boolean = js.native
}

object Breaks {
  @scala.inline
  def apply(
    breaks: Boolean,
    highlight: js.Any,
    html: Boolean,
    langPrefix: String,
    linkify: Boolean,
    maxNesting: Double,
    quotes: String,
    typographer: Boolean,
    xhtmlOut: Boolean
  ): Breaks = {
    val __obj = js.Dynamic.literal(breaks = breaks.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], langPrefix = langPrefix.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], maxNesting = maxNesting.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], typographer = typographer.asInstanceOf[js.Any], xhtmlOut = xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breaks]
  }
  @scala.inline
  implicit class BreaksOps[Self <: Breaks] (val x: Self) extends AnyVal {
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
    def setBreaks(value: Boolean): Self = this.set("breaks", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlight(value: js.Any): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setLangPrefix(value: String): Self = this.set("langPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkify(value: Boolean): Self = this.set("linkify", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxNesting(value: Double): Self = this.set("maxNesting", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotes(value: String): Self = this.set("quotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypographer(value: Boolean): Self = this.set("typographer", value.asInstanceOf[js.Any])
    @scala.inline
    def setXhtmlOut(value: Boolean): Self = this.set("xhtmlOut", value.asInstanceOf[js.Any])
  }
  
}

