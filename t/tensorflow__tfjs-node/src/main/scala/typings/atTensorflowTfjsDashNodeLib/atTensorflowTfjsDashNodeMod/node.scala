package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "node")
@js.native
object node extends js.Object {
  @JSName("summaryFileWriter")
  var summaryFileWriter_Original: js.Function4[
    /* logdir */ java.lang.String, 
    /* maxQueue */ js.UndefOr[scala.Double], 
    /* flushMillis */ js.UndefOr[scala.Double], 
    /* filenameSuffix */ js.UndefOr[java.lang.String], 
    atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter
  ] = js.native
  @JSName("tensorBoard")
  var tensorBoard_Original: js.Function2[
    /* logdir */ js.UndefOr[java.lang.String], 
    /* args */ js.UndefOr[atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallbackArgs], 
    atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallback
  ] = js.native
  def summaryFileWriter(logdir: java.lang.String): atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter = js.native
  def summaryFileWriter(logdir: java.lang.String, maxQueue: scala.Double): atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter = js.native
  def summaryFileWriter(logdir: java.lang.String, maxQueue: scala.Double, flushMillis: scala.Double): atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter = js.native
  def summaryFileWriter(
    logdir: java.lang.String,
    maxQueue: scala.Double,
    flushMillis: scala.Double,
    filenameSuffix: java.lang.String
  ): atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter = js.native
  def tensorBoard(): atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallback = js.native
  def tensorBoard(logdir: java.lang.String): atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallback = js.native
  def tensorBoard(
    logdir: java.lang.String,
    args: atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallbackArgs
  ): atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallback = js.native
}

