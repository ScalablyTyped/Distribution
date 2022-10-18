package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.anon.AdditionalPropertiesSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowMessageRequestClientCapabilities extends StObject {
  
  /**
    * Capabilities specific to the `MessageActionItem` type.
    */
  var messageActionItem: js.UndefOr[AdditionalPropertiesSupport] = js.undefined
}
object ShowMessageRequestClientCapabilities {
  
  inline def apply(): ShowMessageRequestClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMessageRequestClientCapabilities]
  }
  
  extension [Self <: ShowMessageRequestClientCapabilities](x: Self) {
    
    inline def setMessageActionItem(value: AdditionalPropertiesSupport): Self = StObject.set(x, "messageActionItem", value.asInstanceOf[js.Any])
    
    inline def setMessageActionItemUndefined: Self = StObject.set(x, "messageActionItem", js.undefined)
  }
}
