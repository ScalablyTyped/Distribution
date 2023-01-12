package typings.typescript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EscapedIdentifier extends StObject {
  
  var __escapedIdentifier: Unit
}
object EscapedIdentifier {
  
  inline def apply(__escapedIdentifier: Unit): EscapedIdentifier = {
    val __obj = js.Dynamic.literal(__escapedIdentifier = __escapedIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[EscapedIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EscapedIdentifier] (val x: Self) extends AnyVal {
    
    inline def set__escapedIdentifier(value: Unit): Self = StObject.set(x, "__escapedIdentifier", value.asInstanceOf[js.Any])
  }
}
