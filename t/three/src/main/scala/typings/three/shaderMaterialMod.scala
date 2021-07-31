package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.Derivatives
import typings.three.anon.DrawBuffers
import typings.three.constantsMod.GLSLVersion
import typings.three.materialMod.Material
import typings.three.materialMod.MaterialParameters
import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderMaterialMod {
  
  @JSImport("three/src/materials/ShaderMaterial", "ShaderMaterial")
  @js.native
  class ShaderMaterial () extends Material {
    def this(parameters: ShaderMaterialParameters) = this()
    
    /**
    	 * @default false
    	 */
    var clipping: Boolean = js.native
    
    /**
    	 * @default { 'color': [ 1, 1, 1 ], 'uv': [ 0, 0 ], 'uv2': [ 0, 0 ] }
    	 */
    var defaultAttributeValues: js.Any = js.native
    
    /**
    	 * @default {}
    	 */
    @JSName("defines")
    var defines_ShaderMaterial: StringDictionary[js.Any] = js.native
    
    /**
    	 * @deprecated Use {@link ShaderMaterial#extensions.derivatives extensions.derivatives} instead.
    	 */
    var derivatives: js.Any = js.native
    
    /**
    	 * @default { derivatives: false, fragDepth: false, drawBuffers: false, shaderTextureLOD: false }
    	 */
    var extensions: DrawBuffers = js.native
    
    var fragmentShader: String = js.native
    
    /**
    	 * @default null
    	 */
    var glslVersion: GLSLVersion | Null = js.native
    
    /**
    	 * @default undefined
    	 */
    var index0AttributeName: js.UndefOr[String] = js.native
    
    /**
    	 * @default false
    	 */
    var lights: Boolean = js.native
    
    /**
    	 * @default 1
    	 */
    var linewidth: Double = js.native
    
    /**
    	 * @default false
    	 */
    var morphNormals: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var morphTargets: Boolean = js.native
    
    def setValues(parameters: ShaderMaterialParameters): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var skinning: Boolean = js.native
    
    /**
    	 * @default {}
    	 */
    var uniforms: StringDictionary[IUniform] = js.native
    
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
    
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    var glslVersion: js.UndefOr[GLSLVersion] = js.undefined
    
    var lights: js.UndefOr[Boolean] = js.undefined
    
    var linewidth: js.UndefOr[Double] = js.undefined
    
    var morphNormals: js.UndefOr[Boolean] = js.undefined
    
    var morphTargets: js.UndefOr[Boolean] = js.undefined
    
    var skinning: js.UndefOr[Boolean] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[IUniform]] = js.undefined
    
    var vertexShader: js.UndefOr[String] = js.undefined
    
    var wireframe: js.UndefOr[Boolean] = js.undefined
    
    var wireframeLinewidth: js.UndefOr[Double] = js.undefined
  }
  object ShaderMaterialParameters {
    
    @scala.inline
    def apply(): ShaderMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShaderMaterialParameters]
    }
    
    @scala.inline
    implicit class ShaderMaterialParametersMutableBuilder[Self <: ShaderMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipping(value: Boolean): Self = StObject.set(x, "clipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClippingUndefined: Self = StObject.set(x, "clipping", js.undefined)
      
      @scala.inline
      def setExtensions(value: Derivatives): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
      
      @scala.inline
      def setGlslVersion(value: GLSLVersion): Self = StObject.set(x, "glslVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlslVersionUndefined: Self = StObject.set(x, "glslVersion", js.undefined)
      
      @scala.inline
      def setLights(value: Boolean): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightsUndefined: Self = StObject.set(x, "lights", js.undefined)
      
      @scala.inline
      def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
      
      @scala.inline
      def setMorphNormals(value: Boolean): Self = StObject.set(x, "morphNormals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMorphNormalsUndefined: Self = StObject.set(x, "morphNormals", js.undefined)
      
      @scala.inline
      def setMorphTargets(value: Boolean): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMorphTargetsUndefined: Self = StObject.set(x, "morphTargets", js.undefined)
      
      @scala.inline
      def setSkinning(value: Boolean): Self = StObject.set(x, "skinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinningUndefined: Self = StObject.set(x, "skinning", js.undefined)
      
      @scala.inline
      def setUniforms(value: StringDictionary[IUniform]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      @scala.inline
      def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
      
      @scala.inline
      def setWireframe(value: Boolean): Self = StObject.set(x, "wireframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframeLinewidth(value: Double): Self = StObject.set(x, "wireframeLinewidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWireframeLinewidthUndefined: Self = StObject.set(x, "wireframeLinewidth", js.undefined)
      
      @scala.inline
      def setWireframeUndefined: Self = StObject.set(x, "wireframe", js.undefined)
    }
  }
}
