package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createExample` operation. */
trait CreateExampleParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The intent name. */
  var intent: String
  
  /** An array of contextual entity mentions. */
  var mentions: js.UndefOr[js.Array[Mention]] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The text of a user input example. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 1024 characters. */
  var text: String
  
  /** Unique identifier of the workspace. */
  var workspace_id: String
}
object CreateExampleParams {
  
  inline def apply(intent: String, text: String, workspace_id: String): CreateExampleParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExampleParams]
  }
  
  extension [Self <: CreateExampleParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setMentions(value: js.Array[Mention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: Mention*): Self = StObject.set(x, "mentions", js.Array(value*))
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
