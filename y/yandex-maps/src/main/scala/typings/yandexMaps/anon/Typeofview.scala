package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import typings.yandexMaps.mod.geometryEditor.view.Edge
import typings.yandexMaps.mod.geometryEditor.view.MultiPath
import typings.yandexMaps.mod.geometryEditor.view.Path
import typings.yandexMaps.mod.geometryEditor.view.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofview extends StObject {
  
  var Edge: Instantiable0[typings.yandexMaps.mod.geometryEditor.view.Edge]
  
  var MultiPath: Instantiable0[typings.yandexMaps.mod.geometryEditor.view.MultiPath]
  
  var Path: Instantiable0[typings.yandexMaps.mod.geometryEditor.view.Path]
  
  var Vertex: Instantiable0[typings.yandexMaps.mod.geometryEditor.view.Vertex]
}
object Typeofview {
  
  inline def apply(
    Edge: Instantiable0[Edge],
    MultiPath: Instantiable0[MultiPath],
    Path: Instantiable0[Path],
    Vertex: Instantiable0[Vertex]
  ): Typeofview = {
    val __obj = js.Dynamic.literal(Edge = Edge.asInstanceOf[js.Any], MultiPath = MultiPath.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Vertex = Vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofview]
  }
  
  extension [Self <: Typeofview](x: Self) {
    
    inline def setEdge(value: Instantiable0[Edge]): Self = StObject.set(x, "Edge", value.asInstanceOf[js.Any])
    
    inline def setMultiPath(value: Instantiable0[MultiPath]): Self = StObject.set(x, "MultiPath", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Instantiable0[Path]): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setVertex(value: Instantiable0[Vertex]): Self = StObject.set(x, "Vertex", value.asInstanceOf[js.Any])
  }
}
