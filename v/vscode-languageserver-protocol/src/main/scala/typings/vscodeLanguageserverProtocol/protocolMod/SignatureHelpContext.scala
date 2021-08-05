package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.SignatureHelp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpContext extends StObject {
  
  /**
    * The currently active `SignatureHelp`.
    *
    * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
    * the user navigating through available signatures.
    */
  var activeSignatureHelp: js.UndefOr[SignatureHelp] = js.undefined
  
  /**
    * `true` if signature help was already showing when it was triggered.
    *
    * Retriggers occur when the signature help is already active and can be caused by actions such as
    * typing a trigger character, a cursor move, or document content changes.
    */
  var isRetrigger: Boolean
  
  /**
    * Character that caused signature help to be triggered.
    *
    * This is undefined when `triggerKind !== SignatureHelpTriggerKind.TriggerCharacter`
    */
  var triggerCharacter: js.UndefOr[String] = js.undefined
  
  /**
    * Action that caused signature help to be triggered.
    */
  var triggerKind: SignatureHelpTriggerKind
}
object SignatureHelpContext {
  
  inline def apply(isRetrigger: Boolean, triggerKind: SignatureHelpTriggerKind): SignatureHelpContext = {
    val __obj = js.Dynamic.literal(isRetrigger = isRetrigger.asInstanceOf[js.Any], triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpContext]
  }
  
  extension [Self <: SignatureHelpContext](x: Self) {
    
    inline def setActiveSignatureHelp(value: SignatureHelp): Self = StObject.set(x, "activeSignatureHelp", value.asInstanceOf[js.Any])
    
    inline def setActiveSignatureHelpUndefined: Self = StObject.set(x, "activeSignatureHelp", js.undefined)
    
    inline def setIsRetrigger(value: Boolean): Self = StObject.set(x, "isRetrigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacter(value: String): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
    
    inline def setTriggerKind(value: SignatureHelpTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
