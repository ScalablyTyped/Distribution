package typings.twilio

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseRestExceptionMod {
  
  @JSImport("twilio/lib/base/RestException", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RestException {
    def this(response: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var status: Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.libBaseRestExceptionMod.RestExceptionError because var conflicts: message. Inlined status, code, moreInfo, details */ trait RestException
    extends StObject
       with Error {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var details: js.UndefOr[js.Object] = js.undefined
    
    var moreInfo: js.UndefOr[String] = js.undefined
    
    var status: Double
  }
  object RestException {
    
    inline def apply(message: String, name: String, status: Double): RestException = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestException] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setMoreInfo(value: String): Self = StObject.set(x, "moreInfo", value.asInstanceOf[js.Any])
      
      inline def setMoreInfoUndefined: Self = StObject.set(x, "moreInfo", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestExceptionError extends StObject {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var details: js.UndefOr[js.Object] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var moreInfo: js.UndefOr[String] = js.undefined
    
    var status: Double
  }
  object RestExceptionError {
    
    inline def apply(status: Double): RestExceptionError = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestExceptionError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestExceptionError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetails(value: js.Object): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMoreInfo(value: String): Self = StObject.set(x, "moreInfo", value.asInstanceOf[js.Any])
      
      inline def setMoreInfoUndefined: Self = StObject.set(x, "moreInfo", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
