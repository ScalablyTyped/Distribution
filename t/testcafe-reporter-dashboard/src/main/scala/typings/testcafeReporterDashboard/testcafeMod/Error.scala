package typings.testcafeReporterDashboard.testcafeMod

import typings.testcafeReporterDashboard.anon.CallsiteFrameIdx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var apiFnChain: js.UndefOr[js.Array[String]] = js.undefined
  
  var apiFnIndex: js.UndefOr[Double] = js.undefined
  
  var callsite: CallsiteFrameIdx
  
  var code: String
  
  var errMsg: String
  
  var isTestCafeError: Boolean
  
  var screenshotPath: String
  
  var testRunId: String
  
  var testRunPhase: String
  
  var userAgent: String
}
object Error {
  
  inline def apply(
    callsite: CallsiteFrameIdx,
    code: String,
    errMsg: String,
    isTestCafeError: Boolean,
    screenshotPath: String,
    testRunId: String,
    testRunPhase: String,
    userAgent: String
  ): Error = {
    val __obj = js.Dynamic.literal(callsite = callsite.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], isTestCafeError = isTestCafeError.asInstanceOf[js.Any], screenshotPath = screenshotPath.asInstanceOf[js.Any], testRunId = testRunId.asInstanceOf[js.Any], testRunPhase = testRunPhase.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setApiFnChain(value: js.Array[String]): Self = StObject.set(x, "apiFnChain", value.asInstanceOf[js.Any])
    
    inline def setApiFnChainUndefined: Self = StObject.set(x, "apiFnChain", js.undefined)
    
    inline def setApiFnChainVarargs(value: String*): Self = StObject.set(x, "apiFnChain", js.Array(value*))
    
    inline def setApiFnIndex(value: Double): Self = StObject.set(x, "apiFnIndex", value.asInstanceOf[js.Any])
    
    inline def setApiFnIndexUndefined: Self = StObject.set(x, "apiFnIndex", js.undefined)
    
    inline def setCallsite(value: CallsiteFrameIdx): Self = StObject.set(x, "callsite", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setIsTestCafeError(value: Boolean): Self = StObject.set(x, "isTestCafeError", value.asInstanceOf[js.Any])
    
    inline def setScreenshotPath(value: String): Self = StObject.set(x, "screenshotPath", value.asInstanceOf[js.Any])
    
    inline def setTestRunId(value: String): Self = StObject.set(x, "testRunId", value.asInstanceOf[js.Any])
    
    inline def setTestRunPhase(value: String): Self = StObject.set(x, "testRunPhase", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
