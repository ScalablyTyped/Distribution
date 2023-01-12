package typings.wdioTypes.buildOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnerEnd extends StObject {
  
  var cid: String
  
  var failures: Double
  
  var retries: Double
}
object RunnerEnd {
  
  inline def apply(cid: String, failures: Double, retries: Double): RunnerEnd = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunnerEnd] (val x: Self) extends AnyVal {
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
  }
}
