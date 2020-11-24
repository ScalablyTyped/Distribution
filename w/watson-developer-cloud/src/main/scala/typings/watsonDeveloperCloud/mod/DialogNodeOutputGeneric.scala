package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogNodeOutputGeneric. */
@js.native
trait DialogNodeOutputGeneric extends js.Object {
  
  /** The delimiter to use as a separator between responses when `selection_policy`=`multiline`. */
  var delimiter: js.UndefOr[String] = js.native
  
  /** An optional description to show with the response. Valid only when **response_type**=`image` or `option`. This string must be no longer than 256 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** An optional message to be sent to the human agent who will be taking over the conversation. Valid only when **reponse_type**=`connect_to_agent`. This string must be no longer than 256 characters. */
  var message_to_human_agent: js.UndefOr[String] = js.native
  
  /** An array of objects describing the options from which the user can choose. You can include up to 20 options. Required when **response_type**=`option`. */
  var options: js.UndefOr[js.Array[DialogNodeOutputOptionsElement]] = js.native
  
  /** The preferred type of control to display, if supported by the channel. Valid only when **response_type**=`option`. */
  var preference: js.UndefOr[String] = js.native
  
  /** The type of response returned by the dialog node. The specified response type must be supported by the client application or channel. */
  var response_type: String = js.native
  
  /** How a response is selected from the list, if more than one response is specified. Valid only when **response_type**=`text`. */
  var selection_policy: js.UndefOr[String] = js.native
  
  /** The URL of the image. Required when **response_type**=`image`. */
  var source: js.UndefOr[String] = js.native
  
  /** How long to pause, in milliseconds. The valid values are from 0 to 10000. Valid only when **response_type**=`pause`. */
  var time: js.UndefOr[Double] = js.native
  
  /** An optional title to show before the response. Valid only when **response_type**=`image` or `option`. This string must be no longer than 512 characters. */
  var title: js.UndefOr[String] = js.native
  
  /** Whether to send a "user is typing" event during the pause. Ignored if the channel does not support this event. Valid only when **response_type**=`pause`. */
  var typing: js.UndefOr[Boolean] = js.native
  
  /** A list of one or more objects defining text responses. Required when **response_type**=`text`. */
  var values: js.UndefOr[js.Array[DialogNodeOutputTextValuesElement]] = js.native
}
object DialogNodeOutputGeneric {
  
  @scala.inline
  def apply(response_type: String): DialogNodeOutputGeneric = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputGeneric]
  }
  
  @scala.inline
  implicit class DialogNodeOutputGenericOps[Self <: DialogNodeOutputGeneric] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
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
    def setSelection_policy(value: String): Self = this.set("selection_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection_policy: Self = this.set("selection_policy", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTyping(value: Boolean): Self = this.set("typing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTyping: Self = this.set("typing", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DialogNodeOutputTextValuesElement*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[DialogNodeOutputTextValuesElement]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
