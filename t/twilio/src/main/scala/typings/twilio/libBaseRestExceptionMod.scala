package typings.twilio

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseRestExceptionMod {
  
  @JSImport("twilio/lib/base/RestException", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RestException {
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* CompleteClass */
    var details: js.Object = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var moreInfo: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var status: Double = js.native
  }
  
  trait RestException
    extends StObject
       with Error {
    
    var code: Double
    
    var details: js.Object
    
    var moreInfo: String
    
    var status: Double
  }
  object RestException {
    
    inline def apply(code: Double, details: js.Object, message: String, moreInfo: String, name: String, status: Double): RestException = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moreInfo = moreInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestException] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setMoreInfo(value: String): Self = StObject.set(x, "moreInfo", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
