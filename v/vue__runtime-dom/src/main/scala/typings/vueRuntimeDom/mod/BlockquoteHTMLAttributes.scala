package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockquoteHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var cite: js.UndefOr[String] = js.undefined
}
object BlockquoteHTMLAttributes {
  
  inline def apply(): BlockquoteHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockquoteHTMLAttributes]
  }
  
  extension [Self <: BlockquoteHTMLAttributes](x: Self) {
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
