package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var children: js.Array[Node]
  
  var expressID: Double
  
  var `type`: String
}
object Node {
  
  inline def apply(children: js.Array[Node], expressID: Double, `type`: String): Node = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], expressID = expressID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setExpressID(value: Double): Self = StObject.set(x, "expressID", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
