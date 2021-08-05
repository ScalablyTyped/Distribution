package typings.wordpressBlocks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTML extends StObject {
  
  var HTML: String
}
object HTML {
  
  inline def apply(HTML: String): HTML = {
    val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
  
  extension [Self <: HTML](x: Self) {
    
    inline def setHTML(value: String): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
  }
}
