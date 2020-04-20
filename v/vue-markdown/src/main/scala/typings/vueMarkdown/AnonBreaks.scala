package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreaks extends js.Object {
  var breaks: Boolean
  var highlight: js.Any
  var html: Boolean
  var langPrefix: String
  var linkify: Boolean
  var maxNesting: Double
  var quotes: String
  var typographer: Boolean
  var xhtmlOut: Boolean
}

object AnonBreaks {
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
  ): AnonBreaks = {
    val __obj = js.Dynamic.literal(breaks = breaks.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], langPrefix = langPrefix.asInstanceOf[js.Any], linkify = linkify.asInstanceOf[js.Any], maxNesting = maxNesting.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], typographer = typographer.asInstanceOf[js.Any], xhtmlOut = xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBreaks]
  }
}

