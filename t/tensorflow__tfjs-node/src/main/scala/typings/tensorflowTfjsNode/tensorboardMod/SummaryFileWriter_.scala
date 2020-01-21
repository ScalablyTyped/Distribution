package typings.tensorflowTfjsNode.tensorboardMod

import typings.tensorflowTfjs.mod.Tensor_
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsNode.nodejsKernelBackendMod.NodeJSKernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/tensorboard", "SummaryFileWriter")
@js.native
class SummaryFileWriter_ protected () extends js.Object {
  def this(resourceHandle: Tensor_[Rank]) = this()
  var backend: NodeJSKernelBackend = js.native
  val resourceHandle: js.Any = js.native
  /**
    * Force summary writer to send all buffered data to storage.
    */
  def flush(): Unit = js.native
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

