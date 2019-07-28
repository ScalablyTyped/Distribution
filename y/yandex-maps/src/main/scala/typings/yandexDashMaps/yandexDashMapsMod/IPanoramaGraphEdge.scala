package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaGraphEdge extends js.Object {
  def getEndNodes(): js.Array[IPanoramaGraphNode]
}

object IPanoramaGraphEdge {
  @scala.inline
  def apply(getEndNodes: () => js.Array[IPanoramaGraphNode]): IPanoramaGraphEdge = {
    val __obj = js.Dynamic.literal(getEndNodes = js.Any.fromFunction0(getEndNodes))
  
    __obj.asInstanceOf[IPanoramaGraphEdge]
  }
}

