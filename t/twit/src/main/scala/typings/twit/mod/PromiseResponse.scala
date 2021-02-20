package typings.twit.mod

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseResponse extends StObject {
  
  var data: Response = js.native
  
  var resp: IncomingMessage = js.native
}
object PromiseResponse {
  
  @scala.inline
  def apply(data: Response, resp: IncomingMessage): PromiseResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resp = resp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResponse]
  }
  
  @scala.inline
  implicit class PromiseResponseMutableBuilder[Self <: PromiseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Response): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResp(value: IncomingMessage): Self = StObject.set(x, "resp", value.asInstanceOf[js.Any])
  }
}
