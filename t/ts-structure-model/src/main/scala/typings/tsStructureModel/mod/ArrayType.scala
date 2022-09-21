package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayType
  extends StObject
     with TypeModel {
  
  var base: TypeModel
}
object ArrayType {
  
  inline def apply(base: TypeModel, typeKind: TypeKind): ArrayType = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], typeKind = typeKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayType]
  }
  
  extension [Self <: ArrayType](x: Self) {
    
    inline def setBase(value: TypeModel): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
  }
}
