package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breaks extends StObject {
  
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
object Breaks {
  
  inline def apply(
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
  
  extension [Self <: Breaks](x: Self) {
    
    inline def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setHighlight(value: js.Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setLangPrefix(value: String): Self = StObject.set(x, "langPrefix", value.asInstanceOf[js.Any])
    
    inline def setLinkify(value: Boolean): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
    
    inline def setMaxNesting(value: Double): Self = StObject.set(x, "maxNesting", value.asInstanceOf[js.Any])
    
    inline def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    inline def setTypographer(value: Boolean): Self = StObject.set(x, "typographer", value.asInstanceOf[js.Any])
    
    inline def setXhtmlOut(value: Boolean): Self = StObject.set(x, "xhtmlOut", value.asInstanceOf[js.Any])
  }
}
