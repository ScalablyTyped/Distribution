package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateIntent` operation. */
trait UpdateIntentParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The intent name. */
  var intent: String
  
  /** The description of the intent. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.undefined
  
  /** An array of user input examples for the intent. */
  var new_examples: js.UndefOr[js.Array[Example]] = js.undefined
  
  /** The name of the intent. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 128 characters. */
  var new_intent: js.UndefOr[String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object UpdateIntentParams {
  
  @scala.inline
  def apply(intent: String, workspace_id: String): UpdateIntentParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIntentParams]
  }
  
  @scala.inline
  implicit class UpdateIntentParamsMutableBuilder[Self <: UpdateIntentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_description(value: String): Self = StObject.set(x, "new_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_descriptionUndefined: Self = StObject.set(x, "new_description", js.undefined)
    
    @scala.inline
    def setNew_examples(value: js.Array[Example]): Self = StObject.set(x, "new_examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_examplesUndefined: Self = StObject.set(x, "new_examples", js.undefined)
    
    @scala.inline
    def setNew_examplesVarargs(value: Example*): Self = StObject.set(x, "new_examples", js.Array(value :_*))
    
    @scala.inline
    def setNew_intent(value: String): Self = StObject.set(x, "new_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_intentUndefined: Self = StObject.set(x, "new_intent", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
