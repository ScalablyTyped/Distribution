package typings.three

import typings.three.anon.DirectionalLights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmShadersSubsurfaceScatteringShaderMod {
  
  object SubsurfaceScatteringShader {
    
    @JSImport("three/examples/jsm/shaders/SubsurfaceScatteringShader", "SubsurfaceScatteringShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/shaders/SubsurfaceScatteringShader", "SubsurfaceScatteringShader.fragmentShader")
    @js.native
    def fragmentShader: String = js.native
    inline def fragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SubsurfaceScatteringShader", "SubsurfaceScatteringShader.uniforms")
    @js.native
    def uniforms: DirectionalLights = js.native
    inline def uniforms_=(x: DirectionalLights): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/shaders/SubsurfaceScatteringShader", "SubsurfaceScatteringShader.vertexShader")
    @js.native
    def vertexShader: String = js.native
    inline def vertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(x.asInstanceOf[js.Any])
  }
}
