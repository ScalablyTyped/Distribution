package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaGraphEdge extends StObject {
  
  def getEndNodes(): js.Array[IPanoramaGraphNode]
}
object IPanoramaGraphEdge {
  
  inline def apply(getEndNodes: () => js.Array[IPanoramaGraphNode]): IPanoramaGraphEdge = {
    val __obj = js.Dynamic.literal(getEndNodes = js.Any.fromFunction0(getEndNodes))
    __obj.asInstanceOf[IPanoramaGraphEdge]
  }
  
  extension [Self <: IPanoramaGraphEdge](x: Self) {
    
    inline def setGetEndNodes(value: () => js.Array[IPanoramaGraphNode]): Self = StObject.set(x, "getEndNodes", js.Any.fromFunction0(value))
  }
}
