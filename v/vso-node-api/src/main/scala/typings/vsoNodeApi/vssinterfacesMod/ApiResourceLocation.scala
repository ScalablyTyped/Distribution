package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiResourceLocation extends StObject {
  
  /**
    * Area name for this resource
    */
  var area: String = js.native
  
  /**
    * Unique Identifier for this location
    */
  var id: String = js.native
  
  /**
    * Maximum api version that this resource supports (current server version for this resource)
    */
  var maxVersion: String = js.native
  
  /**
    * Minimum api version that this resource supports
    */
  var minVersion: String = js.native
  
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode
    */
  var releasedVersion: String = js.native
  
  /**
    * Resource name
    */
  var resourceName: String = js.native
  
  /**
    * The current resource version supported by this resource location
    */
  var resourceVersion: Double = js.native
  
  /**
    * This location's route template (templated relative path)
    */
  var routeTemplate: String = js.native
}
object ApiResourceLocation {
  
  @scala.inline
  def apply(
    area: String,
    id: String,
    maxVersion: String,
    minVersion: String,
    releasedVersion: String,
    resourceName: String,
    resourceVersion: Double,
    routeTemplate: String
  ): ApiResourceLocation = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxVersion = maxVersion.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], releasedVersion = releasedVersion.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], routeTemplate = routeTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResourceLocation]
  }
  
  @scala.inline
  implicit class ApiResourceLocationMutableBuilder[Self <: ApiResourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVersion(value: String): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVersion(value: String): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasedVersion(value: String): Self = StObject.set(x, "releasedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVersion(value: Double): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTemplate(value: String): Self = StObject.set(x, "routeTemplate", value.asInstanceOf[js.Any])
  }
}
