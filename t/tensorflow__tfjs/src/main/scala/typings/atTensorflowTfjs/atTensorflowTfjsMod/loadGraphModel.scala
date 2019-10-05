package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "loadGraphModel")
@js.native
object loadGraphModel extends js.Object {
  def apply(modelUrl: String): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def apply(modelUrl: String, options: LoadOptions): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def apply(modelUrl: IOHandler): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def apply(modelUrl: IOHandler, options: LoadOptions): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
}

