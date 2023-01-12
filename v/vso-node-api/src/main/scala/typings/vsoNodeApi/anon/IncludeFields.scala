package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeFields extends StObject {
  
  var includeFields: scala.Double
  
  var none: scala.Double
}
object IncludeFields {
  
  inline def apply(includeFields: scala.Double, none: scala.Double): IncludeFields = {
    val __obj = js.Dynamic.literal(includeFields = includeFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeFields] (val x: Self) extends AnyVal {
    
    inline def setIncludeFields(value: scala.Double): Self = StObject.set(x, "includeFields", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
