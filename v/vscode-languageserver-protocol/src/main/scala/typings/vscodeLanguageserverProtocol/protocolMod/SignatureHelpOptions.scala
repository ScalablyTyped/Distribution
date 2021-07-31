package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * List of characters that re-trigger signature help.
    *
    * These trigger characters are only active when signature help is already showing. All trigger characters
    * are also counted as re-trigger characters.
    *
    * @since 3.15.0
    */
  var retriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of characters that trigger signature help.
    */
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
}
object SignatureHelpOptions {
  
  @scala.inline
  def apply(): SignatureHelpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpOptions]
  }
  
  @scala.inline
  implicit class SignatureHelpOptionsMutableBuilder[Self <: SignatureHelpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "retriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriggerCharactersUndefined: Self = StObject.set(x, "retriggerCharacters", js.undefined)
    
    @scala.inline
    def setRetriggerCharactersVarargs(value: String*): Self = StObject.set(x, "retriggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "triggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharactersUndefined: Self = StObject.set(x, "triggerCharacters", js.undefined)
    
    @scala.inline
    def setTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "triggerCharacters", js.Array(value :_*))
  }
}
