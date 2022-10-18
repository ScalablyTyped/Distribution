package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersShadersShaderLibMod {
  
  object ShaderLib {
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.background")
    @js.native
    def background: Shader = js.native
    inline def background_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("background")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.basic")
    @js.native
    def basic: Shader = js.native
    inline def basic_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basic")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.cube")
    @js.native
    def cube: Shader = js.native
    inline def cube_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cube")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.dashed")
    @js.native
    def dashed: Shader = js.native
    inline def dashed_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dashed")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.depth")
    @js.native
    def depth: Shader = js.native
    inline def depth_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.distanceRGBA")
    @js.native
    def distanceRGBA: Shader = js.native
    inline def distanceRGBA_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("distanceRGBA")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.equirect")
    @js.native
    def equirect: Shader = js.native
    inline def equirect_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equirect")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.lambert")
    @js.native
    def lambert: Shader = js.native
    inline def lambert_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lambert")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.matcap")
    @js.native
    def matcap: Shader = js.native
    inline def matcap_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matcap")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.normal")
    @js.native
    def normal: Shader = js.native
    inline def normal_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.phong")
    @js.native
    def phong: Shader = js.native
    inline def phong_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phong")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.physical")
    @js.native
    def physical: Shader = js.native
    inline def physical_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("physical")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.points")
    @js.native
    def points: Shader = js.native
    inline def points_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("points")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.shadow")
    @js.native
    def shadow: Shader = js.native
    inline def shadow_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadow")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.sprite")
    @js.native
    def sprite: Shader = js.native
    inline def sprite_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sprite")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/renderers/shaders/ShaderLib", "ShaderLib.standard")
    @js.native
    def standard: Shader = js.native
    inline def standard_=(x: Shader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("standard")(x.asInstanceOf[js.Any])
  }
  
  trait Shader extends StObject {
    
    var fragmentShader: String
    
    var uniforms: StringDictionary[IUniform[Any]]
    
    var vertexShader: String
  }
  object Shader {
    
    inline def apply(fragmentShader: String, uniforms: StringDictionary[IUniform[Any]], vertexShader: String): Shader = {
      val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shader]
    }
    
    extension [Self <: Shader](x: Self) {
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: StringDictionary[IUniform[Any]]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    }
  }
}
