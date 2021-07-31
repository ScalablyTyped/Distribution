package typings.tensorflowTfjsBackendCpu

import typings.std.Float32Array
import typings.tensorflowTfjsBackendCpu.anon.Indices
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "addImpl")
  @js.native
  val addImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "ceilImpl")
  @js.native
  val ceilImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "expImpl")
  @js.native
  val expImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "expm1Impl")
  @js.native
  val expm1Impl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "floorImpl")
  @js.native
  val floorImpl: SimpleUnaryImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "logImpl")
  @js.native
  val logImpl: SimpleUnaryImpl = js.native
  
  @scala.inline
  def maxImpl(aVals: TypedArray, reduceSize: Double, outShape: js.Array[Double], dtype: DataType): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("maxImpl")(aVals.asInstanceOf[js.Any], reduceSize.asInstanceOf[js.Any], outShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "multiplyImpl")
  @js.native
  val multiplyImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "notEqualImpl")
  @js.native
  val notEqualImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "rsqrtImpl")
  @js.native
  val rsqrtImpl: SimpleUnaryImpl = js.native
  
  @scala.inline
  def simpleAbsImpl(vals: TypedArray): Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleAbsImpl")(vals.asInstanceOf[js.Any]).asInstanceOf[Float32Array]
  
  @scala.inline
  def sliceImpl(
    vals: TypedArray,
    begin: js.Array[Double],
    size: js.Array[Double],
    shape: js.Array[Double],
    dtype: DataType
  ): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceImpl")(vals.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "squaredDifferenceImpl")
  @js.native
  val squaredDifferenceImpl: SimpleBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/shared", "subImpl")
  @js.native
  val subImpl: SimpleBinaryKernelImpl = js.native
  
  @scala.inline
  def transposeImpl(
    xVals: TypedArray,
    xShape: js.Array[Double],
    dtype: DataType,
    perm: js.Array[Double],
    newShape: js.Array[Double]
  ): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("transposeImpl")(xVals.asInstanceOf[js.Any], xShape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], perm.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
  
  @scala.inline
  def uniqueImpl(values: BackendValues, axis: Double, shape: js.Array[Double], dtype: DataType): Indices = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueImpl")(values.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Indices]
}
