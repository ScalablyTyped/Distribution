package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildController
  extends StObject
     with XamlBuildControllerReference {
  
  var _links: Any
  
  /**
    * The date the controller was created.
    */
  var createdDate: js.Date
  
  /**
    * The description of the controller.
    */
  var description: String
  
  /**
    * Indicates whether the controller is enabled.
    */
  var enabled: Boolean
  
  /**
    * The status of the controller.
    */
  var status: ControllerStatus
  
  /**
    * The date the controller was last updated.
    */
  var updatedDate: js.Date
  
  /**
    * The controller's URI.
    */
  var uri: String
}
object BuildController {
  
  inline def apply(
    _links: Any,
    createdDate: js.Date,
    description: String,
    enabled: Boolean,
    id: Double,
    name: String,
    status: ControllerStatus,
    updatedDate: js.Date,
    uri: String,
    url: String
  ): BuildController = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildController]
  }
  
  extension [Self <: BuildController](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ControllerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
