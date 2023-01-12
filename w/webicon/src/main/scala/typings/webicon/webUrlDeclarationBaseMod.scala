package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webUrlDeclarationBaseMod {
  
  trait UrlDeclarationBase extends StObject {
    
    /**
      * The `GET`-variables of the url.
      */
    var params: js.UndefOr[Any] = js.undefined
    
    /**
      * The actual url.
      */
    var url: js.UndefOr[Any] = js.undefined
  }
  object UrlDeclarationBase {
    
    inline def apply(): UrlDeclarationBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlDeclarationBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlDeclarationBase] (val x: Self) extends AnyVal {
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
