package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectInfo extends StObject {
  
  var abbreviation: String
  
  var description: String
  
  var id: String
  
  var lastUpdateTime: js.Date
  
  var name: String
  
  var properties: js.Array[ProjectProperty]
  
  /**
    * Current revision of the project
    */
  var revision: Double
  
  var state: Any
  
  var uri: String
  
  var version: Double
  
  var visibility: ProjectVisibility
}
object ProjectInfo {
  
  inline def apply(
    abbreviation: String,
    description: String,
    id: String,
    lastUpdateTime: js.Date,
    name: String,
    properties: js.Array[ProjectProperty],
    revision: Double,
    state: Any,
    uri: String,
    version: Double,
    visibility: ProjectVisibility
  ): ProjectInfo = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectInfo]
  }
  
  extension [Self <: ProjectInfo](x: Self) {
    
    inline def setAbbreviation(value: String): Self = StObject.set(x, "abbreviation", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[ProjectProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: ProjectProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: ProjectVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
