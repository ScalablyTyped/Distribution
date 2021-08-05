package typings.vigourUa

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns an object representing the user agent including data such as browser, device and platform
    * @param _ua the raw user agent string to be converted
    * @param obj object to be merged to the output result
    * @returns object representing your user agent
    */
  inline def apply(_ua: String): UserAgent = ^.asInstanceOf[js.Dynamic].apply(_ua.asInstanceOf[js.Any]).asInstanceOf[UserAgent]
  /**
    * Returns an object representing the user agent including data such as browser, device and platform
    * @param _ua the raw user agent string to be converted
    * @returns object representing your user agent
    */
  inline def apply[T /* <: js.Object */](_ua: String, obj: T): UserAgent & T = (^.asInstanceOf[js.Dynamic].apply(_ua.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[UserAgent & T]
  
  @JSImport("vigour-ua", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait UserAgent
    extends StObject
       with /* value */ StringDictionary[String | Double] {
    
    var browser: String
    
    var prefix: String
    
    var version: Double
  }
  object UserAgent {
    
    inline def apply(browser: String, prefix: String, version: Double): UserAgent = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent]
    }
    
    extension [Self <: UserAgent](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
