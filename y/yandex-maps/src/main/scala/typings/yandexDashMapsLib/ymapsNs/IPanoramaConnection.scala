package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnection extends js.Object {
  def getConnectedPanorama(): js.Promise[IPanorama]
}

object IPanoramaConnection {
  @scala.inline
  def apply(getConnectedPanorama: js.Function0[js.Promise[IPanorama]]): IPanoramaConnection = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = getConnectedPanorama)
  
    __obj.asInstanceOf[IPanoramaConnection]
  }
}

