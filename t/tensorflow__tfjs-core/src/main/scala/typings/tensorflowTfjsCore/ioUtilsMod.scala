package typings.tensorflowTfjsCore

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint16Array
import typings.tensorflowTfjsCore.anon.Data
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typings.tensorflowTfjsCore.typesMod.WeightGroup
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioUtilsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "arrayBufferToBase64String")
  @js.native
  def arrayBufferToBase64String(buffer: ArrayBuffer): String = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "base64StringToArrayBuffer")
  @js.native
  def base64StringToArrayBuffer(str: String): ArrayBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "basename")
  @js.native
  def basename(path: String): String = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "concatenateArrayBuffers")
  @js.native
  def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "concatenateTypedArrays")
  @js.native
  def concatenateTypedArrays(xs: js.Array[TypedArray]): ArrayBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "decodeWeights")
  @js.native
  def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "encodeWeights")
  @js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "encodeWeights")
  @js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "encodeWeights")
  @js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "encodeWeights")
  @js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "getFloat16Decoder")
  @js.native
  def getFloat16Decoder(): js.Function1[/* buffer */ Uint16Array, Float32Array] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "getModelArtifactsInfoForJSON")
  @js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", "stringByteLength")
  @js.native
  def stringByteLength(str: String): Double = js.native
}
