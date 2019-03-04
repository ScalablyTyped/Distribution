package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessMapping extends js.Object {
  var accessPoint: java.lang.String
  var displayName: java.lang.String
  var moniker: java.lang.String
  /**
    * The service which owns this access mapping e.g. TFS, ELS, etc.
    */
  var serviceOwner: java.lang.String
  /**
    * Part of the access mapping which applies context after the access point of the server.
    */
  var virtualDirectory: java.lang.String
}

object AccessMapping {
  @scala.inline
  def apply(
    accessPoint: java.lang.String,
    displayName: java.lang.String,
    moniker: java.lang.String,
    serviceOwner: java.lang.String,
    virtualDirectory: java.lang.String
  ): AccessMapping = {
    val __obj = js.Dynamic.literal(accessPoint = accessPoint, displayName = displayName, moniker = moniker, serviceOwner = serviceOwner, virtualDirectory = virtualDirectory)
  
    __obj.asInstanceOf[AccessMapping]
  }
}

