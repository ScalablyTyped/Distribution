package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureFile extends StObject {
  
  var createdBy: IdentityRef
  
  var createdOn: js.Date
  
  var id: String
  
  var modifiedBy: IdentityRef
  
  var modifiedOn: js.Date
  
  var name: String
  
  var properties: StringDictionary[String]
  
  var ticket: String
}
object SecureFile {
  
  inline def apply(
    createdBy: IdentityRef,
    createdOn: js.Date,
    id: String,
    modifiedBy: IdentityRef,
    modifiedOn: js.Date,
    name: String,
    properties: StringDictionary[String],
    ticket: String
  ): SecureFile = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureFile]
  }
  
  extension [Self <: SecureFile](x: Self) {
    
    inline def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: IdentityRef): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    inline def setModifiedOn(value: js.Date): Self = StObject.set(x, "modifiedOn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}
