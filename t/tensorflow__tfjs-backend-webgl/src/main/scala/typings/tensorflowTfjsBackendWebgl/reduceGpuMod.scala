package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum
import typings.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/reduce_gpu", JSImport.Namespace)
@js.native
object reduceGpuMod extends js.Object {
  
  @js.native
  class ReduceProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo, reduceType: all) = this()
    def this(reduceInfo: ReduceInfo, reduceType: any) = this()
    def this(reduceInfo: ReduceInfo, reduceType: max) = this()
    def this(reduceInfo: ReduceInfo, reduceType: min) = this()
    def this(reduceInfo: ReduceInfo, reduceType: prod) = this()
    def this(reduceInfo: ReduceInfo, reduceType: sum) = this()
  }
}
