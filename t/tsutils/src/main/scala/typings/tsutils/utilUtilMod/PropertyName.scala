package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyName extends StObject {
  
  var displayName: String
  
  var symbolName: typings.typescript.mod.String
}
object PropertyName {
  
  inline def apply(displayName: String, symbolName: typings.typescript.mod.String): PropertyName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyName] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setSymbolName(value: typings.typescript.mod.String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
  }
}
