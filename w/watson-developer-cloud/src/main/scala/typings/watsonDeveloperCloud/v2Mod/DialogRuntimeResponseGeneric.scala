package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogRuntimeResponseGeneric. */
@js.native
trait DialogRuntimeResponseGeneric extends js.Object {
  
  /** The description to show with the the response. */
  var description: js.UndefOr[String] = js.native
  
  /** A message to be sent to the human agent who will be taking over the conversation. */
  var message_to_human_agent: js.UndefOr[String] = js.native
  
  /** An array of objects describing the options from which the user can choose. */
  var options: js.UndefOr[js.Array[DialogNodeOutputOptionsElement]] = js.native
  
  /** The preferred type of control to display. */
  var preference: js.UndefOr[String] = js.native
  
  /** The type of response returned by the dialog node. The specified response type must be supported by the client application or channel. **Note:** The **suggestion** response type is part of the disambiguation feature, which is only available for Premium users. */
  var response_type: String = js.native
  
  /** The URL of the image. */
  var source: js.UndefOr[String] = js.native
  
  /** An array of objects describing the possible matching dialog nodes from which the user can choose. **Note:** The **suggestions** property is part of the disambiguation feature, which is only available for Premium users. */
  var suggestions: js.UndefOr[js.Array[DialogSuggestion]] = js.native
  
  /** The text of the response. */
  var text: js.UndefOr[String] = js.native
  
  /** How long to pause, in milliseconds. */
  var time: js.UndefOr[Double] = js.native
  
  /** The title or introductory text to show before the response. */
  var title: js.UndefOr[String] = js.native
  
  /** A label identifying the topic of the conversation, derived from the **user_label** property of the relevant node. */
  var topic: js.UndefOr[String] = js.native
  
  /** Whether to send a "user is typing" event during the pause. */
  var typing: js.UndefOr[Boolean] = js.native
}
object DialogRuntimeResponseGeneric {
  
  @scala.inline
  def apply(response_type: String): DialogRuntimeResponseGeneric = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogRuntimeResponseGeneric]
  }
  
  @scala.inline
  implicit class DialogRuntimeResponseGenericOps[Self <: DialogRuntimeResponseGeneric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMessage_to_human_agent(value: String): Self = this.set("message_to_human_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage_to_human_agent: Self = this.set("message_to_human_agent", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: DialogNodeOutputOptionsElement*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[DialogNodeOutputOptionsElement]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: DialogSuggestion*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[DialogSuggestion]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    
    @scala.inline
    def setTyping(value: Boolean): Self = this.set("typing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTyping: Self = this.set("typing", js.undefined)
  }
}
