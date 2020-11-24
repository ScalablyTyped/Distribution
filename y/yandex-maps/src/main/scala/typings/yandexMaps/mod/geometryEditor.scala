package typings.yandexMaps.mod

import typings.yandexMaps.mod.geometryEditor.model.RootLineString
import typings.yandexMaps.mod.geometryEditor.model.RootPolygon
import typings.yandexMaps.mod.geometryEditor.view.MultiPath
import typings.yandexMaps.mod.geometryEditor.view.Path
import typings.yandexMaps.mod.vow.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "geometryEditor")
@js.native
object geometryEditor extends js.Object {
  
  @js.native
  class Circle protected () extends IGeometryEditor {
    def this(geometry: ICircleGeometry) = this()
    def this(geometry: ICircleGeometry, options: js.Object) = this()
    
    def startDrawing(): Promise = js.native
    
    def stopDrawing(): Promise = js.native
  }
  
  @js.native
  class LineString protected () extends IGeometryEditor {
    def this(geometry: ILineStringGeometry) = this()
    def this(geometry: ILineStringGeometry, options: js.Object) = this()
    
    def getModel(): Promise = js.native
    
    def getModelSync(): RootLineString | Null = js.native
    
    def getView(): Promise = js.native
    
    def getViewSync(): Path | Null = js.native
    
    def startDrawing(): Promise = js.native
    
    def startFraming(): Promise = js.native
    
    def stopDrawing(): Unit = js.native
    
    def stopFraming(): Unit = js.native
  }
  
  @js.native
  class Point () extends IGeometryEditor {
    
    def startDrawing(): Promise = js.native
    
    def stopDrawing(): Promise = js.native
  }
  
  @js.native
  class Polygon protected () extends IGeometryEditor {
    def this(geometry: IPolygonGeometry, options: js.Object) = this()
    
    def getModel(): Promise = js.native
    
    def getModelSync(): RootPolygon | Null = js.native
    
    def getView(): Promise = js.native
    
    def getViewSync(): MultiPath | Null = js.native
    
    def startDrawing(): Promise = js.native
    
    def startFraming(): Promise = js.native
    
    def stopDrawing(): Unit = js.native
    
    def stopFraming(): Unit = js.native
  }
  
  @js.native
  object model extends js.Object {
    
    @js.native
    class ChildLineString () extends IGeometryEditorChildModel {
      
      def getAllVerticesNumber(): Double = js.native
      
      def getEdgeModels(): js.Array[Edge] = js.native
      
      def getIndex(): Double = js.native
      
      def getVertexModels(): js.Array[ChildVertex] = js.native
      
      def setIndex(index: Double): Unit = js.native
      
      def spliceVertices(start: Double, deleteCount: Double): js.Array[js.Array[Double]] = js.native
    }
    
    @js.native
    class ChildLinearRing () extends ChildLineString
    
    @js.native
    class ChildVertex () extends IGeometryEditorChildModel {
      
      def getAllVerticesNumber(): Double = js.native
      
      def getIndex(): Double = js.native
      
      def getNextVertex(): ChildVertex | Null = js.native
      
      def getPrevVertex(): ChildVertex | Null = js.native
      
      def setGlobalPixels(pixels: js.Array[Double]): Unit = js.native
      
      def setIndex(index: Double): Unit = js.native
      
      def setNextVertex(nextVertex: ChildVertex): Unit = js.native
      
      def setPrevVertex(prevVertex: ChildVertex): Unit = js.native
    }
    
    @js.native
    class Edge () extends IGeometryEditorModel {
      
      def getNextVertex(): ChildVertex | Null = js.native
      
      def getPrevVertex(): ChildVertex | Null = js.native
      
      def setNextVertex(nextVertex: ChildVertex): Unit = js.native
      
      def setPrevVertex(prevVertex: ChildVertex): Unit = js.native
    }
    
    @js.native
    class EdgeGeometry () extends IGeometry
    
    @js.native
    class RootLineString () extends IGeometryEditorModel {
      
      def getAllVerticesNumber(): Double = js.native
      
      def getVertexModels(): js.Array[ChildVertex] = js.native
      
      def spliceVertices(start: Double, deleteCount: Double): js.Array[js.Array[Double]] = js.native
    }
    
    @js.native
    class RootPolygon () extends IGeometryEditorModel {
      
      def getAllVerticesNumber(): Double = js.native
      
      def getPathModels(): js.Array[ChildLinearRing] = js.native
      
      def splicePaths(start: Double, deleteCount: Double): js.Array[js.Array[Double]] = js.native
    }
  }
  
  @js.native
  object view extends js.Object {
    
    @js.native
    class Edge () extends js.Object {
      
      def getPlacemark(): GeoObject_[IGeometry, js.Object] = js.native
    }
    
    @js.native
    class MultiPath () extends js.Object {
      
      def getEdgePlacemarks(): GeoObjectCollection = js.native
      
      def getPathViews(): js.Array[Path] = js.native
      
      def getVertexPlacemarks(): GeoObjectCollection = js.native
    }
    
    @js.native
    class Path () extends js.Object {
      
      def getEdgePlacemarks(): GeoObjectCollection = js.native
      
      def getEdgeViews(): js.Array[Edge] = js.native
      
      def getVertexPlacemarks(): GeoObjectCollection = js.native
      
      def getVertexViews(): js.Array[Vertex] = js.native
    }
    
    @js.native
    class Vertex () extends js.Object {
      
      def getPlacemark(): GeoObject_[IGeometry, js.Object] = js.native
    }
  }
}
