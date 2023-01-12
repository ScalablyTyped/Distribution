package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
trait OutputData
  extends StObject
     with /** QueryNoticesResult accepts additional properties. */
/* propName */ StringDictionary[Any] {
  
  /** Output intended for any channel. It is the responsibility of the client application to implement the supported response types. */
  var generic: js.UndefOr[js.Array[DialogRuntimeResponseGeneric]] = js.undefined
  
  /** An array of up to 50 messages logged with the request. */
  var log_messages: js.Array[LogMessage]
  
  /** An array of the nodes that were triggered to create the response, in the order in which they were visited. This information is useful for debugging and for tracing the path taken through the node tree. */
  var nodes_visited: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An array of objects containing detailed diagnostic information about the nodes that were triggered during processing of the input message. Included only if **nodes_visited_details** is set to `true` in the message request. */
  var nodes_visited_details: js.UndefOr[js.Array[DialogNodeVisitedDetails]] = js.undefined
  
  /** An array of responses to the user. */
  var text: js.Array[String]
}
object OutputData {
  
  inline def apply(log_messages: js.Array[LogMessage], text: js.Array[String]): OutputData = {
    val __obj = js.Dynamic.literal(log_messages = log_messages.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputData] (val x: Self) extends AnyVal {
    
    inline def setGeneric(value: js.Array[DialogRuntimeResponseGeneric]): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    inline def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
    
    inline def setGenericVarargs(value: DialogRuntimeResponseGeneric*): Self = StObject.set(x, "generic", js.Array(value*))
    
    inline def setLog_messages(value: js.Array[LogMessage]): Self = StObject.set(x, "log_messages", value.asInstanceOf[js.Any])
    
    inline def setLog_messagesVarargs(value: LogMessage*): Self = StObject.set(x, "log_messages", js.Array(value*))
    
    inline def setNodes_visited(value: js.Array[String]): Self = StObject.set(x, "nodes_visited", value.asInstanceOf[js.Any])
    
    inline def setNodes_visitedUndefined: Self = StObject.set(x, "nodes_visited", js.undefined)
    
    inline def setNodes_visitedVarargs(value: String*): Self = StObject.set(x, "nodes_visited", js.Array(value*))
    
    inline def setNodes_visited_details(value: js.Array[DialogNodeVisitedDetails]): Self = StObject.set(x, "nodes_visited_details", value.asInstanceOf[js.Any])
    
    inline def setNodes_visited_detailsUndefined: Self = StObject.set(x, "nodes_visited_details", js.undefined)
    
    inline def setNodes_visited_detailsVarargs(value: DialogNodeVisitedDetails*): Self = StObject.set(x, "nodes_visited_details", js.Array(value*))
    
    inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
