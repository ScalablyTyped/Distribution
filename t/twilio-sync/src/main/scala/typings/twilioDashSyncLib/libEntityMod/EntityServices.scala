package typings
package twilioDashSyncLib.libEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityServices extends js.Object {
  var network: twilioDashSyncLib.libInterfacesServicesMod.Network
  var router: twilioDashSyncLib.libInterfacesServicesMod.Router
  var storage: twilioDashSyncLib.libInterfacesServicesMod.Storage
}

object EntityServices {
  @scala.inline
  def apply(
    network: twilioDashSyncLib.libInterfacesServicesMod.Network,
    router: twilioDashSyncLib.libInterfacesServicesMod.Router,
    storage: twilioDashSyncLib.libInterfacesServicesMod.Storage
  ): EntityServices = {
    val __obj = js.Dynamic.literal(network = network, router = router, storage = storage)
  
    __obj.asInstanceOf[EntityServices]
  }
}

