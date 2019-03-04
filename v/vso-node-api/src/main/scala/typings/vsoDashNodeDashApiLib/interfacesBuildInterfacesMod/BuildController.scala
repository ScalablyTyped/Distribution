package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildController extends XamlBuildControllerReference {
  var _links: js.Any
  /**
    * The date the controller was created.
    */
  var createdDate: stdLib.Date
  /**
    * The description of the controller.
    */
  var description: java.lang.String
  /**
    * Indicates whether the controller is enabled.
    */
  var enabled: scala.Boolean
  /**
    * The status of the controller.
    */
  var status: ControllerStatus
  /**
    * The date the controller was last updated.
    */
  var updatedDate: stdLib.Date
  /**
    * The controller's URI.
    */
  var uri: java.lang.String
}

object BuildController {
  @scala.inline
  def apply(
    _links: js.Any,
    createdDate: stdLib.Date,
    description: java.lang.String,
    enabled: scala.Boolean,
    id: scala.Double,
    name: java.lang.String,
    status: ControllerStatus,
    updatedDate: stdLib.Date,
    uri: java.lang.String,
    url: java.lang.String
  ): BuildController = {
    val __obj = js.Dynamic.literal(_links = _links, createdDate = createdDate, description = description, enabled = enabled, id = id, name = name, status = status, updatedDate = updatedDate, uri = uri, url = url)
  
    __obj.asInstanceOf[BuildController]
  }
}

