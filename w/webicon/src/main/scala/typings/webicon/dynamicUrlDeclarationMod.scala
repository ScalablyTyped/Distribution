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
    
    @scala.inline
    def apply[T](): DynamicUrlDeclaration[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicUrlDeclaration[T]]
    }
    
    @scala.inline
    implicit class DynamicUrlDeclarationMutableBuilder[Self <: DynamicUrlDeclaration[?], T] (val x: Self & DynamicUrlDeclaration[T]) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String | (js.Function1[/* args */ T, String | StaticUrlDeclaration])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlFunction1(value: /* args */ T => String | StaticUrlDeclaration): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
