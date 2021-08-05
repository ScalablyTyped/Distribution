package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpuUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/cpu_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertNotComplex(tensor: js.Array[TensorInfo], opName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotComplex")(tensor.asInstanceOf[js.Any], opName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertNotComplex(tensor: TensorInfo, opName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotComplex")(tensor.asInstanceOf[js.Any], opName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
