package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseUrl extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object BaseUrl {
    
    @scala.inline
    def apply(): BaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit class BaseUrlMutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
