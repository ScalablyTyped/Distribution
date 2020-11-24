package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Assistant output to be rendered or processed by the client. */
@js.native
trait MessageOutput extends js.Object {
  
  /** An array of objects describing any actions requested by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  
  /** Additional detailed information about a message response and how it was generated. */
  var debug: js.UndefOr[MessageOutputDebug] = js.native
  
  /** An array of entities identified in the user input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.native
  
  /** Output intended for any channel. It is the responsibility of the client application to implement the supported response types. */
  var generic: js.UndefOr[js.Array[DialogRuntimeResponseGeneric]] = js.native
  
  /** An array of intents recognized in the user input, sorted in descending order of confidence. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.native
  
  /** An object containing any custom properties included in the response. This object includes any arbitrary properties defined in the dialog JSON editor as part of the dialog node output. */
  var user_defined: js.UndefOr[js.Object] = js.native
}
object MessageOutput {
  
  @scala.inline
  def apply(): MessageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOutput]
  }
  
  @scala.inline
  implicit class MessageOutputOps[Self <: MessageOutput] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: DialogNodeAction*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[DialogNodeAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setDebug(value: MessageOutputDebug): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: RuntimeEntity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[RuntimeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setGenericVarargs(value: DialogRuntimeResponseGeneric*): Self = this.set("generic", js.Array(value :_*))
    
    @scala.inline
    def setGeneric(value: js.Array[DialogRuntimeResponseGeneric]): Self = this.set("generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneric: Self = this.set("generic", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: RuntimeIntent*): Self = this.set("intents", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: js.Array[RuntimeIntent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    
    @scala.inline
    def setUser_defined(value: js.Object): Self = this.set("user_defined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_defined: Self = this.set("user_defined", js.undefined)
  }
}
