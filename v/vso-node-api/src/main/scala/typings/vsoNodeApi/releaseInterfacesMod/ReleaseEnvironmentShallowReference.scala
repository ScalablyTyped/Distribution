package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseEnvironmentShallowReference extends StObject {
  
  /**
    * Gets the links to related resources, APIs, and views for the release environment.
    */
  var _links: js.Any = js.native
  
  /**
    * Gets the unique identifier of release environment.
    */
  var id: Double = js.native
  
  /**
    * Gets or sets the name of the release environment.
    */
  var name: String = js.native
  
  /**
    * Gets the REST API url to access the release environment.
    */
  var url: String = js.native
}
object ReleaseEnvironmentShallowReference {
  
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String, url: String): ReleaseEnvironmentShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentShallowReference]
  }
  
  @scala.inline
  implicit class ReleaseEnvironmentShallowReferenceMutableBuilder[Self <: ReleaseEnvironmentShallowReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
