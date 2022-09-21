package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasNode extends StObject {
  
  var name: String
  
  var `type`: TypeModel
}
object AliasNode {
  
  inline def apply(name: String, `type`: TypeModel): AliasNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasNode]
  }
  
  extension [Self <: AliasNode](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeModel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
