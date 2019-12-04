package typings.three

import typings.std.WebGLRenderingContext
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLMorphtargets", JSImport.Namespace)
@js.native
object srcRenderersWebglWebGLMorphtargetsMod extends js.Object {
  @js.native
  class WebGLMorphtargets protected () extends js.Object {
    def this(gl: WebGLRenderingContext) = this()
    def update(`object`: Object3D, geometry: BufferGeometry, material: Material, program: WebGLProgram): Unit = js.native
  }
  
}

