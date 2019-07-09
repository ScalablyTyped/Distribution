package typings
package atTensorflowTfjsDashNodeLib.distTensorboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/tensorboard", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def summaryFileWriter(logdir: java.lang.String): SummaryFileWriter = js.native
  def summaryFileWriter(logdir: java.lang.String, maxQueue: scala.Double): SummaryFileWriter = js.native
  def summaryFileWriter(logdir: java.lang.String, maxQueue: scala.Double, flushMillis: scala.Double): SummaryFileWriter = js.native
  def summaryFileWriter(
    logdir: java.lang.String,
    maxQueue: scala.Double,
    flushMillis: scala.Double,
    filenameSuffix: java.lang.String
  ): SummaryFileWriter = js.native
}

