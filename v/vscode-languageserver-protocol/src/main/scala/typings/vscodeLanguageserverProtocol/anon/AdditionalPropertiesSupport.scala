package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalPropertiesSupport extends StObject {
  
  /**
    * Whether the client supports additional attributes which
    * are preserved and send back to the server in the
    * request's response.
    */
  var additionalPropertiesSupport: js.UndefOr[Boolean] = js.undefined
}
object AdditionalPropertiesSupport {
  
  inline def apply(): AdditionalPropertiesSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalPropertiesSupport]
  }
  
  extension [Self <: AdditionalPropertiesSupport](x: Self) {
    
    inline def setAdditionalPropertiesSupport(value: Boolean): Self = StObject.set(x, "additionalPropertiesSupport", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesSupportUndefined: Self = StObject.set(x, "additionalPropertiesSupport", js.undefined)
  }
}
