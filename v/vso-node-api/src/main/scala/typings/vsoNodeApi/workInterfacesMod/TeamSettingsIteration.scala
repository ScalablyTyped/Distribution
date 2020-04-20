package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSettingsIteration extends TeamSettingsDataContractBase {
  /**
    * Attributes such as start and end date
    */
  var attributes: TeamIterationAttributes
  /**
    * Id of the resource
    */
  var id: String
  /**
    * Name of the resource
    */
  var name: String
  /**
    * Relative path of the iteration
    */
  var path: String
}

object TeamSettingsIteration {
  @scala.inline
  def apply(
    _links: js.Any,
    attributes: TeamIterationAttributes,
    id: String,
    name: String,
    path: String,
    url: String
  ): TeamSettingsIteration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsIteration]
  }
}

