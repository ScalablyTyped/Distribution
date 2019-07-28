package typings.atTensorflowTfjsDashNode.distTensorboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/tensorboard", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def summaryFileWriter(logdir: String): SummaryFileWriter = js.native
  def summaryFileWriter(logdir: String, maxQueue: Double): SummaryFileWriter = js.native
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter = js.native
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter = js.native
}

