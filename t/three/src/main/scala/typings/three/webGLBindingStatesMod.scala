package typings.three

import typings.std.WebGLRenderingContext
import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.webGLAttributesMod.WebGLAttributes
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import typings.three.webGLProgramMod.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLBindingStatesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLBindingStates", "WebGLBindingStates")
  @js.native
  class WebGLBindingStates protected () extends StObject {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      attributes: WebGLAttributes,
      capabilities: WebGLCapabilities
    ) = this()
    
    def disableUnusedAttributes(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def enableAttribute(attribute: Double): Unit = js.native
    
    def initAttributes(): Unit = js.native
    
    def releaseStatesOfGeometry(): Unit = js.native
    
    def releaseStatesOfProgram(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetDefaultState(): Unit = js.native
    
    def setup(
      `object`: Object3D,
      material: Material,
      program: WebGLProgram,
      geometry: BufferGeometry,
      index: BufferAttribute
    ): Unit = js.native
  }
}
