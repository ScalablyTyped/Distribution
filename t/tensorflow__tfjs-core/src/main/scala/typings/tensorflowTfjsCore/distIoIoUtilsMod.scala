package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Data
import typings.tensorflowTfjsCore.distIoTypesMod.ModelArtifacts
import typings.tensorflowTfjsCore.distIoTypesMod.ModelArtifactsInfo
import typings.tensorflowTfjsCore.distIoTypesMod.ModelJSON
import typings.tensorflowTfjsCore.distIoTypesMod.WeightGroup
import typings.tensorflowTfjsCore.distIoTypesMod.WeightsManifestConfig
import typings.tensorflowTfjsCore.distIoTypesMod.WeightsManifestEntry
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoIoUtilsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/io_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayBufferToBase64String(buffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToBase64String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64StringToArrayBuffer(str: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("base64StringToArrayBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def concatenateArrayBuffers(buffers: js.Array[js.typedarray.ArrayBuffer]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateArrayBuffers")(buffers.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def concatenateTypedArrays(xs: js.Array[TypedArray]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateTypedArrays")(xs.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def decodeWeights(buffer: js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeWeights")(buffer.asInstanceOf[js.Any], specs.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  
  inline def getFloat16Decoder(): js.Function1[/* buffer */ js.typedarray.Uint16Array, js.typedarray.Float32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFloat16Decoder")().asInstanceOf[js.Function1[/* buffer */ js.typedarray.Uint16Array, js.typedarray.Float32Array]]
  
  inline def getModelArtifactsForJSON(
    modelJSON: ModelJSON,
    loadWeights: js.Function1[
      /* weightsManifest */ WeightsManifestConfig, 
      js.Promise[js.Tuple2[js.Array[WeightsManifestEntry], js.typedarray.ArrayBuffer]]
    ]
  ): js.Promise[ModelArtifacts] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSON")(modelJSON.asInstanceOf[js.Any], loadWeights.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModelArtifacts]]
  
  inline def getModelArtifactsForJSONSync(modelJSON: ModelJSON): ModelArtifacts = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSONSync")(modelJSON.asInstanceOf[js.Any]).asInstanceOf[ModelArtifacts]
  inline def getModelArtifactsForJSONSync(modelJSON: ModelJSON, weightSpecs: js.Array[WeightsManifestEntry]): ModelArtifacts = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSONSync")(modelJSON.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[ModelArtifacts]
  inline def getModelArtifactsForJSONSync(
    modelJSON: ModelJSON,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): ModelArtifacts = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSONSync")(modelJSON.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[ModelArtifacts]
  inline def getModelArtifactsForJSONSync(modelJSON: ModelJSON, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): ModelArtifacts = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSONSync")(modelJSON.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[ModelArtifacts]
  
  inline def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsInfoForJSON")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[ModelArtifactsInfo]
  
  inline def getModelJSONForModelArtifacts(artifacts: ModelArtifacts, manifest: WeightsManifestConfig): ModelJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelJSONForModelArtifacts")(artifacts.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[ModelJSON]
  
  inline def getWeightSpecs(weightsManifest: WeightsManifestConfig): js.Array[WeightsManifestEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeightSpecs")(weightsManifest.asInstanceOf[js.Any]).asInstanceOf[js.Array[WeightsManifestEntry]]
  
  inline def stringByteLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringByteLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
}
