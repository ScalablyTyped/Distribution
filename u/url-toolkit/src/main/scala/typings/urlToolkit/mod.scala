package typings.urlToolkit

import typings.urlToolkit.anon.AlwaysNormalize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-toolkit", "buildAbsoluteURL")
  @js.native
  def buildAbsoluteURL(baseURL: String, relativeURL: String): String = js.native
  @JSImport("url-toolkit", "buildAbsoluteURL")
  @js.native
  def buildAbsoluteURL(baseURL: String, relativeURL: String, opts: AlwaysNormalize): String = js.native
  
  @JSImport("url-toolkit", "buildURLFromParts")
  @js.native
  def buildURLFromParts(parts: URLParts): String = js.native
  
  @JSImport("url-toolkit", "normalizePath")
  @js.native
  def normalizePath(path: String): String = js.native
  
  @JSImport("url-toolkit", "parseURL")
  @js.native
  def parseURL(url: String): URLParts | Null = js.native
  
  @js.native
  trait URLParts extends StObject {
    
    var fragment: String = js.native
    
    var netLoc: String = js.native
    
    var params: String = js.native
    
    var path: String = js.native
    
    var query: String = js.native
    
    var scheme: String = js.native
  }
  object URLParts {
    
    @scala.inline
    def apply(fragment: String, netLoc: String, params: String, path: String, query: String, scheme: String): URLParts = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], netLoc = netLoc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLParts]
    }
    
    @scala.inline
    implicit class URLPartsMutableBuilder[Self <: URLParts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetLoc(value: String): Self = StObject.set(x, "netLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}
