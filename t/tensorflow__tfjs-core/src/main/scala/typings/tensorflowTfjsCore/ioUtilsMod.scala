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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioUtilsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayBufferToBase64String(buffer: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToBase64String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64StringToArrayBuffer(str: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("base64StringToArrayBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  inline def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateArrayBuffers")(buffers.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  inline def concatenateTypedArrays(xs: js.Array[TypedArray]): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateTypedArrays")(xs.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  inline def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeWeights")(buffer.asInstanceOf[js.Any], specs.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  
  inline def getFloat16Decoder(): js.Function1[/* buffer */ Uint16Array, Float32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFloat16Decoder")().asInstanceOf[js.Function1[/* buffer */ Uint16Array, Float32Array]]
  
  inline def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsInfoForJSON")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[ModelArtifactsInfo]
  
  inline def stringByteLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringByteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
}
