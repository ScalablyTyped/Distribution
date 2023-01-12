package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.Array[scala.Nothing]
  
  var expressID: Double
  
  var `type`: String
}
object Children {
  
  inline def apply(children: js.Array[scala.Nothing], expressID: Double, `type`: String): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], expressID = expressID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setExpressID(value: Double): Self = StObject.set(x, "expressID", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
