package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intval extends StObject {
  
  var int_val: Double
  
  var root_index: Double
}
object Intval {
  
  inline def apply(int_val: Double, root_index: Double): Intval = {
    val __obj = js.Dynamic.literal(int_val = int_val.asInstanceOf[js.Any], root_index = root_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Intval] (val x: Self) extends AnyVal {
    
    inline def setInt_val(value: Double): Self = StObject.set(x, "int_val", value.asInstanceOf[js.Any])
    
    inline def setRoot_index(value: Double): Self = StObject.set(x, "root_index", value.asInstanceOf[js.Any])
  }
}
