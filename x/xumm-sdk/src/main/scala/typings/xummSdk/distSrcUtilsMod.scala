package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("xumm-sdk/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xumm-sdk/dist/src/utils", "DeferredPromise")
  @js.native
  open class DeferredPromise () extends StObject {
    
    var promise: js.Promise[Any] = js.native
    
    def reject(): js.Promise[Any] = js.native
    def reject(arg: Any): js.Promise[Any] = js.native
    
    /* private */ var rejectFn: Any = js.native
    
    def resolve(): js.Promise[Any] = js.native
    def resolve(arg: Any): js.Promise[Any] = js.native
    
    /* private */ var resolveFn: Any = js.native
  }
  
  inline def throwIfError(call: Any): js.Error | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwIfError")(call.asInstanceOf[js.Any]).asInstanceOf[js.Error | Unit]
  
  trait FatalApiError extends StObject {
    
    var code: Double
    
    var error: Boolean
    
    var message: String
    
    var method: js.UndefOr[String] = js.undefined
    
    var reference: js.UndefOr[String] = js.undefined
    
    var req: js.UndefOr[String] = js.undefined
  }
  object FatalApiError {
    
    inline def apply(code: Double, error: Boolean, message: String): FatalApiError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FatalApiError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FatalApiError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setReq(value: String): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    }
  }
}
