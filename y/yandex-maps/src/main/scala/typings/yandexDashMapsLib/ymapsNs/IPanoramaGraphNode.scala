package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaGraphNode extends js.Object {
  def getConnectedPanorama(): js.Promise[IPanorama]
}

object IPanoramaGraphNode {
  @scala.inline
  def apply(getConnectedPanorama: js.Function0[js.Promise[IPanorama]]): IPanoramaGraphNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConnectedPanorama")(getConnectedPanorama)
    __obj.asInstanceOf[IPanoramaGraphNode]
  }
}

