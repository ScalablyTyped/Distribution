package typings.vsoNodeApi.locationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessMapping extends js.Object {
  var accessPoint: String = js.native
  var displayName: String = js.native
  var moniker: String = js.native
  /**
    * The service which owns this access mapping e.g. TFS, ELS, etc.
    */
  var serviceOwner: String = js.native
  /**
    * Part of the access mapping which applies context after the access point of the server.
    */
  var virtualDirectory: String = js.native
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
    val __obj = js.Dynamic.literal(accessPoint = accessPoint.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any], virtualDirectory = virtualDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessMapping]
  }
  @scala.inline
  implicit class AccessMappingOps[Self <: AccessMapping] (val x: Self) extends AnyVal {
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
    def setAccessPoint(value: String): Self = this.set("accessPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoniker(value: String): Self = this.set("moniker", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceOwner(value: String): Self = this.set("serviceOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualDirectory(value: String): Self = this.set("virtualDirectory", value.asInstanceOf[js.Any])
  }
  
}

