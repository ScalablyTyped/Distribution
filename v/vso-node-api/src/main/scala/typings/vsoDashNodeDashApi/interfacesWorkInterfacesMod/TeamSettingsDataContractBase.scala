package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamSettingsDataContractBase extends js.Object {
  /**
    * Collection of links relevant to resource
    */
  var _links: js.Any
  /**
    * Full http link to the resource
    */
  var url: String
}

object TeamSettingsDataContractBase {
  @scala.inline
  def apply(_links: js.Any, url: String): TeamSettingsDataContractBase = {
    val __obj = js.Dynamic.literal(_links = _links, url = url)
  
    __obj.asInstanceOf[TeamSettingsDataContractBase]
  }
}

