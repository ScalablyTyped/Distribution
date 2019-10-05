package typings.atTensorflowTfjsDashLayers.distActivationsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/activations", "getActivation")
@js.native
object getActivation extends js.Object {
  def apply(identifier: ConfigDict): Activation = js.native
  def apply(identifier: Activation): Activation = js.native
  def apply(identifier: ActivationIdentifier): Activation = js.native
}

