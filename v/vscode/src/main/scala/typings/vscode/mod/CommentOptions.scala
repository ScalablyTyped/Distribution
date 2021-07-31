package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentOptions extends StObject {
  
  /**
    * An optional string to show as placeholder in the comment input box when it's focused.
    */
  var placeHolder: js.UndefOr[String] = js.undefined
  
  /**
    * An optional string to show on the comment input box when it's collapsed.
    */
  var prompt: js.UndefOr[String] = js.undefined
}
object CommentOptions {
  
  @scala.inline
  def apply(): CommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentOptions]
  }
  
  @scala.inline
  implicit class CommentOptionsMutableBuilder[Self <: CommentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
  }
}
