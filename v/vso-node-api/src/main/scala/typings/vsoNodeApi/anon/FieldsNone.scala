package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsNone extends StObject {
  
  var fields: scala.Double
  
  var none: scala.Double
}
object FieldsNone {
  
  inline def apply(fields: scala.Double, none: scala.Double): FieldsNone = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsNone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldsNone] (val x: Self) extends AnyVal {
    
    inline def setFields(value: scala.Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
