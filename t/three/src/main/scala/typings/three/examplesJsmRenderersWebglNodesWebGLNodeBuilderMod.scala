package typings.three

import typings.three.anon.FragmentShader
import typings.three.examplesJsmNodesCoreConstantsMod.NodeShaderStageOption
import typings.three.examplesJsmNodesCoreNodeBuilderMod.default
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcRenderersWebGLRendererMod.Renderer
import typings.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmRenderersWebglNodesWebGLNodeBuilderMod {
  
  @JSImport("three/examples/jsm/renderers/webgl/nodes/WebGLNodeBuilder", "WebGLNodeBuilder")
  @js.native
  open class WebGLNodeBuilder protected () extends default {
    def this(`object`: Object3D[Event], renderer: Renderer, shader: FragmentShader) = this()
    
    def addCode(shaderStage: String, source: String, code: String): String = js.native
    def addCode(shaderStage: String, source: String, code: String, scope: this.type): String = js.native
    
    def addCodeAfterInclude(shaderStage: String, snippet: String, code: String): String = js.native
    
    def addSlot(
      shaderStage: NodeShaderStageOption,
      slotNode: typings.three.examplesJsmRenderersWebglNodesSlotNodeMod.default[typings.three.examplesJsmNodesCoreNodeMod.default]
    ): typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    def getAttributes(shaderStage: String): String = js.native
    
    def getCubeTexture(texturePropert: String, uvSnippet: String, shaderStage: NodeShaderStageOption): String = js.native
    
    def getCubeTextureBias(textureProperty: String, uvSnippet: String, biasSnippet: String): String = js.native
    
    def getCubeTextureLevel(
      textureProperty: String,
      uvSnippet: String,
      biasSnippet: String,
      shaderStage: NodeShaderStageOption
    ): String = js.native
    
    def getSlot(shaderStage: String, name: String): typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    def getTextureBias(textureProperty: String, uvSnippet: String, biasSnippet: String): String = js.native
    
    def getTextureLevel(
      textureProperty: String,
      uvSnippet: String,
      biasSnippet: String,
      shaderStage: NodeShaderStageOption
    ): String = js.native
    
    def getUniforms(shaderStage: String): String = js.native
    
    def getVarys(shaderStage: String): String = js.native
    
    def parseInclude(shaderStage: String, includes: String*): Unit = js.native
    
    def replaceCode(shaderStage: String, source: String, target: String): Unit = js.native
    def replaceCode(shaderStage: String, source: String, target: String, scope: this.type): Unit = js.native
  }
}
