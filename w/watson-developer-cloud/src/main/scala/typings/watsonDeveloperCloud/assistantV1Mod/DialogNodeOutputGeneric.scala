package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNodeOutputGeneric. */
trait DialogNodeOutputGeneric extends StObject {
  
  /** The delimiter to use as a separator between responses when `selection_policy`=`multiline`. */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /** An optional description to show with the response. Valid only when **response_type**=`image` or `option`. This string must be no longer than 256 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** An optional message to be sent to the human agent who will be taking over the conversation. Valid only when **reponse_type**=`connect_to_agent`. This string must be no longer than 256 characters. */
  var message_to_human_agent: js.UndefOr[String] = js.undefined
  
  /** An array of objects describing the options from which the user can choose. You can include up to 20 options. Required when **response_type**=`option`. */
  var options: js.UndefOr[js.Array[DialogNodeOutputOptionsElement]] = js.undefined
  
  /** The preferred type of control to display, if supported by the channel. Valid only when **response_type**=`option`. */
  var preference: js.UndefOr[String] = js.undefined
  
  /** The type of response returned by the dialog node. The specified response type must be supported by the client application or channel. */
  var response_type: String
  
  /** How a response is selected from the list, if more than one response is specified. Valid only when **response_type**=`text`. */
  var selection_policy: js.UndefOr[String] = js.undefined
  
  /** The URL of the image. Required when **response_type**=`image`. */
  var source: js.UndefOr[String] = js.undefined
  
  /** How long to pause, in milliseconds. The valid values are from 0 to 10000. Valid only when **response_type**=`pause`. */
  var time: js.UndefOr[Double] = js.undefined
  
  /** An optional title to show before the response. Valid only when **response_type**=`image` or `option`. This string must be no longer than 512 characters. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Whether to send a "user is typing" event during the pause. Ignored if the channel does not support this event. Valid only when **response_type**=`pause`. */
  var typing: js.UndefOr[Boolean] = js.undefined
  
  /** A list of one or more objects defining text responses. Required when **response_type**=`text`. */
  var values: js.UndefOr[js.Array[DialogNodeOutputTextValuesElement]] = js.undefined
}
object DialogNodeOutputGeneric {
  
  inline def apply(response_type: String): DialogNodeOutputGeneric = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputGeneric]
  }
  
  extension [Self <: DialogNodeOutputGeneric](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
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
    
    inline def setSelection_policy(value: String): Self = StObject.set(x, "selection_policy", value.asInstanceOf[js.Any])
    
    inline def setSelection_policyUndefined: Self = StObject.set(x, "selection_policy", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTyping(value: Boolean): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
    
    inline def setTypingUndefined: Self = StObject.set(x, "typing", js.undefined)
    
    inline def setValues(value: js.Array[DialogNodeOutputTextValuesElement]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: DialogNodeOutputTextValuesElement*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
