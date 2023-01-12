package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamSettingsIteration
  extends StObject
     with TeamSettingsDataContractBase {
  
  /**
    * Attributes such as start and end date
    */
  var attributes: TeamIterationAttributes
  
  /**
    * Id of the resource
    */
  var id: String
  
  /**
    * Name of the resource
    */
  var name: String
  
  /**
    * Relative path of the iteration
    */
  var path: String
}
object TeamSettingsIteration {
  
  inline def apply(
    _links: Any,
    attributes: TeamIterationAttributes,
    id: String,
    name: String,
    path: String,
    url: String
  ): TeamSettingsIteration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsIteration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamSettingsIteration] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: TeamIterationAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
