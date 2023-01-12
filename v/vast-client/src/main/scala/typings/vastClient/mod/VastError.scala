package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastError extends StObject {
  
  /**
    * Whenever an error occurs during the VAST parsing, the parser will call on its own all related tracking error URLs. Reported errors are:
    *      no_ad: The VAST document is empty
    *      VAST error 101: VAST schema validation error.
    *      VAST error 301: Timeout of VAST URI provided in Wrapper element.
    *      VAST error 302: Wrapper limit reached.
    *      VAST error 303: No VAST response after one or more Wrappers.
    */
  var ERRORCODE: String | Double
  
  var ERRORMESSAGE: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.undefined
  
  var system: js.UndefOr[VastSystem | String | Null] = js.undefined
}
object VastError {
  
  inline def apply(ERRORCODE: String | Double): VastError = {
    val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastError] (val x: Self) extends AnyVal {
    
    inline def setERRORCODE(value: String | Double): Self = StObject.set(x, "ERRORCODE", value.asInstanceOf[js.Any])
    
    inline def setERRORMESSAGE(value: String): Self = StObject.set(x, "ERRORMESSAGE", value.asInstanceOf[js.Any])
    
    inline def setERRORMESSAGEUndefined: Self = StObject.set(x, "ERRORMESSAGE", js.undefined)
    
    inline def setExtensions(value: js.Array[VastAdExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: VastAdExtension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setSystem(value: VastSystem | String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemNull: Self = StObject.set(x, "system", null)
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
