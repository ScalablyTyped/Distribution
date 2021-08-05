package typings.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractValueDescription
  extends StObject
     with AbstractBase {
  
  @JSName("parent")
  var parent_AbstractValueDescription: Argument | ConstantMemberType | FieldType
}
object AbstractValueDescription {
  
  inline def apply(extAttrs: js.Array[ExtendedAttribute], parent: Argument | ConstantMemberType | FieldType): AbstractValueDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[AbstractValueDescription]
  }
  
  extension [Self <: AbstractValueDescription](x: Self) {
    
    inline def setParent(value: Argument | ConstantMemberType | FieldType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
