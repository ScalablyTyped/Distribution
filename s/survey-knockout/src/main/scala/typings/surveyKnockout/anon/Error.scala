package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: String
  
  var root: String
  
  var saveAgainButton: String
  
  var saving: String
  
  var success: String
}
object Error {
  
  @scala.inline
  def apply(error: String, root: String, saveAgainButton: String, saving: String, success: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], saveAgainButton = saveAgainButton.asInstanceOf[js.Any], saving = saving.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAgainButton(value: String): Self = StObject.set(x, "saveAgainButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaving(value: String): Self = StObject.set(x, "saving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
