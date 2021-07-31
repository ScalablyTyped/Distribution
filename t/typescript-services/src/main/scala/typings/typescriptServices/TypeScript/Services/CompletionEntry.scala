package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntry extends StObject {
  
  var kind: String
  
  var kindModifiers: String
  
  var name: String
}
object CompletionEntry {
  
  @scala.inline
  def apply(kind: String, kindModifiers: String, name: String): CompletionEntry = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntry]
  }
  
  @scala.inline
  implicit class CompletionEntryMutableBuilder[Self <: CompletionEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
