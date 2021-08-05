package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseEnvironmentShallowReference extends StObject {
  
  /**
    * Gets the links to related resources, APIs, and views for the release environment.
    */
  var _links: js.Any
  
  /**
    * Gets the unique identifier of release environment.
    */
  var id: Double
  
  /**
    * Gets or sets the name of the release environment.
    */
  var name: String
  
  /**
    * Gets the REST API url to access the release environment.
    */
  var url: String
}
object ReleaseEnvironmentShallowReference {
  
  inline def apply(_links: js.Any, id: Double, name: String, url: String): ReleaseEnvironmentShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentShallowReference]
  }
  
  extension [Self <: ReleaseEnvironmentShallowReference](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
