package typings.webdriver.anon

import typings.webdriver.HTTPAgent
import typings.webdriver.HTTPSAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Https extends StObject {
  
  var http: HTTPAgent
  
  var https: HTTPSAgent
}
object Https {
  
  inline def apply(http: HTTPAgent, https: HTTPSAgent): Https = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[Https]
  }
  
  extension [Self <: Https](x: Self) {
    
    inline def setHttp(value: HTTPAgent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttps(value: HTTPSAgent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
  }
}
