package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaGraphNode extends StObject {
  
  def getConnectedPanorama(): js.Promise[IPanorama]
}
object IPanoramaGraphNode {
  
  inline def apply(getConnectedPanorama: () => js.Promise[IPanorama]): IPanoramaGraphNode = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama))
    __obj.asInstanceOf[IPanoramaGraphNode]
  }
  
  extension [Self <: IPanoramaGraphNode](x: Self) {
    
    inline def setGetConnectedPanorama(value: () => js.Promise[IPanorama]): Self = StObject.set(x, "getConnectedPanorama", js.Any.fromFunction0(value))
  }
}
