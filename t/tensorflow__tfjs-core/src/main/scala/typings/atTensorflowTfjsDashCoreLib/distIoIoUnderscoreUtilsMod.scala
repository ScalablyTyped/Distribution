package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/io_utils", JSImport.Namespace)
@js.native
object distIoIoUnderscoreUtilsMod extends js.Object {
  def arrayBufferToBase64String(buffer: stdLib.ArrayBuffer): java.lang.String = js.native
  def base64StringToArrayBuffer(str: java.lang.String): stdLib.ArrayBuffer = js.native
  def basename(path: java.lang.String): java.lang.String = js.native
  def concatenateArrayBuffers(buffers: js.Array[stdLib.ArrayBuffer]): stdLib.ArrayBuffer = js.native
  def concatenateTypedArrays(xs: js.Array[atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray]): stdLib.ArrayBuffer = js.native
  def decodeWeights(
    buffer: stdLib.ArrayBuffer,
    specs: js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestEntry]
  ): atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
  def encodeWeights(tensors: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap): js.Promise[atTensorflowTfjsDashCoreLib.Anon_Data] = js.native
  def encodeWeights(
    tensors: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    group: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightGroup
  ): js.Promise[atTensorflowTfjsDashCoreLib.Anon_Data] = js.native
  def encodeWeights(tensors: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor]): js.Promise[atTensorflowTfjsDashCoreLib.Anon_Data] = js.native
  def encodeWeights(
    tensors: js.Array[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensor],
    group: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightGroup
  ): js.Promise[atTensorflowTfjsDashCoreLib.Anon_Data] = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifacts): atTensorflowTfjsDashCoreLib.distIoTypesMod.ModelArtifactsInfo = js.native
  def stringByteLength(str: java.lang.String): scala.Double = js.native
}

