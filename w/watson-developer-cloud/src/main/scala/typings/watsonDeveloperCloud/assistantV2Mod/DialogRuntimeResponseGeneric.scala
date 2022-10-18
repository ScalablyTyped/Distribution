package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogRuntimeResponseGeneric. */
trait DialogRuntimeResponseGeneric extends StObject {
  
  /** The description to show with the the response. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A message to be sent to the human agent who will be taking over the conversation. */
  var message_to_human_agent: js.UndefOr[String] = js.undefined
  
  /** An array of objects describing the options from which the user can choose. */
  var options: js.UndefOr[js.Array[DialogNodeOutputOptionsElement]] = js.undefined
  
  /** The preferred type of control to display. */
  var preference: js.UndefOr[String] = js.undefined
  
  /** The type of response returned by the dialog node. The specified response type must be supported by the client application or channel. **Note:** The **suggestion** response type is part of the disambiguation feature, which is only available for Premium users. */
  var response_type: String
  
  /** The URL of the image. */
  var source: js.UndefOr[String] = js.undefined
  
  /** An array of objects describing the possible matching dialog nodes from which the user can choose. **Note:** The **suggestions** property is part of the disambiguation feature, which is only available for Premium users. */
  var suggestions: js.UndefOr[js.Array[DialogSuggestion]] = js.undefined
  
  /** The text of the response. */
  var text: js.UndefOr[String] = js.undefined
  
  /** How long to pause, in milliseconds. */
  var time: js.UndefOr[Double] = js.undefined
  
  /** The title or introductory text to show before the response. */
  var title: js.UndefOr[String] = js.undefined
  
  /** A label identifying the topic of the conversation, derived from the **user_label** property of the relevant node. */
  var topic: js.UndefOr[String] = js.undefined
  
  /** Whether to send a "user is typing" event during the pause. */
  var typing: js.UndefOr[Boolean] = js.undefined
}
object DialogRuntimeResponseGeneric {
  
  inline def apply(response_type: String): DialogRuntimeResponseGeneric = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogRuntimeResponseGeneric]
  }
  
  extension [Self <: DialogRuntimeResponseGeneric](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMessage_to_human_agent(value: String): Self = StObject.set(x, "message_to_human_agent", value.asInstanceOf[js.Any])
    
    inline def setMessage_to_human_agentUndefined: Self = StObject.set(x, "message_to_human_agent", js.undefined)
    
    inline def setOptions(value: js.Array[DialogNodeOutputOptionsElement]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: DialogNodeOutputOptionsElement*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSuggestions(value: js.Array[DialogSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: DialogSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTyping(value: Boolean): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
    
    inline def setTypingUndefined: Self = StObject.set(x, "typing", js.undefined)
  }
}
