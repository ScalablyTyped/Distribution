package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnection extends js.Object {
  def getConnectedPanorama(): js.Promise[IPanorama]
}

object IPanoramaConnection {
  @scala.inline
  def apply(getConnectedPanorama: () => js.Promise[IPanorama]): IPanoramaConnection = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama))
    __obj.asInstanceOf[IPanoramaConnection]
  }
}

