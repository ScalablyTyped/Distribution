package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionContext extends StObject {
  
  /**
    * The trigger character (a single character) that has trigger code complete.
    * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
    */
  var triggerCharacter: js.UndefOr[String] = js.undefined
  
  /**
    * How the completion was triggered.
    */
  var triggerKind: CompletionTriggerKind
}
object CompletionContext {
  
  @scala.inline
  def apply(triggerKind: CompletionTriggerKind): CompletionContext = {
    val __obj = js.Dynamic.literal(triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
  
  @scala.inline
  implicit class CompletionContextMutableBuilder[Self <: CompletionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerCharacter(value: String): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
    
    @scala.inline
    def setTriggerKind(value: CompletionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
