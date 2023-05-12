package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import typings.three.srcThreeMod.DataTexture
import typings.three.srcThreeMod.Material
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.Texture
import typings.three.srcThreeMod.WebGLRenderTarget
import typings.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscGpucomputationrendererMod {
  
  @JSImport("three/examples/jsm/misc/GPUComputationRenderer", "GPUComputationRenderer")
  @js.native
  open class GPUComputationRenderer protected () extends StObject {
    def this(sizeX: Double, sizeY: Double, renderer: WebGLRenderer) = this()
    
    def addResolutionDefine(materialShader: ShaderMaterial): Unit = js.native
    
    def addVariable(variableName: String, computeFragmentShader: String, initialValueTexture: Texture): Variable = js.native
    
    def compute(): Unit = js.native
    
    def createRenderTarget(
      sizeXTexture: Double,
      sizeYTexture: Double,
      wrapS: Wrapping,
      wrapT: Double,
      minFilter: MinificationTextureFilter,
      magFilter: MagnificationTextureFilter
    ): WebGLRenderTarget = js.native
    
    def createShaderMaterial(computeFragmentShader: String): ShaderMaterial = js.native
    def createShaderMaterial(computeFragmentShader: String, uniforms: StringDictionary[IUniform[Any]]): ShaderMaterial = js.native
    
    def createTexture(): DataTexture = js.native
    
    def dispose(): Unit = js.native
    
    def doRenderTarget(material: Material, output: WebGLRenderTarget): Unit = js.native
    
    def getAlternateRenderTarget(variable: Variable): WebGLRenderTarget = js.native
    
    def getCurrentRenderTarget(variable: Variable): WebGLRenderTarget = js.native
    
    def init(): String | Null = js.native
    
    def renderTexture(input: Texture, output: Texture): Unit = js.native
    
    def setDataType(`type`: TextureDataType): Unit = js.native
    
    def setVariableDependencies(variable: Variable): Unit = js.native
    def setVariableDependencies(variable: Variable, dependencies: js.Array[Variable]): Unit = js.native
  }
  
  trait Variable extends StObject {
    
    var dependencies: js.Array[Variable]
    
    var initialValueTexture: Texture
    
    var magFilter: Double
    
    var material: ShaderMaterial
    
    var minFilter: Double
    
    var name: String
    
    var renderTargets: js.Array[WebGLRenderTarget]
    
    var wrapS: Double
    
    var wrapT: Double
  }
  object Variable {
    
    inline def apply(
      dependencies: js.Array[Variable],
      initialValueTexture: Texture,
      magFilter: Double,
      material: ShaderMaterial,
      minFilter: Double,
      name: String,
      renderTargets: js.Array[WebGLRenderTarget],
      wrapS: Double,
      wrapT: Double
    ): Variable = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], initialValueTexture = initialValueTexture.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderTargets = renderTargets.asInstanceOf[js.Any], wrapS = wrapS.asInstanceOf[js.Any], wrapT = wrapT.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Variable] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: js.Array[Variable]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: Variable*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setInitialValueTexture(value: Texture): Self = StObject.set(x, "initialValueTexture", value.asInstanceOf[js.Any])
      
      inline def setMagFilter(value: Double): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: ShaderMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMinFilter(value: Double): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRenderTargets(value: js.Array[WebGLRenderTarget]): Self = StObject.set(x, "renderTargets", value.asInstanceOf[js.Any])
      
      inline def setRenderTargetsVarargs(value: WebGLRenderTarget*): Self = StObject.set(x, "renderTargets", js.Array(value*))
      
      inline def setWrapS(value: Double): Self = StObject.set(x, "wrapS", value.asInstanceOf[js.Any])
      
      inline def setWrapT(value: Double): Self = StObject.set(x, "wrapT", value.asInstanceOf[js.Any])
    }
  }
}
