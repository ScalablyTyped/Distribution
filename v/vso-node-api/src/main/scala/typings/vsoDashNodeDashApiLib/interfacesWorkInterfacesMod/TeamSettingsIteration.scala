package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  var id: java.lang.String
  /**
    * Name of the resource
    */
  var name: java.lang.String
  /**
    * Relative path of the iteration
    */
  var path: java.lang.String
}

object TeamSettingsIteration {
  @scala.inline
  def apply(
    _links: js.Any,
    attributes: TeamIterationAttributes,
    id: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    url: java.lang.String
  ): TeamSettingsIteration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TeamSettingsIteration]
  }
}

