package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WampyOpStatus extends StObject {
  
  var code: Double = js.native
  
  var description: String = js.native
  
  var reqId: js.UndefOr[Double] = js.native
}
object WampyOpStatus {
  
  @scala.inline
  def apply(code: Double, description: String): WampyOpStatus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[WampyOpStatus]
  }
  
  @scala.inline
  implicit class WampyOpStatusMutableBuilder[Self <: WampyOpStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqId(value: Double): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqIdUndefined: Self = StObject.set(x, "reqId", js.undefined)
  }
}
