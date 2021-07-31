package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompletionsAtPositionOptions
  extends StObject
     with UserPreferences {
  
  /** @deprecated Use includeCompletionsForModuleExports */
  var includeExternalModuleExports: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated Use includeCompletionsWithInsertText */
  var includeInsertTextCompletions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the editor is asking for completions because a certain character was typed
    * (as opposed to when the user explicitly requested them) this should be set.
    */
  var triggerCharacter: js.UndefOr[CompletionsTriggerCharacter] = js.undefined
}
object GetCompletionsAtPositionOptions {
  
  @scala.inline
  def apply(): GetCompletionsAtPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompletionsAtPositionOptions]
  }
  
  @scala.inline
  implicit class GetCompletionsAtPositionOptionsMutableBuilder[Self <: GetCompletionsAtPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeExternalModuleExports(value: Boolean): Self = StObject.set(x, "includeExternalModuleExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeExternalModuleExportsUndefined: Self = StObject.set(x, "includeExternalModuleExports", js.undefined)
    
    @scala.inline
    def setIncludeInsertTextCompletions(value: Boolean): Self = StObject.set(x, "includeInsertTextCompletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInsertTextCompletionsUndefined: Self = StObject.set(x, "includeInsertTextCompletions", js.undefined)
    
    @scala.inline
    def setTriggerCharacter(value: CompletionsTriggerCharacter): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
  }
}
