package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeConfigurationRegistrationOptions extends StObject {
  
  var section: js.UndefOr[String | js.Array[String]] = js.undefined
}
object DidChangeConfigurationRegistrationOptions {
  
  inline def apply(): DidChangeConfigurationRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidChangeConfigurationRegistrationOptions]
  }
  
  extension [Self <: DidChangeConfigurationRegistrationOptions](x: Self) {
    
    inline def setSection(value: String | js.Array[String]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: String*): Self = StObject.set(x, "section", js.Array(value*))
  }
}
