package typings
package atTensorflowTfjsDashConverterLib.atTensorflowTfjsDashConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version_converter: atTensorflowTfjsDashConverterLib.atTensorflowTfjsDashConverterLibStrings.`1DOT2DOT5` = js.native
  def deregisterOp(name: java.lang.String): scala.Unit = js.native
  def loadGraphModel(modelUrl: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler): js.Promise[
    atTensorflowTfjsDashConverterLib.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(
    modelUrl: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler,
    options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions
  ): js.Promise[
    atTensorflowTfjsDashConverterLib.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(modelUrl: java.lang.String): js.Promise[
    atTensorflowTfjsDashConverterLib.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(modelUrl: java.lang.String, options: atTensorflowTfjsDashCoreLib.distIoTypesMod.LoadOptions): js.Promise[
    atTensorflowTfjsDashConverterLib.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def registerOp(
    name: java.lang.String,
    opFunc: atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod.OpExecutor
  ): scala.Unit = js.native
}

