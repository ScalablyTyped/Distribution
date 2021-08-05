package typings.urlToolkit

import typings.urlToolkit.anon.AlwaysNormalize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-toolkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildAbsoluteURL(baseURL: String, relativeURL: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAbsoluteURL")(baseURL.asInstanceOf[js.Any], relativeURL.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildAbsoluteURL(baseURL: String, relativeURL: String, opts: AlwaysNormalize): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAbsoluteURL")(baseURL.asInstanceOf[js.Any], relativeURL.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def buildURLFromParts(parts: URLParts): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildURLFromParts")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseURL(url: String): URLParts | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(url.asInstanceOf[js.Any]).asInstanceOf[URLParts | Null]
  
  trait URLParts extends StObject {
    
    var fragment: String
    
    var netLoc: String
    
    var params: String
    
    var path: String
    
    var query: String
    
    var scheme: String
  }
  object URLParts {
    
    inline def apply(fragment: String, netLoc: String, params: String, path: String, query: String, scheme: String): URLParts = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], netLoc = netLoc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLParts]
    }
    
    extension [Self <: URLParts](x: Self) {
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setNetLoc(value: String): Self = StObject.set(x, "netLoc", value.asInstanceOf[js.Any])
      
      inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}
