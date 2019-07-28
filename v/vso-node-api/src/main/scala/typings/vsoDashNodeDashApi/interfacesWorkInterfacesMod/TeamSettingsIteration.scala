package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

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
    val __obj = js.Dynamic.literal(_links = _links, attributes = attributes, id = id, name = name, path = path, url = url)
  
    __obj.asInstanceOf[TeamSettingsIteration]
  }
}

