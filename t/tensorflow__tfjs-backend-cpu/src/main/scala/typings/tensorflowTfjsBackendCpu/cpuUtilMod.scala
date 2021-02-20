package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpuUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/cpu_util", "assertNotComplex")
  @js.native
  def assertNotComplex(tensor: js.Array[TensorInfo], opName: String): Unit = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/cpu_util", "assertNotComplex")
  @js.native
  def assertNotComplex(tensor: TensorInfo, opName: String): Unit = js.native
}
