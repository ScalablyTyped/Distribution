package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionContext extends StObject {
  
  /**
    * Character that triggered the completion item provider.
    *
    * `undefined` if the provider was not triggered by a character.
    *
    * The trigger character is already in the document when the completion provider is triggered.
    */
  val triggerCharacter: js.UndefOr[String] = js.undefined
  
  /**
    * How the completion was triggered.
    */
  val triggerKind: CompletionTriggerKind
}
object CompletionContext {
  
  inline def apply(triggerKind: CompletionTriggerKind): CompletionContext = {
    val __obj = js.Dynamic.literal(triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionContext] (val x: Self) extends AnyVal {
    
    inline def setTriggerCharacter(value: String): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
    
    inline def setTriggerKind(value: CompletionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
