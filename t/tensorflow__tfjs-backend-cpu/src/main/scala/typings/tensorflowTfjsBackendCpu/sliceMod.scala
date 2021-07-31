package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsSliceAttrs
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Slice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def slice(args: AttrsSliceAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Slice", "sliceConfig")
  @js.native
  val sliceConfig: KernelConfig = js.native
  
  @scala.inline
  def sliceImpl(
    vals: TypedArray,
    begin: js.Array[Double],
    size: js.Array[Double],
    shape: js.Array[Double],
    dtype: DataType
  ): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceImpl")(vals.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
}
