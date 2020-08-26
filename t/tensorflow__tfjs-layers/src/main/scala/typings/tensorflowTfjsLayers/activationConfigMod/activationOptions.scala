package typings.tensorflowTfjsLayers.activationConfigMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hard_sigmoid
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/keras_format/activation_config", "activationOptions")
@js.native
object activationOptions
  extends TopLevel[
      js.Array[
        linear | relu_ | elu_ | relu6 | sigmoid | softplus | tanh | softmax_ | selu | hard_sigmoid | softsign
      ]
    ]

