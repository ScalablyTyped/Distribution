package typings.tensorflowTfjsCore

import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typings.tensorflowTfjsCore.typesMod.WeightGroup
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/io_utils", JSImport.Namespace)
@js.native
object ioUtilsMod extends js.Object {
  def arrayBufferToBase64String(buffer: ArrayBuffer): String = js.native
  def base64StringToArrayBuffer(str: String): ArrayBuffer = js.native
  def basename(path: String): String = js.native
  def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = js.native
  def concatenateTypedArrays(xs: js.Array[TypedArray]): ArrayBuffer = js.native
  def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[AnonData] = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  def stringByteLength(str: String): Double = js.native
}

