package typings.three

import typings.std.WebGLRenderingContext
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcRenderersWebglWebGLAttributesMod.WebGLAttributes
import typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLBindingStatesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLBindingStates", "WebGLBindingStates")
  @js.native
  open class WebGLBindingStates protected () extends StObject {
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
      `object`: Object3D[Event],
      material: Material,
      program: WebGLProgram,
      geometry: BufferGeometry[NormalBufferAttributes],
      index: BufferAttribute
    ): Unit = js.native
  }
}
