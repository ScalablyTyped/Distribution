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
    getEdges: js.Function0[js.Array[IPanoramaGraphEdge]],
    getNodes: js.Function0[js.Array[IPanoramaGraphEdge]],
    getPanorama: js.Function0[IPanorama]
  ): IPanoramaGraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEdges")(getEdges)
    __obj.updateDynamic("getNodes")(getNodes)
    __obj.updateDynamic("getPanorama")(getPanorama)
    __obj.asInstanceOf[IPanoramaGraph]
  }
}

