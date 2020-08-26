package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-cpu/dist/cpu_util", JSImport.Namespace)
@js.native
object cpuUtilMod extends js.Object {
  def assertNotComplex(tensor: js.Array[TensorInfo], opName: String): Unit = js.native
  def assertNotComplex(tensor: TensorInfo, opName: String): Unit = js.native
}

