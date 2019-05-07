package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaGraphNode extends js.Object {
  def getConnectedPanorama(): js.Promise[IPanorama]
}

object IPanoramaGraphNode {
  @scala.inline
  def apply(getConnectedPanorama: () => js.Promise[IPanorama]): IPanoramaGraphNode = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama))
  
    __obj.asInstanceOf[IPanoramaGraphNode]
  }
}

