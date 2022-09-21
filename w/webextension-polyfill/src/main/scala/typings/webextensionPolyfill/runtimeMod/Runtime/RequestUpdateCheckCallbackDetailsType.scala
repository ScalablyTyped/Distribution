package typings.webextensionPolyfill.runtimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If an update is available, this contains more information about the available update.
  */
trait RequestUpdateCheckCallbackDetailsType extends StObject {
  
  /**
    * The version of the available update.
    */
  var version: String
}
object RequestUpdateCheckCallbackDetailsType {
  
  inline def apply(version: String): RequestUpdateCheckCallbackDetailsType = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUpdateCheckCallbackDetailsType]
  }
  
  extension [Self <: RequestUpdateCheckCallbackDetailsType](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
