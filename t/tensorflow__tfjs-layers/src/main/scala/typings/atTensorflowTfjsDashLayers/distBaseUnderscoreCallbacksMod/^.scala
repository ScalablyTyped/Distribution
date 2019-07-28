package typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod

import typings.atTensorflowTfjsDashLayers.Anon_CallbackList
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`125`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/base_callbacks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_YIELD_EVERY_MS: `125` = js.native
  def configureCallbacks(
    callbacks: js.Array[BaseCallback],
    verbose: ModelLoggingVerbosity,
    epochs: Double,
    initialEpoch: Double,
    numTrainSamples: Double,
    stepsPerEpoch: Double,
    batchSize: Double,
    doValidation: Boolean,
    callbackMetrics: js.Array[String]
  ): Anon_CallbackList = js.native
  def standardizeCallbacks(callbacks: js.Array[BaseCallback | CustomCallbackArgs], yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  def standardizeCallbacks(callbacks: BaseCallback, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
  def standardizeCallbacks(callbacks: CustomCallbackArgs, yieldEvery: YieldEveryOptions): js.Array[BaseCallback] = js.native
}

