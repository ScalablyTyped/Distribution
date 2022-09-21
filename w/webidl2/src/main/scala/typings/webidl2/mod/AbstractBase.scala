package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractBase extends StObject {
  
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  
  /** The container of this type. */
  var parent: AbstractBase | Null
  
  /** String indicating the type of this node. */
  var `type`: String | Null
}
object AbstractBase {
  
  inline def apply(extAttrs: js.Array[ExtendedAttribute]): AbstractBase = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[AbstractBase]
  }
  
  extension [Self <: AbstractBase](x: Self) {
    
    inline def setExtAttrs(value: js.Array[ExtendedAttribute]): Self = StObject.set(x, "extAttrs", value.asInstanceOf[js.Any])
    
    inline def setExtAttrsVarargs(value: ExtendedAttribute*): Self = StObject.set(x, "extAttrs", js.Array(value*))
    
    inline def setParent(value: AbstractBase): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
