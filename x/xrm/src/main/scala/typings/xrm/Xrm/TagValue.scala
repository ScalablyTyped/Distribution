package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a (lookup) Tag value
  */
trait TagValue
  extends StObject
     with LookupValue {
  
  /**
    * The originating lookup column that raised the event.
    */
  var fieldName: String
}
object TagValue {
  
  inline def apply(entityType: String, fieldName: String, id: String): TagValue = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagValue] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
  }
}
