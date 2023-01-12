package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOnTypeFormattingOptions extends StObject {
  
  /**
    * A character on which formatting should be triggered, like `{`.
    */
  var firstTriggerCharacter: String
  
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[String]] = js.undefined
}
object DocumentOnTypeFormattingOptions {
  
  inline def apply(firstTriggerCharacter: String): DocumentOnTypeFormattingOptions = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentOnTypeFormattingOptions] (val x: Self) extends AnyVal {
    
    inline def setFirstTriggerCharacter(value: String): Self = StObject.set(x, "firstTriggerCharacter", value.asInstanceOf[js.Any])
    
    inline def setMoreTriggerCharacter(value: js.Array[String]): Self = StObject.set(x, "moreTriggerCharacter", value.asInstanceOf[js.Any])
    
    inline def setMoreTriggerCharacterUndefined: Self = StObject.set(x, "moreTriggerCharacter", js.undefined)
    
    inline def setMoreTriggerCharacterVarargs(value: String*): Self = StObject.set(x, "moreTriggerCharacter", js.Array(value*))
  }
}
