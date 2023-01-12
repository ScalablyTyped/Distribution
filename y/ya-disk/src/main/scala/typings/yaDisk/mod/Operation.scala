package typings.yaDisk.mod

import typings.yaDisk.yaDiskStrings.`in-progress`
import typings.yaDisk.yaDiskStrings.failed
import typings.yaDisk.yaDiskStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  var status: success | failed | `in-progress`
}
object Operation {
  
  inline def apply(status: success | failed | `in-progress`): Operation = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: success | failed | `in-progress`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
