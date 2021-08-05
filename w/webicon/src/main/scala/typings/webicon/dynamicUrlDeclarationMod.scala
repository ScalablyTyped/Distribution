package typings.webicon

import typings.webicon.staticUrlDeclarationMod.StaticUrlDeclaration
import typings.webicon.urlDeclarationBaseMod.UrlDeclarationBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicUrlDeclarationMod {
  
  trait DynamicUrlDeclaration[T]
    extends StObject
       with UrlDeclarationBase {
    
    /**
      * Either the actual url or a function for generating the url.
      */
    @JSName("url")
    var url_DynamicUrlDeclaration: js.UndefOr[String | (js.Function1[/* args */ T, String | StaticUrlDeclaration])] = js.undefined
  }
  object DynamicUrlDeclaration {
    
    inline def apply[T](): DynamicUrlDeclaration[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicUrlDeclaration[T]]
    }
    
    extension [Self <: DynamicUrlDeclaration[?], T](x: Self & DynamicUrlDeclaration[T]) {
      
      inline def setUrl(value: String | (js.Function1[/* args */ T, String | StaticUrlDeclaration])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction1(value: /* args */ T => String | StaticUrlDeclaration): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
