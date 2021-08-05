package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributionPropertyDescription extends StObject {
  
  /**
    * Description of the property
    */
  var description: String
  
  /**
    * Name of the property
    */
  var name: String
  
  /**
    * True if this property is required
    */
  var required: Boolean
  
  /**
    * The type of value used for this property
    */
  var `type`: ContributionPropertyType
}
object ContributionPropertyDescription {
  
  inline def apply(description: String, name: String, required: Boolean, `type`: ContributionPropertyType): ContributionPropertyDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionPropertyDescription]
  }
  
  extension [Self <: ContributionPropertyDescription](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContributionPropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
