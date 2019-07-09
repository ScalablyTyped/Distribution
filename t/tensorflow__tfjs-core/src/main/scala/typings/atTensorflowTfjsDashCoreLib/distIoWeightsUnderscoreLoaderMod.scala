package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", JSImport.Namespace)
@js.native
object distIoWeightsUnderscoreLoaderMod extends js.Object {
  def loadWeights(manifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap] = js.native
  def loadWeights(
    manifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig,
    filePathPrefix: java.lang.String
  ): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap] = js.native
  def loadWeights(
    manifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig,
    filePathPrefix: java.lang.String,
    weightNames: js.Array[java.lang.String]
  ): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap] = js.native
  def loadWeights(
    manifest: atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig,
    filePathPrefix: java.lang.String,
    weightNames: js.Array[java.lang.String],
    requestInit: stdLib.RequestInit
  ): js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap] = js.native
  def loadWeightsAsArrayBuffer(fetchURLs: js.Array[java.lang.String]): js.Promise[js.Array[stdLib.ArrayBuffer]] = js.native
  def loadWeightsAsArrayBuffer(
    fetchURLs: js.Array[java.lang.String],
    loadOptions: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions
  ): js.Promise[js.Array[stdLib.ArrayBuffer]] = js.native
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[
      /* fetchUrls */ js.Array[java.lang.String], 
      js.Promise[js.Array[stdLib.ArrayBuffer]]
    ]
  ): js.Function3[
    /* manifest */ atTensorflowTfjsDashCoreLib.distIoTypesMod.WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[java.lang.String], 
    /* weightNames */ js.UndefOr[js.Array[java.lang.String]], 
    js.Promise[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap]
  ] = js.native
}

