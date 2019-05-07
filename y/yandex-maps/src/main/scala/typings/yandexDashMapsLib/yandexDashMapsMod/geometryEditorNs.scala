package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "geometryEditor")
@js.native
object geometryEditorNs extends js.Object {
  @js.native
  class Circle protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditor {
    def this(geometry: yandexDashMapsLib.yandexDashMapsMod.ICircleGeometry) = this()
    def this(geometry: yandexDashMapsLib.yandexDashMapsMod.ICircleGeometry, options: js.Object) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override var geometry: yandexDashMapsLib.yandexDashMapsMod.IGeometry = js.native
    /* CompleteClass */
    override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    /* CompleteClass */
    override var state: yandexDashMapsLib.yandexDashMapsMod.IDataManager = js.native
    def startDrawing(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    /* CompleteClass */
    override def startEditing(): scala.Unit = js.native
    def stopDrawing(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    /* CompleteClass */
    override def stopEditing(): scala.Unit = js.native
  }
  
  @js.native
  class LineString protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditor {
    def this(geometry: yandexDashMapsLib.yandexDashMapsMod.ILineStringGeometry) = this()
    def this(geometry: yandexDashMapsLib.yandexDashMapsMod.ILineStringGeometry, options: js.Object) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override var geometry: yandexDashMapsLib.yandexDashMapsMod.IGeometry = js.native
    /* CompleteClass */
    override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    /* CompleteClass */
    override var state: yandexDashMapsLib.yandexDashMapsMod.IDataManager = js.native
    def getModel(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    def getModelSync(): yandexDashMapsLib.yandexDashMapsMod.geometryEditorNs.modelNs.RootLineString | scala.Null = js.native
    def getView(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    def getViewSync(): yandexDashMapsLib.yandexDashMapsMod.geometryEditorNs.viewNs.Path | scala.Null = js.native
    def startDrawing(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    /* CompleteClass */
    override def startEditing(): scala.Unit = js.native
    def startFraming(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    def stopDrawing(): scala.Unit = js.native
    /* CompleteClass */
    override def stopEditing(): scala.Unit = js.native
    def stopFraming(): scala.Unit = js.native
  }
  
  @js.native
  class Point ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditor {
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override var geometry: yandexDashMapsLib.yandexDashMapsMod.IGeometry = js.native
    /* CompleteClass */
    override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    /* CompleteClass */
    override var state: yandexDashMapsLib.yandexDashMapsMod.IDataManager = js.native
    def startDrawing(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    /* CompleteClass */
    override def startEditing(): scala.Unit = js.native
    def stopDrawing(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    /* CompleteClass */
    override def stopEditing(): scala.Unit = js.native
  }
  
  @js.native
  class Polygon protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditor {
    def this(geometry: yandexDashMapsLib.yandexDashMapsMod.IPolygonGeometry, options: js.Object) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override var geometry: yandexDashMapsLib.yandexDashMapsMod.IGeometry = js.native
    /* CompleteClass */
    override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    /* CompleteClass */
    override var state: yandexDashMapsLib.yandexDashMapsMod.IDataManager = js.native
    def getModel(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    def getModelSync(): yandexDashMapsLib.yandexDashMapsMod.geometryEditorNs.modelNs.RootPolygon | scala.Null = js.native
    def getView(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    def getViewSync(): yandexDashMapsLib.yandexDashMapsMod.geometryEditorNs.viewNs.MultiPath | scala.Null = js.native
    def startDrawing(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    /* CompleteClass */
    override def startEditing(): scala.Unit = js.native
    def startFraming(): yandexDashMapsLib.yandexDashMapsMod.vowNs.Promise = js.native
    def stopDrawing(): scala.Unit = js.native
    /* CompleteClass */
    override def stopEditing(): scala.Unit = js.native
    def stopFraming(): scala.Unit = js.native
  }
  
  @JSName("model")
  @js.native
  object modelNs extends js.Object {
    @js.native
    class ChildLineString ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditorChildModel {
      /* CompleteClass */
      override var editor: yandexDashMapsLib.yandexDashMapsMod.IGeometryEditor = js.native
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override var geometry: yandexDashMapsLib.yandexDashMapsMod.IBaseGeometry = js.native
      /* CompleteClass */
      override def destroy(): scala.Unit = js.native
      def getAllVerticesNumber(): scala.Double = js.native
      def getEdgeModels(): js.Array[Edge] = js.native
      def getIndex(): scala.Double = js.native
      /* CompleteClass */
      override def getParent(): yandexDashMapsLib.yandexDashMapsMod.IGeometryEditorModel = js.native
      /* CompleteClass */
      override def getPixels(): js.Array[scala.Double] = js.native
      def getVertexModels(): js.Array[ChildVertex] = js.native
      def setIndex(index: scala.Double): scala.Unit = js.native
      /* CompleteClass */
      override def setPixels(pixels: js.Array[scala.Double]): scala.Unit = js.native
      def spliceVertices(start: scala.Double, deleteCount: scala.Double): js.Array[js.Array[scala.Double]] = js.native
    }
    
    @js.native
    class ChildLinearRing () extends ChildLineString
    
    @js.native
    class ChildVertex ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditorChildModel {
      /* CompleteClass */
      override var editor: yandexDashMapsLib.yandexDashMapsMod.IGeometryEditor = js.native
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override var geometry: yandexDashMapsLib.yandexDashMapsMod.IBaseGeometry = js.native
      /* CompleteClass */
      override def destroy(): scala.Unit = js.native
      def getAllVerticesNumber(): scala.Double = js.native
      def getIndex(): scala.Double = js.native
      def getNextVertex(): ChildVertex | scala.Null = js.native
      /* CompleteClass */
      override def getParent(): yandexDashMapsLib.yandexDashMapsMod.IGeometryEditorModel = js.native
      /* CompleteClass */
      override def getPixels(): js.Array[scala.Double] = js.native
      def getPrevVertex(): ChildVertex | scala.Null = js.native
      def setGlobalPixels(pixels: js.Array[scala.Double]): scala.Unit = js.native
      def setIndex(index: scala.Double): scala.Unit = js.native
      def setNextVertex(nextVertex: ChildVertex): scala.Unit = js.native
      /* CompleteClass */
      override def setPixels(pixels: js.Array[scala.Double]): scala.Unit = js.native
      def setPrevVertex(prevVertex: ChildVertex): scala.Unit = js.native
    }
    
    @js.native
    class Edge ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditorRootModel {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override def destroy(): scala.Unit = js.native
      def getNextVertex(): ChildVertex | scala.Null = js.native
      /* CompleteClass */
      override def getPixels(): js.Array[scala.Double] = js.native
      def getPrevVertex(): ChildVertex | scala.Null = js.native
      def setNextVertex(nextVertex: ChildVertex): scala.Unit = js.native
      def setPrevVertex(prevVertex: ChildVertex): scala.Unit = js.native
    }
    
    @js.native
    class EdgeGeometry ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeometry {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null = js.native
      /* CompleteClass */
      override def getType(): java.lang.String = js.native
    }
    
    @js.native
    class RootLineString ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditorRootModel {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override def destroy(): scala.Unit = js.native
      def getAllVerticesNumber(): scala.Double = js.native
      /* CompleteClass */
      override def getPixels(): js.Array[scala.Double] = js.native
      def getVertexModels(): js.Array[ChildVertex] = js.native
      def spliceVertices(start: scala.Double, deleteCount: scala.Double): js.Array[js.Array[scala.Double]] = js.native
    }
    
    @js.native
    class RootPolygon ()
      extends yandexDashMapsLib.yandexDashMapsMod.IGeometryEditorRootModel {
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override def destroy(): scala.Unit = js.native
      def getAllVerticesNumber(): scala.Double = js.native
      def getPathModels(): js.Array[ChildLinearRing] = js.native
      /* CompleteClass */
      override def getPixels(): js.Array[scala.Double] = js.native
      def splicePaths(start: scala.Double, deleteCount: scala.Double): js.Array[js.Array[scala.Double]] = js.native
    }
    
  }
  
  @JSName("view")
  @js.native
  object viewNs extends js.Object {
    @js.native
    class Edge () extends js.Object {
      def getPlacemark(): yandexDashMapsLib.yandexDashMapsMod.GeoObject = js.native
    }
    
    @js.native
    class MultiPath () extends js.Object {
      def getEdgePlacemarks(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
      def getPathViews(): js.Array[Path] = js.native
      def getVertexPlacemarks(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
    }
    
    @js.native
    class Path () extends js.Object {
      def getEdgePlacemarks(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
      def getEdgeViews(): js.Array[Edge] = js.native
      def getVertexPlacemarks(): yandexDashMapsLib.yandexDashMapsMod.GeoObjectCollection = js.native
      def getVertexViews(): js.Array[Vertex] = js.native
    }
    
    @js.native
    class Vertex () extends js.Object {
      def getPlacemark(): yandexDashMapsLib.yandexDashMapsMod.GeoObject = js.native
    }
    
  }
  
}

