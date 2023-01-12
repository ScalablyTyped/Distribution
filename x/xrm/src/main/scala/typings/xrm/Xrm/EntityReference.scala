package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Some <CrmParameter> values pass an EntityReference object:
  * SelectedControlSelectedItemReferences
  * SelectedControlAllItemReferences
  * SelectedControlUnselectedItemReferences
  *
  * Not to be confused with the more commonly used LookupValue.
  *
  * @see LookupValue
  * @see {@link https://docs.microsoft.com/en-us/previous-versions/dynamicscrm-2016/developers-guide/gg309332(v=crm.8)#remarks}
  */
trait EntityReference extends StObject {
  
  /**
    * A string of the GUID Id value for the record.
    */
  var Id: String
  
  /**
    * A string of the value of the Primary field for the record.
    */
  var Name: String
  
  /**
    * @deprecated Use {@link TypeName} instead. The number value for custom entities will typically be different from organization to organization and the number value cannot be used reliably for custom entities.
    */
  var TypeCode: Double
  
  /**
    * A string representing the unique name of the entity for the record.
    */
  var TypeName: String
}
object EntityReference {
  
  inline def apply(Id: String, Name: String, TypeCode: Double, TypeName: String): EntityReference = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeCode = TypeCode.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityReference] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTypeCode(value: Double): Self = StObject.set(x, "TypeCode", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
