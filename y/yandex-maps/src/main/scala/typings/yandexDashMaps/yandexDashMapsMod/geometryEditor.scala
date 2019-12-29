package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.geometryEditor.model.RootLineString
import typings.yandexDashMaps.yandexDashMapsMod.geometryEditor.model.RootPolygon
import typings.yandexDashMaps.yandexDashMapsMod.geometryEditor.view.MultiPath
import typings.yandexDashMaps.yandexDashMapsMod.geometryEditor.view.Path
import typings.yandexDashMaps.yandexDashMapsMod.vow.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "geometryEditor")
@js.native
object geometryEditor extends js.Object {
  @js.native
  class Circle protected () extends IGeometryEditor {
    def this(geometry: ICircleGeometry) = this()
    def this(geometry: ICircleGeometry, options: js.Object) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override var geometry: IGeometry = js.native
    /* CompleteClass */
    override var options: IOptionManager = js.native
    /* CompleteClass */
    override var state: IDataManager = js.native
    def startDrawing(): Promise = js.native
    /* CompleteClass */
    override def startEditing(): Unit = js.native
    def stopDrawing(): Promise = js.native
    /* CompleteClass */
    override def stopEditing(): Unit = js.native
  }
  
  @js.native
  class LineString protected () extends IGeometryEditor {
    def this(geometry: ILineStringGeometry) = this()
    def this(geometry: ILineStringGeometry, options: js.Object) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override var geometry: IGeometry = js.native
    /* CompleteClass */
    override var options: IOptionManager = js.native
    /* CompleteClass */
    override var state: IDataManager = js.native
    def getModel(): Promise = js.native
    def getModelSync(): RootLineString | Null = js.native
    def getView(): Promise = js.native
    def getViewSync(): Path | Null = js.native
    def startDrawing(): Promise = js.native
    /* CompleteClass */
    override def startEditing(): Unit = js.native
    def startFraming(): Promise = js.native
    def stopDrawing(): Unit = js.native
    /* CompleteClass */
    override def stopEditing(): Unit = js.native
    def stopFraming(): Unit = js.native
  }
  
  @js.native
  class Point () extends IGeometryEditor {
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override var geometry: IGeometry = js.native
    /* CompleteClass */
    override var options: IOptionManager = js.native
    /* CompleteClass */
    override var state: IDataManager = js.native
    def startDrawing(): Promise = js.native
    /* CompleteClass */
    override def startEditing(): Unit = js.native
    def stopDrawing(): Promise = js.native
    /* CompleteClass */
    override def stopEditing(): Unit = js.native
  }
  
  @js.native
  class Polygon protected () extends IGeometryEditor {
    def this(geometry: IPolygonGeometry, options: js.Object) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override var geometry: IGeometry = js.native
    /* CompleteClass */
    override var options: IOptionManager = js.native
    /* CompleteClass */
    override var state: IDataManager = js.native
    def getModel(): Promise = js.native
    def getModelSync(): RootPolygon | Null = js.native
    def getView(): Promise = js.native
    def getViewSync(): MultiPath | Null = js.native
    def startDrawing(): Promise = js.native
    /* CompleteClass */
    override def startEditing(): Unit = js.native
    def startFraming(): Promise = js.native
    def stopDrawing(): Unit = js.native
    /* CompleteClass */
    override def stopEditing(): Unit = js.native
    def stopFraming(): Unit = js.native
  }
  
  @js.native
  object model extends js.Object {
    @js.native
    class ChildLineString () extends IGeometryEditorChildModel {
      /* CompleteClass */
      override var editor: IGeometryEditor = js.native
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override var geometry: IBaseGeometry = js.native
      /* CompleteClass */
      override def destroy(): Unit = js.native
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
    
    @js.native
    class ChildLinearRing () extends ChildLineString
    
    @js.native
    class ChildVertex () extends IGeometryEditorChildModel {
      /* CompleteClass */
      override var editor: IGeometryEditor = js.native
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override var geometry: IBaseGeometry = js.native
      /* CompleteClass */
      override def destroy(): Unit = js.native
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
    
    @js.native
    class Edge () extends IGeometryEditorModel {
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override def destroy(): Unit = js.native
      def getNextVertex(): ChildVertex | Null = js.native
      /* CompleteClass */
      override def getPixels(): js.Array[Double] = js.native
      def getPrevVertex(): ChildVertex | Null = js.native
      def setNextVertex(nextVertex: ChildVertex): Unit = js.native
      def setPrevVertex(prevVertex: ChildVertex): Unit = js.native
    }
    
    @js.native
    class EdgeGeometry () extends IGeometry {
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[Double]] | Null = js.native
      /* CompleteClass */
      override def getType(): String = js.native
    }
    
    @js.native
    class RootLineString () extends IGeometryEditorModel {
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override def destroy(): Unit = js.native
      def getAllVerticesNumber(): Double = js.native
      /* CompleteClass */
      override def getPixels(): js.Array[Double] = js.native
      def getVertexModels(): js.Array[ChildVertex] = js.native
      def spliceVertices(start: Double, deleteCount: Double): js.Array[js.Array[Double]] = js.native
    }
    
    @js.native
    class RootPolygon () extends IGeometryEditorModel {
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override def destroy(): Unit = js.native
      def getAllVerticesNumber(): Double = js.native
      def getPathModels(): js.Array[ChildLinearRing] = js.native
      /* CompleteClass */
      override def getPixels(): js.Array[Double] = js.native
      def splicePaths(start: Double, deleteCount: Double): js.Array[js.Array[Double]] = js.native
    }
    
  }
  
  @js.native
  object view extends js.Object {
    @js.native
    class Edge () extends js.Object {
      def getPlacemark(): GeoObject = js.native
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
      def getPlacemark(): GeoObject = js.native
    }
    
  }
  
}

