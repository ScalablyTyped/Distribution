package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateIntent` operation. */
@js.native
trait UpdateIntentParams extends js.Object {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The intent name. */
  var intent: String = js.native
  
  /** The description of the intent. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.native
  
  /** An array of user input examples for the intent. */
  var new_examples: js.UndefOr[js.Array[Example]] = js.native
  
  /** The name of the intent. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 128 characters. */
  var new_intent: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object UpdateIntentParams {
  
  @scala.inline
  def apply(intent: String, workspace_id: String): UpdateIntentParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIntentParams]
  }
  
  @scala.inline
  implicit class UpdateIntentParamsOps[Self <: UpdateIntentParams] (val x: Self) extends AnyVal {
    
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
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setNew_description(value: String): Self = this.set("new_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_description: Self = this.set("new_description", js.undefined)
    
    @scala.inline
    def setNew_examplesVarargs(value: Example*): Self = this.set("new_examples", js.Array(value :_*))
    
    @scala.inline
    def setNew_examples(value: js.Array[Example]): Self = this.set("new_examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_examples: Self = this.set("new_examples", js.undefined)
    
    @scala.inline
    def setNew_intent(value: String): Self = this.set("new_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_intent: Self = this.set("new_intent", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}
