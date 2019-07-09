package typings
package atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_YIELD_EVERY_MS: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibNumbers.`125` = js.native
  def configureCallbacks(
    callbacks: js.Array[BaseCallback],
    verbose: ModelLoggingVerbosity,
    epochs: scala.Double,
    initialEpoch: scala.Double,
    numTrainSamples: scala.Double,
    stepsPerEpoch: scala.Double,
    batchSize: scala.Double,
    doValidation: scala.Boolean,
    callbackMetrics: js.Array[java.lang.String]
  ): atTensorflowTfjsDashLayersLib.Anon_CallbackList = js.native
  def standardizeCallbacks(callbacks: BaseCallback, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  def standardizeCallbacks(callbacks: CustomCallbackArgs, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  def standardizeCallbacks(callbacks: js.Array[BaseCallback | CustomCallbackArgs], yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
}

