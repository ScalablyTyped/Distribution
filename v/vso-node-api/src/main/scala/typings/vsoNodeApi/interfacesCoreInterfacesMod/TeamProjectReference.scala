package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamProjectReference extends StObject {
  
  /**
    * Project abbreviation.
    */
  var abbreviation: String
  
  /**
    * The project's description (if any).
    */
  var description: String
  
  /**
    * Project identifier.
    */
  var id: String
  
  /**
    * Project name.
    */
  var name: String
  
  /**
    * Project revision.
    */
  var revision: Double
  
  /**
    * Project state.
    */
  var state: Any
  
  /**
    * Url to the full version of the object.
    */
  var url: String
  
  /**
    * Project visibility.
    */
  var visibility: ProjectVisibility
}
object TeamProjectReference {
  
  inline def apply(
    abbreviation: String,
    description: String,
    id: String,
    name: String,
    revision: Double,
    state: Any,
    url: String,
    visibility: ProjectVisibility
  ): TeamProjectReference = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamProjectReference] (val x: Self) extends AnyVal {
    
    inline def setAbbreviation(value: String): Self = StObject.set(x, "abbreviation", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: ProjectVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
