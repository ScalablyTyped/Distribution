package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  def get(args: js.Any): Promise[js.Any]
  def get(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def get(callback: RequestCallback): Promise[js.Any]
  @JSName("get")
  var get_Original: RestMethod
}
object Resource {
  
  inline def apply(get: RestMethod): Resource = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setGet(value: RestMethod): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
