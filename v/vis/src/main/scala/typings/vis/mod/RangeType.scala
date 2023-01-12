package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeType extends StObject {
  
  var max: IdType
  
  var min: IdType
}
object RangeType {
  
  inline def apply(max: IdType, min: IdType): RangeType = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeType] (val x: Self) extends AnyVal {
    
    inline def setMax(value: IdType): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: IdType): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
