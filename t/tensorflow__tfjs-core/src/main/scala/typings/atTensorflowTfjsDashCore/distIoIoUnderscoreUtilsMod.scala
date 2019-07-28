package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifactsInfo
import typings.atTensorflowTfjsDashCore.distIoTypesMod.WeightGroup
import typings.atTensorflowTfjsDashCore.distIoTypesMod.WeightsManifestEntry
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensor
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import typings.atTensorflowTfjsDashCore.distTypesMod.TypedArray
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/io_utils", JSImport.Namespace)
@js.native
object distIoIoUnderscoreUtilsMod extends js.Object {
  def arrayBufferToBase64String(buffer: ArrayBuffer): String = js.native
  def base64StringToArrayBuffer(str: String): ArrayBuffer = js.native
  def basename(path: String): String = js.native
  def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = js.native
  def concatenateTypedArrays(xs: js.Array[TypedArray]): ArrayBuffer = js.native
  def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Anon_Data] = js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Anon_Data] = js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[Anon_Data] = js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Anon_Data] = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  def stringByteLength(str: String): Double = js.native
}

