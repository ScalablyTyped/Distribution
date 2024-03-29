package typings.wonderJs

import org.scalablytyped.runtime.Instantiable0
import typings.wonderJs.distEs2015CoreMainMod.Main
import typings.wonderJs.distEs2015DeviceEscreensizeMod.EScreenSize
import typings.wonderJs.distEs2015StructureFace3Mod.Face3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpha extends StObject {
    
    var alpha: Boolean
    
    var antialias: Boolean
    
    var depth: Boolean
    
    var premultipliedAlpha: Boolean
    
    var preserveDrawingBuffer: Boolean
    
    var stencil: Boolean
  }
  object Alpha {
    
    inline def apply(
      alpha: Boolean,
      antialias: Boolean,
      depth: Boolean,
      premultipliedAlpha: Boolean,
      preserveDrawingBuffer: Boolean,
      stencil: Boolean
    ): Alpha = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], antialias = antialias.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alpha]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanvasId extends StObject {
    
    var canvasId: js.UndefOr[Null] = js.undefined
    
    var contextConfig: js.UndefOr[Options] = js.undefined
    
    var isTest: js.UndefOr[Boolean] = js.undefined
    
    var screenSize: js.UndefOr[EScreenSize] = js.undefined
    
    var useDevicePixelRatio: js.UndefOr[Boolean] = js.undefined
  }
  object CanvasId {
    
    inline def apply(): CanvasId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanvasId] (val x: Self) extends AnyVal {
      
      inline def setContextConfig(value: Options): Self = StObject.set(x, "contextConfig", value.asInstanceOf[js.Any])
      
      inline def setContextConfigUndefined: Self = StObject.set(x, "contextConfig", js.undefined)
      
      inline def setIsTest(value: Boolean): Self = StObject.set(x, "isTest", value.asInstanceOf[js.Any])
      
      inline def setIsTestUndefined: Self = StObject.set(x, "isTest", js.undefined)
      
      inline def setScreenSize(value: EScreenSize): Self = StObject.set(x, "screenSize", value.asInstanceOf[js.Any])
      
      inline def setScreenSizeUndefined: Self = StObject.set(x, "screenSize", js.undefined)
      
      inline def setUseDevicePixelRatio(value: Boolean): Self = StObject.set(x, "useDevicePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setUseDevicePixelRatioUndefined: Self = StObject.set(x, "useDevicePixelRatio", js.undefined)
    }
  }
  
  trait Faces extends StObject {
    
    var faces: js.Array[Face3]
    
    var vertices: js.Array[Any]
  }
  object Faces {
    
    inline def apply(faces: js.Array[Face3], vertices: js.Array[Any]): Faces = {
      val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Faces]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Faces] (val x: Self) extends AnyVal {
      
      inline def setFaces(value: js.Array[Face3]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      inline def setFacesVarargs(value: Face3*): Self = StObject.set(x, "faces", js.Array(value*))
      
      inline def setVertices(value: js.Array[Any]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: Any*): Self = StObject.set(x, "vertices", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    var options: Alpha
  }
  object Options {
    
    inline def apply(options: Alpha): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: Alpha): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofMain
    extends StObject
       with Instantiable0[Main] {
    
    def init(): /* import warning: importer.ImportType#apply Failed type conversion: typeof Main */ js.Any = js.native
    
    def setConfig(param0: CanvasId): /* import warning: importer.ImportType#apply Failed type conversion: typeof Main */ js.Any = js.native
  }
  
  trait X extends StObject {
    
    var x: Any
    
    var y: Any
  }
  object X {
    
    inline def apply(x: Any, y: Any): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Y {
    
    inline def apply(x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
