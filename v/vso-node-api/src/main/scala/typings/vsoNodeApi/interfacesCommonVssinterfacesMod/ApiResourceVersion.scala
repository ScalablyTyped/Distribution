package typings.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiResourceVersion extends StObject {
  
  /**
    * String representation of the Public API version. This is the version that the public sees and is used for a large group of services (e.g. the TFS 1.0 API)
    */
  var apiVersion: String
  
  /**
    * Is the public API version in preview
    */
  var isPreview: Boolean
  
  /**
    * Internal resource version. This is defined per-resource and is used to support build-to-build compatibility of API changes within a given (in-preview) public api version. For example, within the TFS 1.0 API release cycle, while it is still in preview, a resource's data structure may be changed. This resource can be versioned such that older clients will still work (requests will be sent to the older version) and new/upgraded clients will talk to the new version of the resource.
    */
  var resourceVersion: Double
}
object ApiResourceVersion {
  
  inline def apply(apiVersion: String, isPreview: Boolean, resourceVersion: Double): ApiResourceVersion = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResourceVersion]
  }
  
  extension [Self <: ApiResourceVersion](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
    
    inline def setResourceVersion(value: Double): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
  }
}
