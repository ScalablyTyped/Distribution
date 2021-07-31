package typings.yandexMaps.mod

import typings.yandexMaps.mod.geometryEditor.model.RootLineString
import typings.yandexMaps.mod.geometryEditor.model.RootPolygon
import typings.yandexMaps.mod.geometryEditor.view.MultiPath
import typings.yandexMaps.mod.geometryEditor.view.Path
import typings.yandexMaps.mod.vow.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryEditor {
  
  @JSImport("yandex-maps", "geometryEditor.Circle")
  @js.native
  class Circle protected ()
    extends StObject
       with IGeometryEditor {
    def this(geometry: ICircleGeometry) = this()
    def this(geometry: ICircleGeometry, options: js.Object) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    var geometry: IGeometry = js.native
    
    /* CompleteClass */
    var options: IOptionManager = js.native
    
    def startDrawing(): Promise = js.native
    
    /* CompleteClass */
    override def startEditing(): Unit = js.native
    
    /* CompleteClass */
    var state: IDataManager = js.native
    
    def stopDrawing(): Promise = js.native
    
    /* CompleteClass */
    override def stopEditing(): Unit = js.native
  }
  
  @JSImport("yandex-maps", "geometryEditor.LineString")
  @js.native
  class LineString protected ()
    extends StObject
       with IGeometryEditor {
    def this(geometry: ILineStringGeometry) = this()
    def this(geometry: ILineStringGeometry, options: js.Object) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    var geometry: IGeometry = js.native
    
    def getModel(): Promise = js.native
    
    def getModelSync(): RootLineString | Null = js.native
    
    def getView(): Promise = js.native
    
    def getViewSync(): Path | Null = js.native
    
    /* CompleteClass */
    var options: IOptionManager = js.native
    
    def startDrawing(): Promise = js.native
    
    /* CompleteClass */
    override def startEditing(): Unit = js.native
    
    def startFraming(): Promise = js.native
    
    /* CompleteClass */
    var state: IDataManager = js.native
    
    def stopDrawing(): Unit = js.native
    
    /* CompleteClass */
    override def stopEditing(): Unit = js.native
    
    def stopFraming(): Unit = js.native
  }
  
  @JSImport("yandex-maps", "geometryEditor.Point")
  @js.native
  class Point ()
    extends StObject
       with IGeometryEditor {
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    var geometry: IGeometry = js.native
    
    /* CompleteClass */
    var options: IOptionManager = js.native
    
    def startDrawing(): Promise = js.native
    
    /* CompleteClass */
    override def startEditing(): Unit = js.native
    
    /* CompleteClass */
    var state: IDataManager = js.native
    
    def stopDrawing(): Promise = js.native
    
    /* CompleteClass */
    override def stopEditing(): Unit = js.native
  }
  
  @JSImport("yandex-maps", "geometryEditor.Polygon")
  @js.native
  class Polygon protected ()
    extends StObject
       with IGeometryEditor {
    def this(geometry: IPolygonGeometry, options: js.Object) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    var geometry: IGeometry = js.native
    
    def getModel(): Promise = js.native
    
    def getModelSync(): RootPolygon | Null = js.native
    
    def getView(): Promise = js.native
    
    def getViewSync(): MultiPath | Null = js.native
    
    /* CompleteClass */
    var options: IOptionManager = js.native
    
    def startDrawing(): Promise = js.native
    
    /* CompleteClass */
    override def startEditing(): Unit = js.native
    
    def startFraming(): Promise = js.native
    
    /* CompleteClass */
    var state: IDataManager = js.native
    
    def stopDrawing(): Unit = js.native
    
    /* CompleteClass */
    override def stopEditing(): Unit = js.native
    
    def stopFraming(): Unit = js.native
  }
  
  object model {
    
    @JSImport("yandex-maps", "geometryEditor.model.ChildLineString")
    @js.native
    class ChildLineString ()
      extends StObject
         with IGeometryEditorChildModel {
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      var editor: IGeometryEditor = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      var geometry: IBaseGeometry = js.native
      
      def getAllVerticesNumber(): Double = js.native
      
      def getEdgeModels(): js.Array[Edge] = js.native
      
      def getIndex(): Double = js.native
      
      /* CompleteClass */
      override def getParent(): IGeometryEditorModel = js.native
      
      /* CompleteClass */
      override def getPixels(): js.Array[Double] = js.native
      
      def getVertexModels(): js.Array[ChildVertex] = js.native
      
      def setIndex(index: Double): Unit = js.native
      
      /* CompleteClass */
      override def setPixels(pixels: js.Array[Double]): Unit = js.native
      
      def spliceVertices(start: Double, deleteCount: Double): js.Array[js.Array[Double]] = js.native
    }
    
    @JSImport("yandex-maps", "geometryEditor.model.ChildLinearRing")
    @js.native
    class ChildLinearRing () extends ChildLineString
    
    @JSImport("yandex-maps", "geometryEditor.model.ChildVertex")
    @js.native
    class ChildVertex ()
      extends StObject
         with IGeometryEditorChildModel {
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      var editor: IGeometryEditor = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      var geometry: IBaseGeometry = js.native
      
      def getAllVerticesNumber(): Double = js.native
      
      def getIndex(): Double = js.native
      
      def getNextVertex(): ChildVertex | Null = js.native
      
      /* CompleteClass */
      override def getParent(): IGeometryEditorModel = js.native
      
      /* CompleteClass */
      override def getPixels(): js.Array[Double] = js.native
      
      def getPrevVertex(): ChildVertex | Null = js.native
      
      def setGlobalPixels(pixels: js.Array[Double]): Unit = js.native
      
      def setIndex(index: Double): Unit = js.native
      
      def setNextVertex(nextVertex: ChildVertex): Unit = js.native
      
      /* CompleteClass */
      override def setPixels(pixels: js.Array[Double]): Unit = js.native
      
      def setPrevVertex(prevVertex: ChildVertex): Unit = js.native
    }
    
    @JSImport("yandex-maps", "geometryEditor.model.Edge")
    @js.native
    class Edge ()
      extends StObject
         with IGeometryEditorModel {
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      def getNextVertex(): ChildVertex | Null = js.native
      
      /* CompleteClass */
      override def getPixels(): js.Array[Double] = js.native
      
      def getPrevVertex(): ChildVertex | Null = js.native
      
      def setNextVertex(nextVertex: ChildVertex): Unit = js.native
      
      def setPrevVertex(prevVertex: ChildVertex): Unit = js.native
    }
    
    @JSImport("yandex-maps", "geometryEditor.model.EdgeGeometry")
    @js.native
    class EdgeGeometry ()
      extends StObject
         with IGeometry {
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      
      /* CompleteClass */
      override def getType(): String = js.native
    }
    
    @JSImport("yandex-maps", "geometryEditor.model.RootLineString")
    @js.native
    class RootLineString ()
      extends StObject
         with IGeometryEditorModel {
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      def getAllVerticesNumber(): Double = js.native
      
      /* CompleteClass */
      override def getPixels(): js.Array[Double] = js.native
      
      def getVertexModels(): js.Array[ChildVertex] = js.native
      
      def spliceVertices(start: Double, deleteCount: Double): js.Array[js.Array[Double]] = js.native
    }
    
    @JSImport("yandex-maps", "geometryEditor.model.RootPolygon")
    @js.native
    class RootPolygon ()
      extends StObject
         with IGeometryEditorModel {
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      def getAllVerticesNumber(): Double = js.native
      
      def getPathModels(): js.Array[ChildLinearRing] = js.native
      
      /* CompleteClass */
      override def getPixels(): js.Array[Double] = js.native
      
      def splicePaths(start: Double, deleteCount: Double): js.Array[js.Array[Double]] = js.native
    }
  }
  
  object view {
    
    @JSImport("yandex-maps", "geometryEditor.view.Edge")
    @js.native
    class Edge () extends StObject {
      
      def getPlacemark(): GeoObject_[IGeometry, js.Object] = js.native
    }
    
    @JSImport("yandex-maps", "geometryEditor.view.MultiPath")
    @js.native
    class MultiPath () extends StObject {
      
      def getEdgePlacemarks(): GeoObjectCollection = js.native
      
      def getPathViews(): js.Array[Path] = js.native
      
      def getVertexPlacemarks(): GeoObjectCollection = js.native
    }
    
    @JSImport("yandex-maps", "geometryEditor.view.Path")
    @js.native
    class Path () extends StObject {
      
      def getEdgePlacemarks(): GeoObjectCollection = js.native
      
      def getEdgeViews(): js.Array[Edge] = js.native
      
      def getVertexPlacemarks(): GeoObjectCollection = js.native
      
      def getVertexViews(): js.Array[Vertex] = js.native
    }
    
    @JSImport("yandex-maps", "geometryEditor.view.Vertex")
    @js.native
    class Vertex () extends StObject {
      
      def getPlacemark(): GeoObject_[IGeometry, js.Object] = js.native
    }
  }
}
