package typings.tensorflowTfjsNode

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsNode.distNodejsKernelBackendMod.NodeJSKernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTensorboardMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/tensorboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/tensorboard", "SummaryFileWriter")
  @js.native
  open class SummaryFileWriter_ protected () extends StObject {
    def this(resourceHandle: Tensor[Rank]) = this()
    
    var backend: NodeJSKernelBackend = js.native
    
    /**
      * Force summary writer to send all buffered data to storage.
      */
    def flush(): Unit = js.native
    
    /**
      * Write a histogram summary, for later analysis in TensorBoard's 'Histograms'
      * and 'Distributions' dashboards (data written using this API will appear in
      * both places). Like `SummaryFileWriter.scalar` points, each histogram is
      * associated with a `step` and a `name`. All the histograms with the same
      * `name` constitute a time series of histograms.
      *
      * The histogram is calculated over all the elements of the given `Tensor`
      * without regard to its shape or rank.
      *
      * @param name  A name for this summary. The summary tag used for TensorBoard
      *     will be this name.
      * @param data  A Tensor of any shape. The histogram is computed over its
      *     elements, which must be castable to `float32`.
      * @param step  Monotonically-increasing step value.
      * @param buckets  Optional positive `number`. The output will have this many
      *     buckets, except in two edge cases. If there is no data, then there are
      *     no buckets. If there is data but all points have the same value, then
      *     there is one bucket whose left and right endpoints are the same.
      * @param description Optional long-form description for this summary, as a
      *    `string`. Markdown is supported. Defaults to empty.
      */
    def histogram(name: String, data: Tensor[Rank], step: Double): Unit = js.native
    def histogram(name: String, data: Tensor[Rank], step: Double, buckets: Double): Unit = js.native
    def histogram(name: String, data: Tensor[Rank], step: Double, buckets: Double, description: String): Unit = js.native
    def histogram(name: String, data: Tensor[Rank], step: Double, buckets: Unit, description: String): Unit = js.native
    
    /* private */ val resourceHandle: Any = js.native
    
    def scalar(name: String, value: Double, step: Double): Unit = js.native
    def scalar(name: String, value: Double, step: Double, description: String): Unit = js.native
    /**
      * Write a scalar summary.
      *
      * @param name A name of the summary. The summary tag for TensorBoard will be
      *   this name.
      * @param value A real numeric scalar value, as `tf.Scalar` or a JavaScript
      *   `number`.
      * @param step Required `int64`-castable, monotonically-increasing step value.
      * @param description Optional long-form description for this summary, as a
      *   `string`. *Not implemented yet*.
      */
    def scalar(name: String, value: Scalar, step: Double): Unit = js.native
    def scalar(name: String, value: Scalar, step: Double, description: String): Unit = js.native
  }
  
  inline def summaryFileWriter(logdir: String): SummaryFileWriter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any]).asInstanceOf[SummaryFileWriter_]
  inline def summaryFileWriter(logdir: String, maxQueue: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  inline def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  inline def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  inline def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Unit, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  inline def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Double): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  inline def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
  inline def summaryFileWriter(logdir: String, maxQueue: Unit, flushMillis: Unit, filenameSuffix: String): SummaryFileWriter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileWriter")(logdir.asInstanceOf[js.Any], maxQueue.asInstanceOf[js.Any], flushMillis.asInstanceOf[js.Any], filenameSuffix.asInstanceOf[js.Any])).asInstanceOf[SummaryFileWriter_]
}
