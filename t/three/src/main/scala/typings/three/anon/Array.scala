package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends StObject {
  
  var array: js.Array[Double] = js.native
  
  var itemSize: Double = js.native
  
  var normalized: Boolean = js.native
  
  var `type`: String = js.native
}
object Array {
  
  @scala.inline
  def apply(array: js.Array[Double], itemSize: Double, normalized: Boolean, `type`: String): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: js.Array[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayVarargs(value: Double*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    @scala.inline
    def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
