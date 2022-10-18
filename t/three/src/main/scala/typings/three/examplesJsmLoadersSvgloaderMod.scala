package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLDocument
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Shape
import typings.three.srcThreeMod.ShapePath
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersSvgloaderMod {
  
  @JSImport("three/examples/jsm/loaders/SVGLoader", "SVGLoader")
  @js.native
  open class SVGLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var defaultDPI: Double = js.native
    
    var defaultUnit: String = js.native
    
    def load(url: String, onLoad: js.Function1[/* data */ SVGResult, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* data */ SVGResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* data */ SVGResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* data */ SVGResult, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(text: String): SVGResult = js.native
  }
  /* static members */
  object SVGLoader {
    
    @JSImport("three/examples/jsm/loaders/SVGLoader", "SVGLoader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createShapes(shapePath: ShapePath): js.Array[Shape] = ^.asInstanceOf[js.Dynamic].applyDynamic("createShapes")(shapePath.asInstanceOf[js.Any]).asInstanceOf[js.Array[Shape]]
    
    inline def getStrokeStyle(): StrokeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")().asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double): StrokeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any]).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: String, lineJoin: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: String, lineJoin: String, lineCap: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: String, lineJoin: String, lineCap: String, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: String, lineJoin: String, lineCap: Unit, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: String, lineJoin: Unit, lineCap: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: String, lineJoin: Unit, lineCap: String, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: String, lineJoin: Unit, lineCap: Unit, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: Unit, lineJoin: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: Unit, lineJoin: String, lineCap: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: Unit, lineJoin: String, lineCap: String, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: Unit, lineJoin: String, lineCap: Unit, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: Unit, lineJoin: Unit, lineCap: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: Unit, lineJoin: Unit, lineCap: String, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Double, color: Unit, lineJoin: Unit, lineCap: Unit, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: String, lineJoin: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: String, lineJoin: String, lineCap: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: String, lineJoin: String, lineCap: String, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: String, lineJoin: String, lineCap: Unit, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: String, lineJoin: Unit, lineCap: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: String, lineJoin: Unit, lineCap: String, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: String, lineJoin: Unit, lineCap: Unit, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: Unit, lineJoin: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: Unit, lineJoin: String, lineCap: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: Unit, lineJoin: String, lineCap: String, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: Unit, lineJoin: String, lineCap: Unit, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: Unit, lineJoin: Unit, lineCap: String): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: Unit, lineJoin: Unit, lineCap: String, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    inline def getStrokeStyle(width: Unit, color: Unit, lineJoin: Unit, lineCap: Unit, miterLimit: Double): StrokeStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeStyle")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], lineJoin.asInstanceOf[js.Any], lineCap.asInstanceOf[js.Any], miterLimit.asInstanceOf[js.Any])).asInstanceOf[StrokeStyle]
    
    inline def pointsToStroke(points: js.Array[Vector3], style: StrokeStyle): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("pointsToStroke")(points.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
    inline def pointsToStroke(points: js.Array[Vector3], style: StrokeStyle, arcDivisions: Double): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("pointsToStroke")(points.asInstanceOf[js.Any], style.asInstanceOf[js.Any], arcDivisions.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
    inline def pointsToStroke(points: js.Array[Vector3], style: StrokeStyle, arcDivisions: Double, minDistance: Double): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("pointsToStroke")(points.asInstanceOf[js.Any], style.asInstanceOf[js.Any], arcDivisions.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
    inline def pointsToStroke(points: js.Array[Vector3], style: StrokeStyle, arcDivisions: Unit, minDistance: Double): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("pointsToStroke")(points.asInstanceOf[js.Any], style.asInstanceOf[js.Any], arcDivisions.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]
    
    inline def pointsToStrokeWithBuffers(
      points: js.Array[Vector3],
      style: StrokeStyle,
      arcDivisions: js.UndefOr[Double],
      minDistance: js.UndefOr[Double],
      vertices: js.UndefOr[js.Array[Double]],
      normals: js.UndefOr[js.Array[Double]],
      uvs: js.UndefOr[js.Array[Double]],
      vertexOffset: js.UndefOr[Double]
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointsToStrokeWithBuffers")(points.asInstanceOf[js.Any], style.asInstanceOf[js.Any], arcDivisions.asInstanceOf[js.Any], minDistance.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], uvs.asInstanceOf[js.Any], vertexOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  trait SVGResult extends StObject {
    
    var paths: js.Array[SVGResultPaths]
    
    var xml: XMLDocument
  }
  object SVGResult {
    
    inline def apply(paths: js.Array[SVGResultPaths], xml: XMLDocument): SVGResult = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGResult]
    }
    
    extension [Self <: SVGResult](x: Self) {
      
      inline def setPaths(value: js.Array[SVGResultPaths]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: SVGResultPaths*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setXml(value: XMLDocument): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SVGResultPaths extends ShapePath {
    
    var userData: js.UndefOr[StringDictionary[Any]] = js.native
  }
  
  trait StrokeStyle extends StObject {
    
    var strokeColor: String
    
    var strokeLineCap: String
    
    var strokeLineJoin: String
    
    var strokeMiterLimit: Double
    
    var strokeWidth: Double
  }
  object StrokeStyle {
    
    inline def apply(
      strokeColor: String,
      strokeLineCap: String,
      strokeLineJoin: String,
      strokeMiterLimit: Double,
      strokeWidth: Double
    ): StrokeStyle = {
      val __obj = js.Dynamic.literal(strokeColor = strokeColor.asInstanceOf[js.Any], strokeLineCap = strokeLineCap.asInstanceOf[js.Any], strokeLineJoin = strokeLineJoin.asInstanceOf[js.Any], strokeMiterLimit = strokeMiterLimit.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrokeStyle]
    }
    
    extension [Self <: StrokeStyle](x: Self) {
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineCap(value: String): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLineJoin(value: String): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterLimit(value: Double): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
}
