package typings
package atTensorflowTfjsDashLayersLib.distActivationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/activations", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserializeActivation(config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict): Activation = js.native
  def deserializeActivation(
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): Activation = js.native
  def getActivation(identifier: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict): Activation = js.native
  def getActivation(identifier: Activation): Activation = js.native
  def getActivation(
    identifier: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier
  ): Activation = js.native
  def serializeActivation(activation: Activation): java.lang.String = js.native
}

