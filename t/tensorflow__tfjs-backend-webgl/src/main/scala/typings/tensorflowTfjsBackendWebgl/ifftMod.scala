package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsIFFTInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifftMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/IFFT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ifft(args: InputsIFFTInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("ifft")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/IFFT", "ifftConfig")
  @js.native
  val ifftConfig: KernelConfig = js.native
}
