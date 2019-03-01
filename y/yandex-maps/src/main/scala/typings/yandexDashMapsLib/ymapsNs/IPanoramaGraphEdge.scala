package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaGraphEdge extends js.Object {
  def getEndNodes(): js.Array[IPanoramaGraphNode]
}

object IPanoramaGraphEdge {
  @scala.inline
  def apply(getEndNodes: js.Function0[js.Array[IPanoramaGraphNode]]): IPanoramaGraphEdge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEndNodes")(getEndNodes)
    __obj.asInstanceOf[IPanoramaGraphEdge]
  }
}

