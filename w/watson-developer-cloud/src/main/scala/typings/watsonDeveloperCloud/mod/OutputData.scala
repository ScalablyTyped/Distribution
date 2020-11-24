package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An output object that includes the response to the user, the dialog nodes that were triggered, and messages from the log. */
@js.native
trait OutputData
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  
  /** Output intended for any channel. It is the responsibility of the client application to implement the supported response types. */
  var generic: js.UndefOr[js.Array[DialogRuntimeResponseGeneric]] = js.native
  
  /** An array of up to 50 messages logged with the request. */
  var log_messages: js.Array[LogMessage] = js.native
  
  /** An array of the nodes that were triggered to create the response, in the order in which they were visited. This information is useful for debugging and for tracing the path taken through the node tree. */
  var nodes_visited: js.UndefOr[js.Array[String]] = js.native
  
  /** An array of objects containing detailed diagnostic information about the nodes that were triggered during processing of the input message. Included only if **nodes_visited_details** is set to `true` in the message request. */
  var nodes_visited_details: js.UndefOr[js.Array[DialogNodeVisitedDetails]] = js.native
  
  /** An array of responses to the user. */
  var text: js.Array[String] = js.native
}
object OutputData {
  
  @scala.inline
  def apply(log_messages: js.Array[LogMessage], text: js.Array[String]): OutputData = {
    val __obj = js.Dynamic.literal(log_messages = log_messages.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputData]
  }
  
  @scala.inline
  implicit class OutputDataOps[Self <: OutputData] (val x: Self) extends AnyVal {
    
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
    def setLog_messagesVarargs(value: LogMessage*): Self = this.set("log_messages", js.Array(value :_*))
    
    @scala.inline
    def setLog_messages(value: js.Array[LogMessage]): Self = this.set("log_messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericVarargs(value: DialogRuntimeResponseGeneric*): Self = this.set("generic", js.Array(value :_*))
    
    @scala.inline
    def setGeneric(value: js.Array[DialogRuntimeResponseGeneric]): Self = this.set("generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneric: Self = this.set("generic", js.undefined)
    
    @scala.inline
    def setNodes_visitedVarargs(value: String*): Self = this.set("nodes_visited", js.Array(value :_*))
    
    @scala.inline
    def setNodes_visited(value: js.Array[String]): Self = this.set("nodes_visited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes_visited: Self = this.set("nodes_visited", js.undefined)
    
    @scala.inline
    def setNodes_visited_detailsVarargs(value: DialogNodeVisitedDetails*): Self = this.set("nodes_visited_details", js.Array(value :_*))
    
    @scala.inline
    def setNodes_visited_details(value: js.Array[DialogNodeVisitedDetails]): Self = this.set("nodes_visited_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes_visited_details: Self = this.set("nodes_visited_details", js.undefined)
  }
}
