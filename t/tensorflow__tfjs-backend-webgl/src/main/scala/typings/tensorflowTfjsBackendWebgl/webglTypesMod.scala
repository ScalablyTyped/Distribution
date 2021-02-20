package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglTypesMod {
  
  @js.native
  trait WebGL1DisjointQueryTimerExtension extends StObject {
    
    var GPU_DISJOINT_EXT: Double = js.native
    
    var QUERY_RESULT_AVAILABLE_EXT: Double = js.native
    
    var QUERY_RESULT_EXT: Double = js.native
    
    var TIME_ELAPSED_EXT: Double = js.native
    
    def beginQueryEXT(ext: Double, query: WebGLQuery): Unit = js.native
    
    def createQueryEXT(): js.Object = js.native
    
    def deleteQueryEXT(query: WebGLQuery): Unit = js.native
    
    def endQueryEXT(ext: Double): Unit = js.native
    
    def getQueryObjectEXT(query: WebGLQuery, queryResultAvailableExt: Double): Double = js.native
    
    def isQueryEXT(query: WebGLQuery): Boolean = js.native
  }
  object WebGL1DisjointQueryTimerExtension {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class WebGL1DisjointQueryTimerExtensionMutableBuilder[Self <: WebGL1DisjointQueryTimerExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginQueryEXT(value: (Double, WebGLQuery) => Unit): Self = StObject.set(x, "beginQueryEXT", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateQueryEXT(value: () => js.Object): Self = StObject.set(x, "createQueryEXT", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteQueryEXT(value: WebGLQuery => Unit): Self = StObject.set(x, "deleteQueryEXT", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndQueryEXT(value: Double => Unit): Self = StObject.set(x, "endQueryEXT", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGPU_DISJOINT_EXT(value: Double): Self = StObject.set(x, "GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetQueryObjectEXT(value: (WebGLQuery, Double) => Double): Self = StObject.set(x, "getQueryObjectEXT", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsQueryEXT(value: WebGLQuery => Boolean): Self = StObject.set(x, "isQueryEXT", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQUERY_RESULT_AVAILABLE_EXT(value: Double): Self = StObject.set(x, "QUERY_RESULT_AVAILABLE_EXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUERY_RESULT_EXT(value: Double): Self = StObject.set(x, "QUERY_RESULT_EXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTIME_ELAPSED_EXT(value: Double): Self = StObject.set(x, "TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebGL2DisjointQueryTimerExtension extends StObject {
    
    var GPU_DISJOINT_EXT: Double = js.native
    
    var TIME_ELAPSED_EXT: Double = js.native
  }
  object WebGL2DisjointQueryTimerExtension {
    
    @scala.inline
    def apply(GPU_DISJOINT_EXT: Double, TIME_ELAPSED_EXT: Double): WebGL2DisjointQueryTimerExtension = {
      val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGL2DisjointQueryTimerExtension]
    }
    
    @scala.inline
    implicit class WebGL2DisjointQueryTimerExtensionMutableBuilder[Self <: WebGL2DisjointQueryTimerExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGPU_DISJOINT_EXT(value: Double): Self = StObject.set(x, "GPU_DISJOINT_EXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTIME_ELAPSED_EXT(value: Double): Self = StObject.set(x, "TIME_ELAPSED_EXT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebGLContextAttributes extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.native
    
    var antialias: js.UndefOr[Boolean] = js.native
    
    var depth: js.UndefOr[Boolean] = js.native
    
    var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
    
    var premultipliedAlpha: js.UndefOr[Boolean] = js.native
    
    var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
    
    var stencil: js.UndefOr[Boolean] = js.native
  }
  object WebGLContextAttributes {
    
    @scala.inline
    def apply(): WebGLContextAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebGLContextAttributes]
    }
    
    @scala.inline
    implicit class WebGLContextAttributesMutableBuilder[Self <: WebGLContextAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      @scala.inline
      def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
      
      @scala.inline
      def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
      
      @scala.inline
      def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
      
      @scala.inline
      def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    }
  }
}
