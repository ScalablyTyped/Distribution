package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildController extends XamlBuildControllerReference {
  var _links: js.Any
  /**
    * The date the controller was created.
    */
  var createdDate: Date
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
  var updatedDate: Date
  /**
    * The controller's URI.
    */
  var uri: String
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
    val __obj = js.Dynamic.literal(_links = _links, createdDate = createdDate, description = description, enabled = enabled, id = id, name = name, status = status, updatedDate = updatedDate, uri = uri, url = url)
  
    __obj.asInstanceOf[BuildController]
  }
}

