package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.ComplexBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSubMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sub", "sub")
  @js.native
  val sub: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sub", "subComplexImpl")
  @js.native
  val subComplexImpl: ComplexBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sub", "subConfig")
  @js.native
  val subConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sub", "subImpl")
  @js.native
  val subImpl: SimpleBinaryKernelImpl = js.native
}
