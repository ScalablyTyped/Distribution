package typings.testcafeReporterDashboard.testcafeMod

import typings.testcafeReporterDashboard.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserInfo extends StObject {
  
  var alias: String
  
  var engine: Version
  
  var headless: Boolean
  
  var name: String
  
  var os: Version
  
  var platform: String
  
  var prettyUserAgent: String
  
  var userAgent: String
  
  var version: String
}
object BrowserInfo {
  
  inline def apply(
    alias: String,
    engine: Version,
    headless: Boolean,
    name: String,
    os: Version,
    platform: String,
    prettyUserAgent: String,
    userAgent: String,
    version: String
  ): BrowserInfo = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], prettyUserAgent = prettyUserAgent.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserInfo]
  }
  
  extension [Self <: BrowserInfo](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: Version): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOs(value: Version): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPrettyUserAgent(value: String): Self = StObject.set(x, "prettyUserAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
