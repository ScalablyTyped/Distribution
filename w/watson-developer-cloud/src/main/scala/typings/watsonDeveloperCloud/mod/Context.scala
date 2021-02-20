package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** State information for the conversation. To maintain state, include the context from the previous response. */
@js.native
trait Context
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  
  /** The unique identifier of the conversation. */
  var conversation_id: js.UndefOr[String] = js.native
  
  /** Metadata related to the message. */
  var metadata: js.UndefOr[MessageContextMetadata] = js.native
  
  /** For internal use only. */
  var system: js.UndefOr[SystemResponse] = js.native
}
object Context {
  
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversation_id(value: String): Self = StObject.set(x, "conversation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversation_idUndefined: Self = StObject.set(x, "conversation_id", js.undefined)
    
    @scala.inline
    def setMetadata(value: MessageContextMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSystem(value: SystemResponse): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
