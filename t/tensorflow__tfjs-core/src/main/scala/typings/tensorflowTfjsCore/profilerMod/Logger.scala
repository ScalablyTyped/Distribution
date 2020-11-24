package typings.tensorflowTfjsCore.profilerMod

import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/profiler", "Logger")
@js.native
class Logger () extends js.Object {
  
  def logKernelProfile(name: String, result: Tensor[Rank], vals: TypedArray, timeMs: Double, inputs: NamedTensorMap): Unit = js.native
  def logKernelProfile(
    name: String,
    result: Tensor[Rank],
    vals: TypedArray,
    timeMs: Double,
    inputs: NamedTensorMap,
    extraInfo: String
  ): Unit = js.native
  def logKernelProfile(name: String, result: Tensor[Rank], vals: TypedArray, timeMs: Error, inputs: NamedTensorMap): Unit = js.native
  def logKernelProfile(
    name: String,
    result: Tensor[Rank],
    vals: TypedArray,
    timeMs: Error,
    inputs: NamedTensorMap,
    extraInfo: String
  ): Unit = js.native
}
