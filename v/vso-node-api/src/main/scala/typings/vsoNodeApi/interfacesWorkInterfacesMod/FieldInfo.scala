package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldInfo extends StObject {
  
  /**
    * The additional field display name
    */
  var displayName: String
  
  /**
    * The additional field type
    */
  var fieldType: FieldType
  
  /**
    * Indicates if the field definition is for an identity field.
    */
  var isIdentity: Boolean
  
  /**
    * The additional field reference name
    */
  var referenceName: String
}
object FieldInfo {
  
  inline def apply(displayName: String, fieldType: FieldType, isIdentity: Boolean, referenceName: String): FieldInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfo]
  }
  
  extension [Self <: FieldInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFieldType(value: FieldType): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    inline def setIsIdentity(value: Boolean): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
    
    inline def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
  }
}
