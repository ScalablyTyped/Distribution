package typings.three

import typings.three.anon.CameraProjectionMatrix
import typings.three.anon.IsDistanceAttenuation
import typings.three.anon.OpacityResolution
import typings.three.anon.PERSPECTIVECAMERA
import typings.three.anon.TDepth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersSsrshaderMod {
  
  trait SSRBlurShader extends StObject {
    
    var fragmentShader: String
    
    var uniforms: OpacityResolution
    
    var vertexShader: String
  }
  object SSRBlurShader {
    
    @JSImport("three/examples/jsm/shaders/SSRShader", "SSRBlurShader")
    @js.native
    val ^ : SSRBlurShader = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSRBlurShader] (val x: Self) extends AnyVal {
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: OpacityResolution): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
  
  trait SSRDepthShader extends StObject {
    
    var defines: PERSPECTIVECAMERA
    
    var fragmentShader: String
    
    var uniforms: TDepth
    
    var vertexShader: String
  }
  object SSRDepthShader {
    
    @JSImport("three/examples/jsm/shaders/SSRShader", "SSRDepthShader")
    @js.native
    val ^ : SSRDepthShader = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSRDepthShader] (val x: Self) extends AnyVal {
      
      inline def setDefines(value: PERSPECTIVECAMERA): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: TDepth): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
  
  trait SSRShader extends StObject {
    
    var defines: IsDistanceAttenuation
    
    var fragmentShader: String
    
    var uniforms: CameraProjectionMatrix
    
    var vertexShader: String
  }
  object SSRShader {
    
    @JSImport("three/examples/jsm/shaders/SSRShader", "SSRShader")
    @js.native
    val ^ : SSRShader = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSRShader] (val x: Self) extends AnyVal {
      
      inline def setDefines(value: IsDistanceAttenuation): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: CameraProjectionMatrix): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
}
