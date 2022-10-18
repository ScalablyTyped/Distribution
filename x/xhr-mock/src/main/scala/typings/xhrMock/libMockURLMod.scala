package typings.xhrMock

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockURLMod {
  
  @JSImport("xhr-mock/lib/MockURL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatURL(url: MockURL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseURL(url: String): MockURL = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(url.asInstanceOf[js.Any]).asInstanceOf[MockURL]
  
  trait MockURL extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object MockURL {
    
    inline def apply(): MockURL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockURL]
    }
    
    extension [Self <: MockURL](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: StringDictionary[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
