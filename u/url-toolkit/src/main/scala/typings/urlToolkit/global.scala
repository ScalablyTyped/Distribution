package typings.urlToolkit

import typings.urlToolkit.anon.AlwaysNormalize
import typings.urlToolkit.mod.URLParts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object URLToolkit {
    
    @JSGlobal("URLToolkit")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildAbsoluteURL(baseURL: String, relativeURL: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAbsoluteURL")(baseURL.asInstanceOf[js.Any], relativeURL.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def buildAbsoluteURL(baseURL: String, relativeURL: String, opts: AlwaysNormalize): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAbsoluteURL")(baseURL.asInstanceOf[js.Any], relativeURL.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def buildURLFromParts(parts: URLParts): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildURLFromParts")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parseURL(url: String): URLParts | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(url.asInstanceOf[js.Any]).asInstanceOf[URLParts | Null]
  }
}
