package typings.twilioDashSync.libEntityMod

import typings.twilioDashSync.libInterfacesServicesMod.Network
import typings.twilioDashSync.libInterfacesServicesMod.Router
import typings.twilioDashSync.libInterfacesServicesMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityServices extends js.Object {
  var network: Network
  var router: Router
  var storage: Storage
}

object EntityServices {
  @scala.inline
  def apply(network: Network, router: Router, storage: Storage): EntityServices = {
    val __obj = js.Dynamic.literal(network = network, router = router, storage = storage)
  
    __obj.asInstanceOf[EntityServices]
  }
}

