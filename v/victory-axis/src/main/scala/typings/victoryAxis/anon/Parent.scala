package typings.victoryAxis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  var parent: Domain
}
object Parent {
  
  inline def apply(parent: Domain): Parent = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
    
    inline def setParent(value: Domain): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
