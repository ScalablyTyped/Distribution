package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeConfigurationParams extends StObject {
  
  /**
    * The actual changed settings
    */
  var settings: LSPAny
}
object DidChangeConfigurationParams {
  
  inline def apply(settings: LSPAny): DidChangeConfigurationParams = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeConfigurationParams]
  }
  
  extension [Self <: DidChangeConfigurationParams](x: Self) {
    
    inline def setSettings(value: LSPAny): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
