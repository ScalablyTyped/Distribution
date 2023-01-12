package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildType extends StObject {
  
  /**
    * The id of the loaded new child type
    */
  var id: String
  
  /**
    * the maximum allowed children of this type
    */
  var max: Double
  
  /**
    * the minimum necessary amount of this type of child
    */
  var min: Double
}
object ChildType {
  
  inline def apply(id: String, max: Double, min: Double): ChildType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildType] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
