package typings.atTensorflowTfjsDashConverter.atTensorflowTfjsDashConverterMod

import typings.atTensorflowTfjsDashConverter.atTensorflowTfjsDashConverterStrings.`1DOT2DOT8`
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.OpExecutor
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version_converter: `1DOT2DOT8` = js.native
  def deregisterOp(name: String): Unit = js.native
  def loadGraphModel(modelUrl: String): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(modelUrl: String, options: LoadOptions): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(modelUrl: IOHandler): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(modelUrl: IOHandler, options: LoadOptions): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def registerOp(name: String, opFunc: OpExecutor): Unit = js.native
}

