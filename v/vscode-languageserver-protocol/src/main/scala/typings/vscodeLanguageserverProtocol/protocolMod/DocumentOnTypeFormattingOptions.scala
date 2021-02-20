package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentOnTypeFormattingOptions extends StObject {
  
  /**
    * A character on which formatting should be triggered, like `}`.
    */
  var firstTriggerCharacter: String = js.native
  
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[String]] = js.native
}
object DocumentOnTypeFormattingOptions {
  
  @scala.inline
  def apply(firstTriggerCharacter: String): DocumentOnTypeFormattingOptions = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingOptions]
  }
  
  @scala.inline
  implicit class DocumentOnTypeFormattingOptionsMutableBuilder[Self <: DocumentOnTypeFormattingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstTriggerCharacter(value: String): Self = StObject.set(x, "firstTriggerCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreTriggerCharacter(value: js.Array[String]): Self = StObject.set(x, "moreTriggerCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreTriggerCharacterUndefined: Self = StObject.set(x, "moreTriggerCharacter", js.undefined)
    
    @scala.inline
    def setMoreTriggerCharacterVarargs(value: String*): Self = StObject.set(x, "moreTriggerCharacter", js.Array(value :_*))
  }
}
