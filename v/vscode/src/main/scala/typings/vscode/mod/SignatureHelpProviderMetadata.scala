package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpProviderMetadata extends StObject {
  
  /**
    * List of characters that re-trigger signature help.
    *
    * These trigger characters are only active when signature help is already showing. All trigger characters
    * are also counted as re-trigger characters.
    */
  val retriggerCharacters: js.Array[String] = js.native
  
  /**
    * List of characters that trigger signature help.
    */
  val triggerCharacters: js.Array[String] = js.native
}
object SignatureHelpProviderMetadata {
  
  @scala.inline
  def apply(retriggerCharacters: js.Array[String], triggerCharacters: js.Array[String]): SignatureHelpProviderMetadata = {
    val __obj = js.Dynamic.literal(retriggerCharacters = retriggerCharacters.asInstanceOf[js.Any], triggerCharacters = triggerCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpProviderMetadata]
  }
  
  @scala.inline
  implicit class SignatureHelpProviderMetadataMutableBuilder[Self <: SignatureHelpProviderMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "retriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriggerCharactersVarargs(value: String*): Self = StObject.set(x, "retriggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "triggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "triggerCharacters", js.Array(value :_*))
  }
}
