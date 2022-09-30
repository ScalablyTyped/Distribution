package typings.wdioTypes.anon

import typings.wdioTypes.wdioTypesStrings.AMBIGUOUS
import typings.wdioTypes.wdioTypesStrings.FAILED
import typings.wdioTypes.wdioTypesStrings.PASSED
import typings.wdioTypes.wdioTypesStrings.PENDING
import typings.wdioTypes.wdioTypesStrings.SKIPPED
import typings.wdioTypes.wdioTypesStrings.UNDEFINED
import typings.wdioTypes.wdioTypesStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Nanos
  
  var message: js.UndefOr[String] = js.undefined
  
  var status: UNKNOWN | PASSED | SKIPPED | PENDING | UNDEFINED | AMBIGUOUS | FAILED
  
  var willBeRetried: Boolean
}
object Duration {
  
  inline def apply(
    duration: Nanos,
    status: UNKNOWN | PASSED | SKIPPED | PENDING | UNDEFINED | AMBIGUOUS | FAILED,
    willBeRetried: Boolean
  ): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], willBeRetried = willBeRetried.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Nanos): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatus(value: UNKNOWN | PASSED | SKIPPED | PENDING | UNDEFINED | AMBIGUOUS | FAILED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setWillBeRetried(value: Boolean): Self = StObject.set(x, "willBeRetried", value.asInstanceOf[js.Any])
  }
}
