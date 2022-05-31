package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.ICircleGeometry
import typings.yandexMaps.mod.ILineStringGeometry
import typings.yandexMaps.mod.IPolygonGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryEditor {
  
  @JSGlobal("ymaps.geometryEditor.Circle")
  @js.native
  class Circle protected ()
    extends typings.yandexMaps.mod.geometryEditor.Circle {
    def this(geometry: ICircleGeometry) = this()
    def this(geometry: ICircleGeometry, options: js.Object) = this()
  }
  
  @JSGlobal("ymaps.geometryEditor.LineString")
  @js.native
  class LineString protected ()
    extends typings.yandexMaps.mod.geometryEditor.LineString {
    def this(geometry: ILineStringGeometry) = this()
    def this(geometry: ILineStringGeometry, options: js.Object) = this()
  }
  
  @JSGlobal("ymaps.geometryEditor.Point")
  @js.native
  class Point ()
    extends typings.yandexMaps.mod.geometryEditor.Point
  
  @JSGlobal("ymaps.geometryEditor.Polygon")
  @js.native
  class Polygon protected ()
    extends typings.yandexMaps.mod.geometryEditor.Polygon {
    def this(geometry: IPolygonGeometry, options: js.Object) = this()
  }
  
  object model {
    
    @JSGlobal("ymaps.geometryEditor.model.ChildLineString")
    @js.native
    class ChildLineString ()
      extends typings.yandexMaps.mod.geometryEditor.model.ChildLineString
    
    @JSGlobal("ymaps.geometryEditor.model.ChildLinearRing")
    @js.native
    class ChildLinearRing ()
      extends typings.yandexMaps.mod.geometryEditor.model.ChildLinearRing
    
    @JSGlobal("ymaps.geometryEditor.model.ChildVertex")
    @js.native
    class ChildVertex ()
      extends typings.yandexMaps.mod.geometryEditor.model.ChildVertex
    
    @JSGlobal("ymaps.geometryEditor.model.Edge")
    @js.native
    class Edge ()
      extends typings.yandexMaps.mod.geometryEditor.model.Edge
    
    @JSGlobal("ymaps.geometryEditor.model.EdgeGeometry")
    @js.native
    class EdgeGeometry ()
      extends typings.yandexMaps.mod.geometryEditor.model.EdgeGeometry
    
    @JSGlobal("ymaps.geometryEditor.model.RootLineString")
    @js.native
    class RootLineString ()
      extends typings.yandexMaps.mod.geometryEditor.model.RootLineString
    
    @JSGlobal("ymaps.geometryEditor.model.RootPolygon")
    @js.native
    class RootPolygon ()
      extends typings.yandexMaps.mod.geometryEditor.model.RootPolygon
  }
  
  object view {
    
    @JSGlobal("ymaps.geometryEditor.view.Edge")
    @js.native
    class Edge ()
      extends typings.yandexMaps.mod.geometryEditor.view.Edge
    
    @JSGlobal("ymaps.geometryEditor.view.MultiPath")
    @js.native
    class MultiPath ()
      extends typings.yandexMaps.mod.geometryEditor.view.MultiPath
    
    @JSGlobal("ymaps.geometryEditor.view.Path")
    @js.native
    class Path ()
      extends typings.yandexMaps.mod.geometryEditor.view.Path
    
    @JSGlobal("ymaps.geometryEditor.view.Vertex")
    @js.native
    class Vertex ()
      extends typings.yandexMaps.mod.geometryEditor.view.Vertex
  }
}
