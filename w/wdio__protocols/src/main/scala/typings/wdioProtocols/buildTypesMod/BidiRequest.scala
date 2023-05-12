package typings.wdioProtocols.buildTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BidiRequest extends StObject {
  
  var method: SupportedMethods
  
  /**
    * types will be more defined later
    */
  var params: Record[String, Any]
}
object BidiRequest {
  
  inline def apply(method: SupportedMethods, params: Record[String, Any]): BidiRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidiRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BidiRequest] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: SupportedMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
