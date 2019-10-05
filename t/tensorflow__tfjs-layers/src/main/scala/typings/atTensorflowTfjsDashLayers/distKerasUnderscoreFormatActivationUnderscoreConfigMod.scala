package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.elu
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.hard_sigmoid
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.linear
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.relu
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.relu6
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.selu
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.sigmoid
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.softmax
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.softplus
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.softsign
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.tanh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/activation_config", JSImport.Namespace)
@js.native
object distKerasUnderscoreFormatActivationUnderscoreConfigMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.elu
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.hardSigmoid
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.linear
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.relu
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.relu6
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.selu
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.sigmoid
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.softmax
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.softplus
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.softsign
    - typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.tanh
  */
  trait ActivationIdentifier extends js.Object
  
  val activationOptions: js.Array[
    elu | hard_sigmoid | linear | relu | relu6 | selu | sigmoid | softmax | softplus | softsign | tanh
  ] = js.native
  type ActivationSerialization = /* import warning: ImportType.apply Failed type conversion: std.Array<'elu' | 'hard_sigmoid' | 'linear' | 'relu' | 'relu6' | 'selu' | 'sigmoid' | 'softmax' | 'softplus' | 'softsign' | 'tanh'>[number] */ js.Any
}

