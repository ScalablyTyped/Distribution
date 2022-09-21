package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var name: js.UndefOr[String] = js.undefined
}
object MapHTMLAttributes {
  
  inline def apply(): MapHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapHTMLAttributes]
  }
  
  extension [Self <: MapHTMLAttributes](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
