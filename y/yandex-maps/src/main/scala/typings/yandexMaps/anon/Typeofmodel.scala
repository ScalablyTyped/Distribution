package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import typings.yandexMaps.mod.geometryEditor.model.ChildLineString
import typings.yandexMaps.mod.geometryEditor.model.ChildLinearRing
import typings.yandexMaps.mod.geometryEditor.model.ChildVertex
import typings.yandexMaps.mod.geometryEditor.model.Edge
import typings.yandexMaps.mod.geometryEditor.model.EdgeGeometry
import typings.yandexMaps.mod.geometryEditor.model.RootLineString
import typings.yandexMaps.mod.geometryEditor.model.RootPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofmodel extends StObject {
  
  var ChildLineString: Instantiable0[typings.yandexMaps.mod.geometryEditor.model.ChildLineString]
  
  var ChildLinearRing: Instantiable0[typings.yandexMaps.mod.geometryEditor.model.ChildLinearRing]
  
  var ChildVertex: Instantiable0[typings.yandexMaps.mod.geometryEditor.model.ChildVertex]
  
  var Edge: Instantiable0[typings.yandexMaps.mod.geometryEditor.model.Edge]
  
  var EdgeGeometry: Instantiable0[typings.yandexMaps.mod.geometryEditor.model.EdgeGeometry]
  
  var RootLineString: Instantiable0[typings.yandexMaps.mod.geometryEditor.model.RootLineString]
  
  var RootPolygon: Instantiable0[typings.yandexMaps.mod.geometryEditor.model.RootPolygon]
}
object Typeofmodel {
  
  inline def apply(
    ChildLineString: Instantiable0[ChildLineString],
    ChildLinearRing: Instantiable0[ChildLinearRing],
    ChildVertex: Instantiable0[ChildVertex],
    Edge: Instantiable0[Edge],
    EdgeGeometry: Instantiable0[EdgeGeometry],
    RootLineString: Instantiable0[RootLineString],
    RootPolygon: Instantiable0[RootPolygon]
  ): Typeofmodel = {
    val __obj = js.Dynamic.literal(ChildLineString = ChildLineString.asInstanceOf[js.Any], ChildLinearRing = ChildLinearRing.asInstanceOf[js.Any], ChildVertex = ChildVertex.asInstanceOf[js.Any], Edge = Edge.asInstanceOf[js.Any], EdgeGeometry = EdgeGeometry.asInstanceOf[js.Any], RootLineString = RootLineString.asInstanceOf[js.Any], RootPolygon = RootPolygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmodel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofmodel] (val x: Self) extends AnyVal {
    
    inline def setChildLineString(value: Instantiable0[ChildLineString]): Self = StObject.set(x, "ChildLineString", value.asInstanceOf[js.Any])
    
    inline def setChildLinearRing(value: Instantiable0[ChildLinearRing]): Self = StObject.set(x, "ChildLinearRing", value.asInstanceOf[js.Any])
    
    inline def setChildVertex(value: Instantiable0[ChildVertex]): Self = StObject.set(x, "ChildVertex", value.asInstanceOf[js.Any])
    
    inline def setEdge(value: Instantiable0[Edge]): Self = StObject.set(x, "Edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeGeometry(value: Instantiable0[EdgeGeometry]): Self = StObject.set(x, "EdgeGeometry", value.asInstanceOf[js.Any])
    
    inline def setRootLineString(value: Instantiable0[RootLineString]): Self = StObject.set(x, "RootLineString", value.asInstanceOf[js.Any])
    
    inline def setRootPolygon(value: Instantiable0[RootPolygon]): Self = StObject.set(x, "RootPolygon", value.asInstanceOf[js.Any])
  }
}
