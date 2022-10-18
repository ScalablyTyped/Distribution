package typings.testcafe.mod.global

import typings.testcafe.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browser extends StObject {
  
  /**
    * The browser alias string specified when tests were launched.
    */
  var alias: String
  
  /**
    * The name and version of the browser engine.
    */
  var engine: Name
  
  /**
    * `true` if the browser runs in headless mode.
    */
  var headless: Boolean
  
  /**
    * The browser name.
    */
  var name: String
  
  /**
    * The name and version of the operating system.
    */
  var os: Name
  
  /**
    * The platform type.
    */
  var platform: String
  
  /**
    * Formatted string with the browser's and operating system's name and version.
    */
  var prettyUserAgent: String
  
  /**
    * The user agent string.
    */
  var userAgent: String
  
  /**
    * The browser version.
    */
  var version: String
}
object Browser {
  
  inline def apply(
    alias: String,
    engine: Name,
    headless: Boolean,
    name: String,
    os: Name,
    platform: String,
    prettyUserAgent: String,
    userAgent: String,
    version: String
  ): Browser = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], prettyUserAgent = prettyUserAgent.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  
  extension [Self <: Browser](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: Name): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOs(value: Name): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPrettyUserAgent(value: String): Self = StObject.set(x, "prettyUserAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
