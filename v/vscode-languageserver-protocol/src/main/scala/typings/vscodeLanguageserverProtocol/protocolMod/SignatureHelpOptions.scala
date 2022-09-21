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
    * List of characters that trigger signature help automatically.
    */
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
}
object SignatureHelpOptions {
  
  inline def apply(): SignatureHelpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpOptions]
  }
  
  extension [Self <: SignatureHelpOptions](x: Self) {
    
    inline def setRetriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "retriggerCharacters", value.asInstanceOf[js.Any])
    
    inline def setRetriggerCharactersUndefined: Self = StObject.set(x, "retriggerCharacters", js.undefined)
    
    inline def setRetriggerCharactersVarargs(value: String*): Self = StObject.set(x, "retriggerCharacters", js.Array(value*))
    
    inline def setTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "triggerCharacters", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharactersUndefined: Self = StObject.set(x, "triggerCharacters", js.undefined)
    
    inline def setTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "triggerCharacters", js.Array(value*))
  }
}
