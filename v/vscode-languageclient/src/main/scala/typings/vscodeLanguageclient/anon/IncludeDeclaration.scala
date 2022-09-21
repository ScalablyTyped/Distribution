package typings.vscodeLanguageclient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeDeclaration extends StObject {
  
  var includeDeclaration: Boolean
}
object IncludeDeclaration {
  
  inline def apply(includeDeclaration: Boolean): IncludeDeclaration = {
    val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeDeclaration]
  }
  
  extension [Self <: IncludeDeclaration](x: Self) {
    
    inline def setIncludeDeclaration(value: Boolean): Self = StObject.set(x, "includeDeclaration", value.asInstanceOf[js.Any])
  }
}
