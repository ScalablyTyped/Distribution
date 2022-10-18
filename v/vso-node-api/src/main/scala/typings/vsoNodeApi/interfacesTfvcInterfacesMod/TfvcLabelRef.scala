package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcLabelRef extends StObject {
  
  var _links: Any
  
  var description: String
  
  var id: Double
  
  var labelScope: String
  
  var modifiedDate: js.Date
  
  var name: String
  
  var owner: IdentityRef
  
  var url: String
}
object TfvcLabelRef {
  
  inline def apply(
    _links: Any,
    description: String,
    id: Double,
    labelScope: String,
    modifiedDate: js.Date,
    name: String,
    owner: IdentityRef,
    url: String
  ): TfvcLabelRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelScope = labelScope.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcLabelRef]
  }
  
  extension [Self <: TfvcLabelRef](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabelScope(value: String): Self = StObject.set(x, "labelScope", value.asInstanceOf[js.Any])
    
    inline def setModifiedDate(value: js.Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
