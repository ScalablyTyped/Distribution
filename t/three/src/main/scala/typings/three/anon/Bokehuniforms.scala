package typings.three.anon

import typings.three.examplesJsmShadersBokehShader2Mod.BokehShaderUniforms
import typings.three.srcThreeMod.OrthographicCamera
import typings.three.srcThreeMod.Scene
import typings.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bokehuniforms extends StObject {
  
  var bokeh_uniforms: BokehShaderUniforms
  
  var camera: OrthographicCamera
  
  var enabled: Boolean
  
  var rtTextureColor: WebGLRenderTarget
  
  var rtTextureDepth: WebGLRenderTarget
  
  var scene: Scene
}
object Bokehuniforms {
  
  inline def apply(
    bokeh_uniforms: BokehShaderUniforms,
    camera: OrthographicCamera,
    enabled: Boolean,
    rtTextureColor: WebGLRenderTarget,
    rtTextureDepth: WebGLRenderTarget,
    scene: Scene
  ): Bokehuniforms = {
    val __obj = js.Dynamic.literal(bokeh_uniforms = bokeh_uniforms.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], rtTextureColor = rtTextureColor.asInstanceOf[js.Any], rtTextureDepth = rtTextureDepth.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bokehuniforms]
  }
  
  extension [Self <: Bokehuniforms](x: Self) {
    
    inline def setBokeh_uniforms(value: BokehShaderUniforms): Self = StObject.set(x, "bokeh_uniforms", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: OrthographicCamera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setRtTextureColor(value: WebGLRenderTarget): Self = StObject.set(x, "rtTextureColor", value.asInstanceOf[js.Any])
    
    inline def setRtTextureDepth(value: WebGLRenderTarget): Self = StObject.set(x, "rtTextureDepth", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
