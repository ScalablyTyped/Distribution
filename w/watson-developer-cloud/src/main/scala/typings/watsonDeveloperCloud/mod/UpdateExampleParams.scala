package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateExample` operation. */
@js.native
trait UpdateExampleParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The intent name. */
  var intent: String = js.native
  
  /** An array of contextual entity mentions. */
  var new_mentions: js.UndefOr[js.Array[Mention]] = js.native
  
  /** The text of the user input example. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 1024 characters. */
  var new_text: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** The text of the user input example. */
  var text: String = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object UpdateExampleParams {
  
  @scala.inline
  def apply(intent: String, text: String, workspace_id: String): UpdateExampleParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExampleParams]
  }
  
  @scala.inline
  implicit class UpdateExampleParamsMutableBuilder[Self <: UpdateExampleParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_mentions(value: js.Array[Mention]): Self = StObject.set(x, "new_mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_mentionsUndefined: Self = StObject.set(x, "new_mentions", js.undefined)
    
    @scala.inline
    def setNew_mentionsVarargs(value: Mention*): Self = StObject.set(x, "new_mentions", js.Array(value :_*))
    
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
