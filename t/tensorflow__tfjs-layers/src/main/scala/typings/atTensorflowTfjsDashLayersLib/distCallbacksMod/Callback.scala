package typings
package atTensorflowTfjsDashLayersLib.distCallbacksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/callbacks", "Callback")
@js.native
abstract class Callback ()
  extends atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback {
  /** Instance of `keras.models.Model`. Reference of the model being trained. */
  var model: atTensorflowTfjsDashLayersLib.distEngineTrainingMod.LayersModel = js.native
}

