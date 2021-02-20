package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyName extends StObject {
  
  var displayName: String = js.native
  
  var symbolName: typings.typescript.mod.String = js.native
}
object PropertyName {
  
  @scala.inline
  def apply(displayName: String, symbolName: typings.typescript.mod.String): PropertyName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyName]
  }
  
  @scala.inline
  implicit class PropertyNameMutableBuilder[Self <: PropertyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolName(value: typings.typescript.mod.String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
  }
}
