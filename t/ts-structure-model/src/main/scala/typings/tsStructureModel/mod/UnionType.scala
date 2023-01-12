package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnionType
  extends StObject
     with TypeModel {
  
  var options: js.Array[TypeModel]
}
object UnionType {
  
  inline def apply(options: js.Array[TypeModel], typeKind: TypeKind): UnionType = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], typeKind = typeKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnionType] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: js.Array[TypeModel]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: TypeModel*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
