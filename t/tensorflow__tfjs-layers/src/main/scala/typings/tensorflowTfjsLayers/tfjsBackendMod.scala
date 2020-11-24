package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.fusedTypesMod.Activation
import typings.tensorflowTfjsLayers.distTypesMod.HasShape
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.cpu
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/backend/tfjs_backend", JSImport.Namespace)
@js.native
object tfjsBackendMod extends js.Object {
  
  def batchFlatten(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def biasAdd(x: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  def biasAdd(x: Tensor[Rank], bias: Tensor[Rank], dataFormat: DataFormat): Tensor[Rank] = js.native
  
  def cast(x: Tensor[Rank], dtype: DataType): Tensor[Rank] = js.native
  
  def concatAlongFirstAxis(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def concatenate(tensors: js.Array[Tensor[Rank]]): Tensor[Rank] = js.native
  def concatenate(tensors: js.Array[Tensor[Rank]], axis: Double): Tensor[Rank] = js.native
  
  def countParams(x: HasShape): Double = js.native
  
  def dot(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  def dot(a: Tensor[Rank], b: Tensor[Rank], activation: js.UndefOr[scala.Nothing], bias: Tensor[Rank]): Tensor[Rank] = js.native
  def dot(a: Tensor[Rank], b: Tensor[Rank], activation: Activation): Tensor[Rank] = js.native
  def dot(a: Tensor[Rank], b: Tensor[Rank], activation: Activation, bias: Tensor[Rank]): Tensor[Rank] = js.native
  
  def dropout(x: Tensor[Rank], level: Double): Tensor[Rank] = js.native
  def dropout(x: Tensor[Rank], level: Double, noiseShape: js.UndefOr[scala.Nothing], seed: Double): Tensor[Rank] = js.native
  def dropout(x: Tensor[Rank], level: Double, noiseShape: js.Array[Double]): Tensor[Rank] = js.native
  def dropout(x: Tensor[Rank], level: Double, noiseShape: js.Array[Double], seed: Double): Tensor[Rank] = js.native
  
  def elu(x: Tensor[Rank]): Tensor[Rank] = js.native
  def elu(x: Tensor[Rank], alpha: Double): Tensor[Rank] = js.native
  
  def expandDims(x: Tensor[Rank]): Tensor[Rank] = js.native
  def expandDims(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  
  def flatten(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def gather(reference: Tensor[Rank], indices: js.Array[Double]): Tensor[Rank] = js.native
  def gather(reference: Tensor[Rank], indices: js.Array[Double], axis: Double): Tensor[Rank] = js.native
  def gather(reference: Tensor[Rank], indices: Tensor1D): Tensor[Rank] = js.native
  def gather(reference: Tensor[Rank], indices: Tensor1D, axis: Double): Tensor[Rank] = js.native
  
  def getBackend(): cpu | webgl = js.native
  
  def hardSigmoid(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def inTrainPhase[T](x: js.Function0[T], alt: js.Function0[T]): T = js.native
  def inTrainPhase[T](x: js.Function0[T], alt: js.Function0[T], training: Boolean): T = js.native
  
  def isBackendSymbolic(): Boolean = js.native
  
  def oneHot(indices: Tensor[Rank], numClasses: Double): Tensor[Rank] = js.native
  
  def pow(x: Tensor[Rank], a: Double): Tensor[Rank] = js.native
  def pow(x: Tensor[Rank], a: Tensor[Rank]): Tensor[Rank] = js.native
  
  def randomNormal(shape: Shape): Tensor[Rank] = js.native
  def randomNormal(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[Rank] = js.native
  def randomNormal(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double): Tensor[Rank] = js.native
  def randomNormal(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[Rank] = js.native
  def randomNormal(shape: Shape, mean: Double): Tensor[Rank] = js.native
  def randomNormal(
    shape: Shape,
    mean: Double,
    stddev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[Rank] = js.native
  def randomNormal(shape: Shape, mean: Double, stddev: Double): Tensor[Rank] = js.native
  def randomNormal(shape: Shape, mean: Double, stddev: Double, dtype: js.UndefOr[scala.Nothing], seed: Double): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: js.UndefOr[scala.Nothing], dtype: float32): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: float32,
    seed: Double
  ): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double, dtype: float32): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double, dtype: float32, seed: Double): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: Double, stddev: js.UndefOr[scala.Nothing], dtype: float32): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: Double, stddev: js.UndefOr[scala.Nothing], dtype: float32, seed: Double): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: Double, stddev: Double, dtype: float32): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_float32(shape: Shape, mean: Double, stddev: Double, dtype: float32, seed: Double): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: js.UndefOr[scala.Nothing], dtype: int32): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(
    shape: Shape,
    mean: js.UndefOr[scala.Nothing],
    stddev: js.UndefOr[scala.Nothing],
    dtype: int32,
    seed: Double
  ): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double, dtype: int32): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: js.UndefOr[scala.Nothing], stddev: Double, dtype: int32, seed: Double): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: Double, stddev: js.UndefOr[scala.Nothing], dtype: int32): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: Double, stddev: js.UndefOr[scala.Nothing], dtype: int32, seed: Double): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: Double, stddev: Double, dtype: int32): Tensor[Rank] = js.native
  @JSName("randomNormal")
  def randomNormal_int32(shape: Shape, mean: Double, stddev: Double, dtype: int32, seed: Double): Tensor[Rank] = js.native
  
  def repeat(x: Tensor[Rank], n: Double): Tensor[Rank] = js.native
  
  @JSName("setBackend")
  def setBackend_cpu(requestedBackend: cpu): Unit = js.native
  @JSName("setBackend")
  def setBackend_webgl(requestedBackend: webgl): Unit = js.native
  
  def sign(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def sliceAlongAxis(array: Tensor[Rank], start: Double, size: Double, axis: Double): Tensor[Rank] = js.native
  
  def sliceAlongFirstAxis(array: Tensor[Rank], start: Double, size: Double): Tensor[Rank] = js.native
  
  def sliceAlongLastAxis(array: Tensor[Rank], start: Double, size: Double): Tensor[Rank] = js.native
  
  def softsign(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def square(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def tile(x: Tensor[Rank], n: js.Array[Double]): Tensor[Rank] = js.native
  def tile(x: Tensor[Rank], n: Double): Tensor[Rank] = js.native
}
