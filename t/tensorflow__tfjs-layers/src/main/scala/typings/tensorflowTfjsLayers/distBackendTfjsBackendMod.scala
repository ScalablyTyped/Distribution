package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.distTypesMod.HasShape
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.cpu
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendTfjsBackendMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/backend/tfjs_backend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchFlatten(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("batchFlatten")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  inline def biasAdd(x: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("biasAdd")(x.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def biasAdd(x: Tensor[Rank], bias: Tensor[Rank], dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("biasAdd")(x.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def cast(x: Tensor[Rank], dtype: DataType): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def concatAlongFirstAxis(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatAlongFirstAxis")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def concatenate(tensors: js.Array[Tensor[Rank]]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(tensors.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def concatenate(tensors: js.Array[Tensor[Rank]], axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(tensors.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def countParams(x: HasShape): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countParams")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def dot(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def dot(a: Tensor[Rank], b: Tensor[Rank], activation: Unit, bias: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def dot(a: Tensor[Rank], b: Tensor[Rank], activation: Activation): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def dot(a: Tensor[Rank], b: Tensor[Rank], activation: Activation, bias: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], activation.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def dropout(x: Tensor[Rank], level: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropout")(x.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def dropout(x: Tensor[Rank], level: Double, noiseShape: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropout")(x.asInstanceOf[js.Any], level.asInstanceOf[js.Any], noiseShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def dropout(x: Tensor[Rank], level: Double, noiseShape: js.Array[Double], seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropout")(x.asInstanceOf[js.Any], level.asInstanceOf[js.Any], noiseShape.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def dropout(x: Tensor[Rank], level: Double, noiseShape: Unit, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropout")(x.asInstanceOf[js.Any], level.asInstanceOf[js.Any], noiseShape.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def elu(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def elu(x: Tensor[Rank], alpha: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("elu")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def expandDims(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def expandDims(x: Tensor[Rank], axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def flatten(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  inline def gather(reference: Tensor[Rank], indices: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(reference.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def gather(reference: Tensor[Rank], indices: js.Array[Double], axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(reference.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def gather(reference: Tensor[Rank], indices: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(reference.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def gather(reference: Tensor[Rank], indices: Tensor1D, axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(reference.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def getBackend(): cpu | webgl = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackend")().asInstanceOf[cpu | webgl]
  
  inline def hardSigmoid(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("hardSigmoid")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  inline def inTrainPhase[T](x: js.Function0[T], alt: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inTrainPhase")(x.asInstanceOf[js.Any], alt.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def inTrainPhase[T](x: js.Function0[T], alt: js.Function0[T], training: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inTrainPhase")(x.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], training.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def isBackendSymbolic(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBackendSymbolic")().asInstanceOf[Boolean]
  
  inline def oneHot(indices: Tensor[Rank], numClasses: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("oneHot")(indices.asInstanceOf[js.Any], numClasses.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def pow(x: Tensor[Rank], a: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pow(x: Tensor[Rank], a: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def randomNormal(shape: Shape): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Double, stddev: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Double, stddev: Double, dtype: float32 | int32): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Double, stddev: Double, dtype: float32 | int32, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Double, stddev: Double, dtype: Unit, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Double, stddev: Unit, dtype: float32 | int32): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Double, stddev: Unit, dtype: float32 | int32, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Double, stddev: Unit, dtype: Unit, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Unit, stddev: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Unit, stddev: Double, dtype: float32 | int32): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Unit, stddev: Double, dtype: float32 | int32, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Unit, stddev: Double, dtype: Unit, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Unit, stddev: Unit, dtype: float32 | int32): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Unit, stddev: Unit, dtype: float32 | int32, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def randomNormal(shape: Shape, mean: Unit, stddev: Unit, dtype: Unit, seed: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stddev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def repeat(x: Tensor[Rank], n: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def setBackend(requestedBackend: cpu | webgl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBackend")(requestedBackend.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sign(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  inline def sliceAlongAxis(array: Tensor[Rank], start: Double, size: Double, axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceAlongAxis")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], size.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def sliceAlongFirstAxis(array: Tensor[Rank], start: Double, size: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceAlongFirstAxis")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def sliceAlongLastAxis(array: Tensor[Rank], start: Double, size: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceAlongLastAxis")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def softsign(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("softsign")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  inline def square(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  
  inline def tile(x: Tensor[Rank], n: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def tile(x: Tensor[Rank], n: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
}
