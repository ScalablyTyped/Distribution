package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** State information for the conversation. To maintain state, include the context from the previous response. */
trait Context
  extends StObject
     with /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  
  /** The unique identifier of the conversation. */
  var conversation_id: js.UndefOr[String] = js.undefined
  
  /** Metadata related to the message. */
  var metadata: js.UndefOr[MessageContextMetadata] = js.undefined
  
  /** For internal use only. */
  var system: js.UndefOr[SystemResponse] = js.undefined
}
object Context {
  
  inline def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setConversation_id(value: String): Self = StObject.set(x, "conversation_id", value.asInstanceOf[js.Any])
    
    inline def setConversation_idUndefined: Self = StObject.set(x, "conversation_id", js.undefined)
    
    inline def setMetadata(value: MessageContextMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSystem(value: SystemResponse): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
