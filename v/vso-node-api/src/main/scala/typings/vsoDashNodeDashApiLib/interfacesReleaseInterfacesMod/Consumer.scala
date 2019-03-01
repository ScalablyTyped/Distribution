package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer extends js.Object {
  var consumerId: scala.Double
  var consumerName: java.lang.String
}

object Consumer {
  @scala.inline
  def apply(consumerId: scala.Double, consumerName: java.lang.String): Consumer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consumerId")(consumerId)
    __obj.updateDynamic("consumerName")(consumerName)
    __obj.asInstanceOf[Consumer]
  }
}

