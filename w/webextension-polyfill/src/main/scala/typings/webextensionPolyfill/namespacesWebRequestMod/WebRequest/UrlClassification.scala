package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlClassification extends StObject {
  
  /**
    * Classification flags if the request has been classified and it is first party.
    */
  var firstParty: UrlClassificationParty
  
  /**
    * Classification flags if the request has been classified and it or its window hierarchy is third party.
    */
  var thirdParty: UrlClassificationParty
}
object UrlClassification {
  
  inline def apply(firstParty: UrlClassificationParty, thirdParty: UrlClassificationParty): UrlClassification = {
    val __obj = js.Dynamic.literal(firstParty = firstParty.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlClassification]
  }
  
  extension [Self <: UrlClassification](x: Self) {
    
    inline def setFirstParty(value: UrlClassificationParty): Self = StObject.set(x, "firstParty", value.asInstanceOf[js.Any])
    
    inline def setFirstPartyVarargs(value: UrlClassificationFlags*): Self = StObject.set(x, "firstParty", js.Array(value*))
    
    inline def setThirdParty(value: UrlClassificationParty): Self = StObject.set(x, "thirdParty", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyVarargs(value: UrlClassificationFlags*): Self = StObject.set(x, "thirdParty", js.Array(value*))
  }
}
