package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildController extends XamlBuildControllerReference {
  
  var _links: js.Any = js.native
  
  /**
    * The date the controller was created.
    */
  var createdDate: Date = js.native
  
  /**
    * The description of the controller.
    */
  var description: String = js.native
  
  /**
    * Indicates whether the controller is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * The status of the controller.
    */
  var status: ControllerStatus = js.native
  
  /**
    * The date the controller was last updated.
    */
  var updatedDate: Date = js.native
  
  /**
    * The controller's URI.
    */
  var uri: String = js.native
}
object BuildController {
  
  @scala.inline
  def apply(
    _links: js.Any,
    createdDate: Date,
    description: String,
    enabled: Boolean,
    id: Double,
    name: String,
    status: ControllerStatus,
    updatedDate: Date,
    uri: String,
    url: String
  ): BuildController = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildController]
  }
  
  @scala.inline
  implicit class BuildControllerOps[Self <: BuildController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ControllerStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
}
