package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebglTypesMod {
  
  trait WebGL1DisjointQueryTimerExtension extends StObject {
    
    var GPU_DISJOINT_EXT: Double
    
    var QUERY_RESULT_AVAILABLE_EXT: Double
    
    var QUERY_RESULT_EXT: Double
    
    var TIME_ELAPSED_EXT: Double
    
    def beginQueryEXT(ext: Double, query: WebGLQuery): Unit
    
    def createQueryEXT(): js.Object
    
    def deleteQueryEXT(query: WebGLQuery): Unit
    
    def endQueryEXT(ext: Double): Unit
    
    def getQueryObjectEXT(query: WebGLQuery, queryResultAvailableExt: Double): Double
    
    def isQueryEXT(query: WebGLQuery): Boolean
  }
  object WebGL1DisjointQueryTimerExtension {
    
    inline def apply(
      GPU_DISJOINT_EXT: Double,
      QUERY_RESULT_AVAILABLE_EXT: Double,
      QUERY_RESULT_EXT: Double,
      TIME_ELAPSED_EXT: Double,
      beginQueryEXT: (Double, WebGLQuery) => Unit,
      createQueryEXT: () => js.Object,
      deleteQueryEXT: WebGLQuery => Unit,
      endQueryEXT: Double => Unit,
      getQueryObjectEXT: (WebGLQuery, Double) => Double,
      isQueryEXT: WebGLQuery => Boolean
    ): WebGL1DisjointQueryTimerExtension = {
      val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT.asInstanceOf[js.Any], QUERY_RESULT_EXT = QUERY_RESULT_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any], beginQueryEXT = js.Any.fromFunction2(beginQueryEXT), createQueryEXT = js.Any.fromFunction0(createQueryEXT), deleteQueryEXT = js.Any.fromFunction1(deleteQueryEXT), endQueryEXT = js.Any.fromFunction1(endQueryEXT), getQueryObjectEXT = js.Any.fromFunction2(getQueryObjectEXT), isQueryEXT = js.Any.fromFunction1(isQueryEXT))
      __obj.asInstanceOf[WebGL1DisjointQueryTimerExtension]
    }
    
    extension [Self <: WebGL1DisjointQueryTimerExtension](x: Self) {
      
      inline def setBeginQueryEXT(value: (Double, WebGLQuery) => Unit): Self = StObject.set(x, "beginQueryEXT", js.Any.fromFunction2(value))
      
      inline def setCreateQueryEXT(value: () => js.Object): Self = StObject.set(x, "createQueryEXT", js.Any.fromFunction0(value))
      
      inline def setDeleteQueryEXT(value: WebGLQuery => Unit): Self = StObject.set(x, "deleteQueryEXT", js.Any.fromFunction1(value))
      
      inline def setEndQueryEXT(value: Double => Unit): Self = StObject.set(x, "endQueryEXT", js.Any.fromFunction1(value))
      
      inline def setGPU_DISJOINT_EXT(value: Double): Self = StObject.set(x, "GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
      
      inline def setGetQueryObjectEXT(value: (WebGLQuery, Double) => Double): Self = StObject.set(x, "getQueryObjectEXT", js.Any.fromFunction2(value))
      
      inline def setIsQueryEXT(value: WebGLQuery => Boolean): Self = StObject.set(x, "isQueryEXT", js.Any.fromFunction1(value))
      
      inline def setQUERY_RESULT_AVAILABLE_EXT(value: Double): Self = StObject.set(x, "QUERY_RESULT_AVAILABLE_EXT", value.asInstanceOf[js.Any])
      
      inline def setQUERY_RESULT_EXT(value: Double): Self = StObject.set(x, "QUERY_RESULT_EXT", value.asInstanceOf[js.Any])
      
      inline def setTIME_ELAPSED_EXT(value: Double): Self = StObject.set(x, "TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGL2DisjointQueryTimerExtension extends StObject {
    
    var GPU_DISJOINT_EXT: Double
    
    var TIME_ELAPSED_EXT: Double
  }
  object WebGL2DisjointQueryTimerExtension {
    
    inline def apply(GPU_DISJOINT_EXT: Double, TIME_ELAPSED_EXT: Double): WebGL2DisjointQueryTimerExtension = {
      val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGL2DisjointQueryTimerExtension]
    }
    
    extension [Self <: WebGL2DisjointQueryTimerExtension](x: Self) {
      
      inline def setGPU_DISJOINT_EXT(value: Double): Self = StObject.set(x, "GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
      
      inline def setTIME_ELAPSED_EXT(value: Double): Self = StObject.set(x, "TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGLContextAttributes extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    var antialias: js.UndefOr[Boolean] = js.undefined
    
    var depth: js.UndefOr[Boolean] = js.undefined
    
    var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
    
    var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
    
    var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
    
    var stencil: js.UndefOr[Boolean] = js.undefined
  }
  object WebGLContextAttributes {
    
    inline def apply(): WebGLContextAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebGLContextAttributes]
    }
    
    extension [Self <: WebGLContextAttributes](x: Self) {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
      
      inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
      
      inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
      
      inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
      
      inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
      
      inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    }
  }
  
  trait WebGLParallelCompilationExtension extends StObject {
    
    var COMPLETION_STATUS_KHR: Double
  }
  object WebGLParallelCompilationExtension {
    
    inline def apply(COMPLETION_STATUS_KHR: Double): WebGLParallelCompilationExtension = {
      val __obj = js.Dynamic.literal(COMPLETION_STATUS_KHR = COMPLETION_STATUS_KHR.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLParallelCompilationExtension]
    }
    
    extension [Self <: WebGLParallelCompilationExtension](x: Self) {
      
      inline def setCOMPLETION_STATUS_KHR(value: Double): Self = StObject.set(x, "COMPLETION_STATUS_KHR", value.asInstanceOf[js.Any])
    }
  }
}
