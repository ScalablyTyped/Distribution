package typings.vexflow.Vex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupAttributes extends StObject {
  
  var pointerBBox: Boolean
}
object GroupAttributes {
  
  inline def apply(pointerBBox: Boolean): GroupAttributes = {
    val __obj = js.Dynamic.literal(pointerBBox = pointerBBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupAttributes]
  }
  
  extension [Self <: GroupAttributes](x: Self) {
    
    inline def setPointerBBox(value: Boolean): Self = StObject.set(x, "pointerBBox", value.asInstanceOf[js.Any])
  }
}
