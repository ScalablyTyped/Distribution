package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.webdriverio.anon.Attempts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult extends StObject {
  
  var duration: Double
  
  var error: js.UndefOr[js.Any] = js.undefined
  
  var passed: Boolean
  
  var result: js.UndefOr[js.Any] = js.undefined
  
  var retries: Attempts
}
object TestResult {
  
  inline def apply(duration: Double, passed: Boolean, retries: Attempts): TestResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  
  extension [Self <: TestResult](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setRetries(value: Attempts): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
  }
}
