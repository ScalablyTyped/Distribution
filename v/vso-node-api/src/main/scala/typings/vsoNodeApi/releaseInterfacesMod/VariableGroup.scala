package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableGroup extends StObject {
  
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: IdentityRef
  
  /**
    * Gets date on which it got created.
    */
  var createdOn: js.Date
  
  /**
    * Gets or sets description.
    */
  var description: String
  
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double
  
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: IdentityRef
  
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: js.Date
  
  /**
    * Gets or sets name.
    */
  var name: String
  
  /**
    * Gets or sets provider data.
    */
  var providerData: VariableGroupProviderData
  
  /**
    * Gets or sets type.
    */
  var `type`: String
  
  var variables: StringDictionary[VariableValue]
}
object VariableGroup {
  
  inline def apply(
    createdBy: IdentityRef,
    createdOn: js.Date,
    description: String,
    id: Double,
    modifiedBy: IdentityRef,
    modifiedOn: js.Date,
    name: String,
    providerData: VariableGroupProviderData,
    `type`: String,
    variables: StringDictionary[VariableValue]
  ): VariableGroup = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerData = providerData.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableGroup]
  }
  
  extension [Self <: VariableGroup](x: Self) {
    
    inline def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: IdentityRef): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    inline def setModifiedOn(value: js.Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviderData(value: VariableGroupProviderData): Self = StObject.set(x, "providerData", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: StringDictionary[VariableValue]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
