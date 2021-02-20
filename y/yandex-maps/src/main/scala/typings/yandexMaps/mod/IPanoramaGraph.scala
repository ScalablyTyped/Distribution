package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaGraph extends StObject {
  
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
  implicit class IPanoramaGraphMutableBuilder[Self <: IPanoramaGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEdges(value: () => js.Array[IPanoramaGraphEdge]): Self = StObject.set(x, "getEdges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodes(value: () => js.Array[IPanoramaGraphEdge]): Self = StObject.set(x, "getNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanorama(value: () => IPanorama): Self = StObject.set(x, "getPanorama", js.Any.fromFunction0(value))
  }
}
