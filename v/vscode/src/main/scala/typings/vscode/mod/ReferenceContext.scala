package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceContext extends StObject {
  
  /**
    * Include the declaration of the current symbol.
    */
  var includeDeclaration: Boolean
}
object ReferenceContext {
  
  inline def apply(includeDeclaration: Boolean): ReferenceContext = {
    val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceContext]
  }
  
  extension [Self <: ReferenceContext](x: Self) {
    
    inline def setIncludeDeclaration(value: Boolean): Self = StObject.set(x, "includeDeclaration", value.asInstanceOf[js.Any])
  }
}
