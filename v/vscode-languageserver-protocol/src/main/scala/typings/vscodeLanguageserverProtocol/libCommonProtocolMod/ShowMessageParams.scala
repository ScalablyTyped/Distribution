package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowMessageParams extends StObject {
  
  /**
    * The actual message.
    */
  var message: String
  
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType
}
object ShowMessageParams {
  
  inline def apply(message: String, `type`: MessageType): ShowMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMessageParams]
  }
  
  extension [Self <: ShowMessageParams](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
