package typings.vueDashMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Breaks extends js.Object {
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

object Anon_Breaks {
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
  ): Anon_Breaks = {
    val __obj = js.Dynamic.literal(breaks = breaks, highlight = highlight, html = html, langPrefix = langPrefix, linkify = linkify, maxNesting = maxNesting, quotes = quotes, typographer = typographer, xhtmlOut = xhtmlOut)
  
    __obj.asInstanceOf[Anon_Breaks]
  }
}

