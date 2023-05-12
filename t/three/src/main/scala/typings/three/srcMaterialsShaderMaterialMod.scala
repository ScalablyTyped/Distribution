package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.Derivatives
import typings.three.anon.DrawBuffers
import typings.three.srcConstantsMod.GLSLVersion
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMaterialsMaterialMod.MaterialParameters
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsShaderMaterialMod {
  
  @JSImport("three/src/materials/ShaderMaterial", "ShaderMaterial")
  @js.native
  open class ShaderMaterial () extends Material {
    def this(parameters: ShaderMaterialParameters) = this()
    
    /**
      * @default false
      */
    var clipping: Boolean = js.native
    
    /**
      * @default { 'color': [ 1, 1, 1 ], 'uv': [ 0, 0 ], 'uv1': [ 0, 0 ] }
      */
    var defaultAttributeValues: Any = js.native
    
    /**
      * @default {}
      */
    @JSName("defines")
    var defines_ShaderMaterial: StringDictionary[Any] = js.native
    
    /**
      * @deprecated Use {@link ShaderMaterial#extensions.derivatives extensions.derivatives} instead.
      */
    var derivatives: Any = js.native
    
    /**
      * @default { derivatives: false, fragDepth: false, drawBuffers: false, shaderTextureLOD: false }
      */
    var extensions: DrawBuffers = js.native
    
    /**
      * @default false
      */
    var fog: Boolean = js.native
    
    var fragmentShader: String = js.native
    
    /**
      * @default null
      */
    var glslVersion: GLSLVersion | Null = js.native
    
    /**
      * @default undefined
      */
    var index0AttributeName: js.UndefOr[String] = js.native
    
    var isShaderMaterial: Boolean = js.native
    
    /**
      * @default false
      */
    var lights: Boolean = js.native
    
    /**
      * @default 1
      */
    var linewidth: Double = js.native
    
    def setValues(parameters: ShaderMaterialParameters): Unit = js.native
    
    /**
      * @default {}
      */
    var uniforms: StringDictionary[IUniform[Any]] = js.native
    
    /**
      * @default false
      */
    var uniformsNeedUpdate: Boolean = js.native
    
    var vertexShader: String = js.native
    
    /**
      * @default false
      */
    var wireframe: Boolean = js.native
    
    /**
      * @default 1
      */
    var wireframeLinewidth: Double = js.native
  }
  
  trait ShaderMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var clipping: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[Derivatives] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
    
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    var glslVersion: js.UndefOr[GLSLVersion] = js.undefined
    
    var lights: js.UndefOr[Boolean] = js.undefined
    
    var linewidth: js.UndefOr[Double] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[IUniform[Any]]] = js.undefined
    
    var vertexShader: js.UndefOr[String] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var wireframeLinewidth: js.UndefOr[Double] = js.undefined
  }
  object ShaderMaterialParameters {
    
    inline def apply(): ShaderMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShaderMaterialParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShaderMaterialParameters] (val x: Self) extends AnyVal {
      
      inline def setClipping(value: Boolean): Self = StObject.set(x, "clipping", value.asInstanceOf[js.Any])
      
      inline def setClippingUndefined: Self = StObject.set(x, "clipping", js.undefined)
      
      inline def setExtensions(value: Derivatives): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
      
      inline def setGlslVersion(value: GLSLVersion): Self = StObject.set(x, "glslVersion", value.asInstanceOf[js.Any])
      
      inline def setGlslVersionUndefined: Self = StObject.set(x, "glslVersion", js.undefined)
      
      inline def setLights(value: Boolean): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
      
      inline def setLightsUndefined: Self = StObject.set(x, "lights", js.undefined)
      
      inline def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
      
      inline def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
      
      inline def setUniforms(value: StringDictionary[IUniform[Any]]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      inline def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
      
      inline def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
      
      inline def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
      
      inline def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
    }
  }
}
