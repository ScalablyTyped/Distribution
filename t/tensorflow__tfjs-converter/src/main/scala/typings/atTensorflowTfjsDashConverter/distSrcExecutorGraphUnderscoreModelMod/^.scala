package typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod

import typings.atTensorflowTfjsDashConverter.atTensorflowTfjsDashConverterStrings.`?tfjs-format=file`
import typings.atTensorflowTfjsDashConverter.atTensorflowTfjsDashConverterStrings.modelDOTjson
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/graph_model", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_MODEL_NAME: modelDOTjson = js.native
  val TFHUB_SEARCH_PARAM: `?tfjs-format=file` = js.native
  def loadGraphModel(modelUrl: String): js.Promise[GraphModel] = js.native
  def loadGraphModel(modelUrl: String, options: LoadOptions): js.Promise[GraphModel] = js.native
  def loadGraphModel(modelUrl: IOHandler): js.Promise[GraphModel] = js.native
  def loadGraphModel(modelUrl: IOHandler, options: LoadOptions): js.Promise[GraphModel] = js.native
}

