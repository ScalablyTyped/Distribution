package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaGraph extends js.Object {
  
  def getEdges(): js.Array[IPanoramaGraphEdge] = js.native
  
  def getNodes(): js.Array[IPanoramaGraphEdge] = js.native
  
  def getPanorama(): IPanorama = js.native
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
  
  @scala.inline
  implicit class IPanoramaGraphOps[Self <: IPanoramaGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetEdges(value: () => js.Array[IPanoramaGraphEdge]): Self = this.set("getEdges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodes(value: () => js.Array[IPanoramaGraphEdge]): Self = this.set("getNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanorama(value: () => IPanorama): Self = this.set("getPanorama", js.Any.fromFunction0(value))
  }
}
