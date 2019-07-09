package typings
package atTensorflowTfjsDashNodeLib.distTensorboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/tensorboard", "SummaryFileWriter")
@js.native
class SummaryFileWriter protected () extends js.Object {
  def this(resourceHandle: atTensorflowTfjsLib.atTensorflowTfjsMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]) = this()
  var backend: atTensorflowTfjsDashNodeLib.distNodejsUnderscoreKernelUnderscoreBackendMod.NodeJSKernelBackend = js.native
  val resourceHandle: js.Any = js.native
  /**
    * Force summary writer to send all buffered data to storage.
    */
  def flush(): scala.Unit = js.native
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
  def scalar(
    name: java.lang.String,
    value: atTensorflowTfjsDashCoreLib.distTensorMod.Scalar,
    step: scala.Double
  ): scala.Unit = js.native
  def scalar(
    name: java.lang.String,
    value: atTensorflowTfjsDashCoreLib.distTensorMod.Scalar,
    step: scala.Double,
    description: java.lang.String
  ): scala.Unit = js.native
  def scalar(name: java.lang.String, value: scala.Double, step: scala.Double): scala.Unit = js.native
  def scalar(name: java.lang.String, value: scala.Double, step: scala.Double, description: java.lang.String): scala.Unit = js.native
}

