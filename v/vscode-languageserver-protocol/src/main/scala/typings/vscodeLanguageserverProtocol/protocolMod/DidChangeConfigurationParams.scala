package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeConfigurationParams extends StObject {
  
  /**
    * The actual changed settings
    */
  var settings: js.Any
}
object DidChangeConfigurationParams {
  
  inline def apply(settings: js.Any): DidChangeConfigurationParams = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeConfigurationParams]
  }
  
  extension [Self <: DidChangeConfigurationParams](x: Self) {
    
    inline def setSettings(value: js.Any): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
