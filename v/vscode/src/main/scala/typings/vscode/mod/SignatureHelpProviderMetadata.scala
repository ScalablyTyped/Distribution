package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpProviderMetadata extends js.Object {
  
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
  implicit class SignatureHelpProviderMetadataOps[Self <: SignatureHelpProviderMetadata] (val x: Self) extends AnyVal {
    
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
    def setRetriggerCharactersVarargs(value: String*): Self = this.set("retriggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setRetriggerCharacters(value: js.Array[String]): Self = this.set("retriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharactersVarargs(value: String*): Self = this.set("triggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setTriggerCharacters(value: js.Array[String]): Self = this.set("triggerCharacters", value.asInstanceOf[js.Any])
  }
}
