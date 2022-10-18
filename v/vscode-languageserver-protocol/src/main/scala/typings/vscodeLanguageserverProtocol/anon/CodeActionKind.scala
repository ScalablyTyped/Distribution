package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionKind extends StObject {
  
  /**
    * The code action kind is support with the following value
    * set.
    */
  var codeActionKind: ValueSet
}
object CodeActionKind {
  
  inline def apply(codeActionKind: ValueSet): CodeActionKind = {
    val __obj = js.Dynamic.literal(codeActionKind = codeActionKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionKind]
  }
  
  extension [Self <: CodeActionKind](x: Self) {
    
    inline def setCodeActionKind(value: ValueSet): Self = StObject.set(x, "codeActionKind", value.asInstanceOf[js.Any])
  }
}
