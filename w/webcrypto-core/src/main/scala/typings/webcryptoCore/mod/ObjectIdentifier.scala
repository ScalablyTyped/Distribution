package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdentifier extends StObject {
  
  var value: String
}
object ObjectIdentifier {
  
  inline def apply(value: String): ObjectIdentifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectIdentifier] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
