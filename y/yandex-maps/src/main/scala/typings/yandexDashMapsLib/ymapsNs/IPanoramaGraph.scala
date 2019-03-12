package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaGraph extends js.Object {
  def getEdges(): js.Array[IPanoramaGraphEdge]
  def getNodes(): js.Array[IPanoramaGraphEdge]
  def getPanorama(): IPanorama
}

object IPanoramaGraph {
  @scala.inline
  def apply(
    getEdges: () => js.Array[IPanoramaGraphEdge],
    getNodes: () => js.Array[IPanoramaGraphEdge],
    getPanorama: () => IPanorama
  ): IPanoramaGraph = {
    val __obj = js.Dynamic.literal(getEdges = js.Any.fromFunction0(getEdges), getNodes = js.Any.fromFunction0(getNodes), getPanorama = js.Any.fromFunction0(getPanorama))
  
    __obj.asInstanceOf[IPanoramaGraph]
  }
}

