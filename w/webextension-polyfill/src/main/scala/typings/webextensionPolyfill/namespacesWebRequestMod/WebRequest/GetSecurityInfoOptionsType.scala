package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityInfoOptionsType extends StObject {
  
  /**
    * Include the entire certificate chain.
    * Optional.
    */
  var certificateChain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include raw certificate data for processing by the extension.
    * Optional.
    */
  var rawDER: js.UndefOr[Boolean] = js.undefined
}
object GetSecurityInfoOptionsType {
  
  inline def apply(): GetSecurityInfoOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityInfoOptionsType]
  }
  
  extension [Self <: GetSecurityInfoOptionsType](x: Self) {
    
    inline def setCertificateChain(value: Boolean): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
    
    inline def setRawDER(value: Boolean): Self = StObject.set(x, "rawDER", value.asInstanceOf[js.Any])
    
    inline def setRawDERUndefined: Self = StObject.set(x, "rawDER", js.undefined)
  }
}
