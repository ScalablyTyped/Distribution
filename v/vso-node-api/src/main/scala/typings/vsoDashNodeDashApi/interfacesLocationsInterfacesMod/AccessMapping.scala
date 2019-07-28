package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessMapping extends js.Object {
  var accessPoint: String
  var displayName: String
  var moniker: String
  /**
    * The service which owns this access mapping e.g. TFS, ELS, etc.
    */
  var serviceOwner: String
  /**
    * Part of the access mapping which applies context after the access point of the server.
    */
  var virtualDirectory: String
}

object AccessMapping {
  @scala.inline
  def apply(
    accessPoint: String,
    displayName: String,
    moniker: String,
    serviceOwner: String,
    virtualDirectory: String
  ): AccessMapping = {
    val __obj = js.Dynamic.literal(accessPoint = accessPoint, displayName = displayName, moniker = moniker, serviceOwner = serviceOwner, virtualDirectory = virtualDirectory)
  
    __obj.asInstanceOf[AccessMapping]
  }
}

