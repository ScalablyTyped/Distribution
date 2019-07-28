package typings.atTensorflowTfjsDashLayers.distActivationsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/activations", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserializeActivation(config: ConfigDict): Activation = js.native
  def deserializeActivation(config: ConfigDict, customObjects: ConfigDict): Activation = js.native
  def getActivation(identifier: ConfigDict): Activation = js.native
  def getActivation(identifier: Activation): Activation = js.native
  def getActivation(identifier: ActivationIdentifier): Activation = js.native
  def serializeActivation(activation: Activation): String = js.native
}

