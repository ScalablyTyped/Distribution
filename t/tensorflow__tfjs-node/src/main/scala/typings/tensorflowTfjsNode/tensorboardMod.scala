package typings.tensorflowTfjsNode

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsNode.nodejsKernelBackendMod.NodeJSKernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorboardMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/tensorboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/tensorboard", "SummaryFileWriter")
  @js.native
  class SummaryFileWriter_ protected () extends StObject {
    def this(resourceHandle: Tensor[Rank]) = this()
    
    var backend: NodeJSKernelBackend = js.native
    
    /**
      * Force summary writer to send all buffered data to storage.
      */
    def flush(): Unit = js.native
    
    val resourceHandle: js.Any = js.native
    
    def scalar(name: String, value: Double, step: Double): Unit = js.native
    def scalar(name: String, value: Double, step: Double, description: String): Unit = js.native
    /**
      * Write a scalar summary.
      *
      * @param name A name of the summary. The summary tag for TensorBoard will be
      *   this name.
      * @param value A real numeric scalar value, as `tf.Scalar` or a JavaScript
      *   `number`.
      * @param step Required `int64`-castable, monotically-increasing step value.
      * @param description Optinal long-form description for this summary, as a
      *   `string`. *Not implemented yet*.
      */
    def scalar(name: String, value: Scalar, step: Double): Unit = js.native
    def scalar(name: String, value: Scalar, step: Double, description: String): Unit = js.native
  }
  
  @scala.inline
  def summaryFileWriter(logdir: String): SummaryFileWriter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any]).asInstanceOf[SummaryFileWriter_]
  @scala.inline
  def summaryFileWriter(logdir: String, maxQueue: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  @scala.inline
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  @scala.inline
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  @scala.inline
  def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Unit, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  @scala.inline
  def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  @scala.inline
  def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  @scala.inline
  def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Unit, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
}
