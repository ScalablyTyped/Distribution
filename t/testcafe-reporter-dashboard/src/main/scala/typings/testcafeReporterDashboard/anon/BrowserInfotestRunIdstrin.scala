package typings.testcafeReporterDashboard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined testcafe-reporter-dashboard.testcafe-reporter-dashboard/lib/types/testcafe.BrowserInfo & {  testRunId :string} */
trait BrowserInfotestRunIdstrin extends StObject {
  
  var alias: String
  
  var engine: Version
  
  var headless: Boolean
  
  var name: String
  
  var os: Version
  
  var platform: String
  
  var prettyUserAgent: String
  
  var testRunId: String
  
  var userAgent: String
  
  var version: String
}
object BrowserInfotestRunIdstrin {
  
  inline def apply(
    alias: String,
    engine: Version,
    headless: Boolean,
    name: String,
    os: Version,
    platform: String,
    prettyUserAgent: String,
    testRunId: String,
    userAgent: String,
    version: String
  ): BrowserInfotestRunIdstrin = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], prettyUserAgent = prettyUserAgent.asInstanceOf[js.Any], testRunId = testRunId.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserInfotestRunIdstrin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserInfotestRunIdstrin] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: Version): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOs(value: Version): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPrettyUserAgent(value: String): Self = StObject.set(x, "prettyUserAgent", value.asInstanceOf[js.Any])
    
    inline def setTestRunId(value: String): Self = StObject.set(x, "testRunId", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
