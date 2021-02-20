package typings.three

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLCapabilitiesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLCapabilities", "WebGLCapabilities")
  @js.native
  class WebGLCapabilities protected () extends StObject {
    def this(gl: WebGLRenderingContext, extensions: js.Any, parameters: WebGLCapabilitiesParameters) = this()
    
    var floatFragmentTextures: Boolean = js.native
    
    var floatVertexTextures: Boolean = js.native
    
    def getMaxAnisotropy(): Double = js.native
    
    def getMaxPrecision(precision: String): String = js.native
    
    val isWebGL2: Boolean = js.native
    
    var logarithmicDepthBuffer: Boolean = js.native
    
    var maxAttributes: Double = js.native
    
    var maxCubemapSize: Double = js.native
    
    var maxFragmentUniforms: Double = js.native
    
    var maxTextureSize: Double = js.native
    
    var maxTextures: Double = js.native
    
    var maxVaryings: Double = js.native
    
    var maxVertexTextures: Double = js.native
    
    var maxVertexUniforms: Double = js.native
    
    var precision: String = js.native
    
    var vertexTextures: Boolean = js.native
  }
  
  @js.native
  trait WebGLCapabilitiesParameters extends StObject {
    
    var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.native
    
    var precision: js.UndefOr[String] = js.native
  }
  object WebGLCapabilitiesParameters {
    
    @scala.inline
    def apply(): WebGLCapabilitiesParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebGLCapabilitiesParameters]
    }
    
    @scala.inline
    implicit class WebGLCapabilitiesParametersMutableBuilder[Self <: WebGLCapabilitiesParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogarithmicDepthBuffer(value: Boolean): Self = StObject.set(x, "logarithmicDepthBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogarithmicDepthBufferUndefined: Self = StObject.set(x, "logarithmicDepthBuffer", js.undefined)
      
      @scala.inline
      def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
}
