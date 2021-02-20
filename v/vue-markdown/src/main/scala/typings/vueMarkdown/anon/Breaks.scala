package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breaks extends StObject {
  
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
  implicit class BreaksMutableBuilder[Self <: Breaks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: js.Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangPrefix(value: String): Self = StObject.set(x, "langPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkify(value: Boolean): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNesting(value: Double): Self = StObject.set(x, "maxNesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypographer(value: Boolean): Self = StObject.set(x, "typographer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhtmlOut(value: Boolean): Self = StObject.set(x, "xhtmlOut", value.asInstanceOf[js.Any])
  }
}
