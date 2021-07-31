package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateCounterexample` operation. */
trait UpdateCounterexampleParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The text of a user input marked as irrelevant input. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters - It cannot consist of only whitespace characters - It must be no longer than 1024 characters. */
  var new_text: js.UndefOr[String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The text of a user input counterexample (for example, `What are you wearing?`). */
  var text: String
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object UpdateCounterexampleParams {
  
  @scala.inline
  def apply(text: String, workspace_id: String): UpdateCounterexampleParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCounterexampleParams]
  }
  
  @scala.inline
  implicit class UpdateCounterexampleParamsMutableBuilder[Self <: UpdateCounterexampleParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setNew_text(value: String): Self = StObject.set(x, "new_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_textUndefined: Self = StObject.set(x, "new_text", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
