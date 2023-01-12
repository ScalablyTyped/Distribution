package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cross extends StObject {
  
  var as: js.Array[String]
  
  var cross: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.Array[String]
  
  var ops: js.Array[String]
}
object Cross {
  
  inline def apply(as: js.Array[String], fields: js.Array[String], ops: js.Array[String]): Cross = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cross]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cross] (val x: Self) extends AnyVal {
    
    inline def setAs(value: js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setCross(value: Boolean): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
    
    inline def setCrossUndefined: Self = StObject.set(x, "cross", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setOps(value: js.Array[String]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsVarargs(value: String*): Self = StObject.set(x, "ops", js.Array(value*))
  }
}
