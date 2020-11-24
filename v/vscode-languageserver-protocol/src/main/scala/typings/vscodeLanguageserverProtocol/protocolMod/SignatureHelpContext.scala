package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.SignatureHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpContext extends js.Object {
  
  /**
    * The currently active `SignatureHelp`.
    *
    * The `activeSignatureHelp` has its `SignatureHelp.activeSignature` field updated based on
    * the user navigating through available signatures.
    */
  var activeSignatureHelp: js.UndefOr[SignatureHelp] = js.native
  
  /**
    * `true` if signature help was already showing when it was triggered.
    *
    * Retriggers occur when the signature help is already active and can be caused by actions such as
    * typing a trigger character, a cursor move, or document content changes.
    */
  var isRetrigger: Boolean = js.native
  
  /**
    * Character that caused signature help to be triggered.
    *
    * This is undefined when `triggerKind !== SignatureHelpTriggerKind.TriggerCharacter`
    */
  var triggerCharacter: js.UndefOr[String] = js.native
  
  /**
    * Action that caused signature help to be triggered.
    */
  var triggerKind: SignatureHelpTriggerKind = js.native
}
object SignatureHelpContext {
  
  @scala.inline
  def apply(isRetrigger: Boolean, triggerKind: SignatureHelpTriggerKind): SignatureHelpContext = {
    val __obj = js.Dynamic.literal(isRetrigger = isRetrigger.asInstanceOf[js.Any], triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpContext]
  }
  
  @scala.inline
  implicit class SignatureHelpContextOps[Self <: SignatureHelpContext] (val x: Self) extends AnyVal {
    
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
    def setIsRetrigger(value: Boolean): Self = this.set("isRetrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerKind(value: SignatureHelpTriggerKind): Self = this.set("triggerKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSignatureHelp(value: SignatureHelp): Self = this.set("activeSignatureHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveSignatureHelp: Self = this.set("activeSignatureHelp", js.undefined)
    
    @scala.inline
    def setTriggerCharacter(value: String): Self = this.set("triggerCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerCharacter: Self = this.set("triggerCharacter", js.undefined)
  }
}
