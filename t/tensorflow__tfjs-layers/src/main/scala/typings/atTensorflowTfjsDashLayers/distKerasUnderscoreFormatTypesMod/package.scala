package typings.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatTypesMod {
  type PyJson[Keys /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ x in Keys ]:? @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue}
    */ typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.PyJson with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonArray
    - typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonDict
  */
  type PyJsonValue = _PyJsonValue | Boolean | Double | String | Null
}
