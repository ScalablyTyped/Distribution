package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuoteHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var cite: js.UndefOr[String] = js.undefined
}
object QuoteHTMLAttributes {
  
  inline def apply(): QuoteHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuoteHTMLAttributes]
  }
  
  extension [Self <: QuoteHTMLAttributes](x: Self) {
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
