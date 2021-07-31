package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlDeclarationBaseMod {
  
  trait UrlDeclarationBase extends StObject {
    
    /**
      * The `GET`-variables of the url.
      */
    var params: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The actual url.
      */
    var url: js.UndefOr[js.Any] = js.undefined
  }
  object UrlDeclarationBase {
    
    @scala.inline
    def apply(): UrlDeclarationBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlDeclarationBase]
    }
    
    @scala.inline
    implicit class UrlDeclarationBaseMutableBuilder[Self <: UrlDeclarationBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
