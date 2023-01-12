package typings.turistFetch

import typings.nodeFetch.mod.Response
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFetchRetryErrorMod {
  
  @JSImport("@turist/fetch/dist/fetch-retry-error", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FetchRetryError {
    def this(res: Response) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var res: Response = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
    
    /* CompleteClass */
    var url: String = js.native
  }
  
  trait FetchRetryError
    extends StObject
       with Error {
    
    var res: Response
    
    var statusCode: Double
    
    var url: String
  }
  object FetchRetryError {
    
    inline def apply(message: String, name: String, res: Response, statusCode: Double, url: String): FetchRetryError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchRetryError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchRetryError] (val x: Self) extends AnyVal {
      
      inline def setRes(value: Response): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
