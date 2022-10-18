package typings.wdioTypes.buildOptionsMod

import typings.std.Record
import typings.wdioTypes.buildCapabilitiesMod.Capabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnerStart extends StObject {
  
  var capabilities: Capabilities
  
  var cid: String
  
  var config: Testrunner
  
  var failures: js.UndefOr[Double] = js.undefined
  
  var instanceOptions: Record[String, WebdriverIO]
  
  var isMultiremote: Boolean
  
  var retries: js.UndefOr[Double] = js.undefined
  
  var retry: js.UndefOr[Double] = js.undefined
  
  var sessionId: String
  
  var specs: js.Array[String]
}
object RunnerStart {
  
  inline def apply(
    capabilities: Capabilities,
    cid: String,
    config: Testrunner,
    instanceOptions: Record[String, WebdriverIO],
    isMultiremote: Boolean,
    sessionId: String,
    specs: js.Array[String]
  ): RunnerStart = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], instanceOptions = instanceOptions.asInstanceOf[js.Any], isMultiremote = isMultiremote.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerStart]
  }
  
  extension [Self <: RunnerStart](x: Self) {
    
    inline def setCapabilities(value: Capabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Testrunner): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setInstanceOptions(value: Record[String, WebdriverIO]): Self = StObject.set(x, "instanceOptions", value.asInstanceOf[js.Any])
    
    inline def setIsMultiremote(value: Boolean): Self = StObject.set(x, "isMultiremote", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value*))
  }
}
