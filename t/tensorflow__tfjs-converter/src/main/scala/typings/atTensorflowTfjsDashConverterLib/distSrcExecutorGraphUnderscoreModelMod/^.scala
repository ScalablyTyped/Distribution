package typings
package atTensorflowTfjsDashConverterLib.distSrcExecutorGraphUnderscoreModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/graph_model", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_MODEL_NAME: atTensorflowTfjsDashConverterLib.atTensorflowTfjsDashConverterLibStrings.modelDOTjson = js.native
  val TFHUB_SEARCH_PARAM: atTensorflowTfjsDashConverterLib.atTensorflowTfjsDashConverterLibStrings.`?tfjs-format=file` = js.native
  def loadGraphModel(modelUrl: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler): js.Promise[GraphModel] = js.native
  def loadGraphModel(
    modelUrl: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler,
    options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions
  ): js.Promise[GraphModel] = js.native
  def loadGraphModel(modelUrl: java.lang.String): js.Promise[GraphModel] = js.native
  def loadGraphModel(modelUrl: java.lang.String, options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): js.Promise[GraphModel] = js.native
}

