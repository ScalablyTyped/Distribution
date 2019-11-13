package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatTopologyUnderscoreConfigMod {
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.batch_input_shape
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.batch_size
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.dtype
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.input_dtype
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.input_shape
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.name
  import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.trainable
  import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJson
  import typings.std.Extract

  type JsonLayer[C /* <: LayerConfig */] = C with LayerConfig with (PyJson[
    Extract[
      input_shape | batch_input_shape | batch_size | dtype | name | trainable | input_dtype | String, 
      String
    ]
  ])
}
