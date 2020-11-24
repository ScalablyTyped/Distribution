package typings.tensorflowTfjsNode.tensorboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node/dist/tensorboard", "summaryFileWriter")
@js.native
object summaryFileWriter extends js.Object {
  
  def apply(logdir: String): SummaryFileWriter_ = js.native
  def apply(
    logdir: String,
    maxQueue: js.UndefOr[scala.Nothing],
    flushMillis: js.UndefOr[scala.Nothing],
    filenameSuffix: String
  ): SummaryFileWriter_ = js.native
  def apply(logdir: String, maxQueue: js.UndefOr[scala.Nothing], flushMillis: Double): SummaryFileWriter_ = js.native
  def apply(logdir: String, maxQueue: js.UndefOr[scala.Nothing], flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = js.native
  def apply(logdir: String, maxQueue: Double): SummaryFileWriter_ = js.native
  def apply(logdir: String, maxQueue: Double, flushMillis: js.UndefOr[scala.Nothing], filenameSuffix: String): SummaryFileWriter_ = js.native
  def apply(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter_ = js.native
  def apply(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = js.native
}
