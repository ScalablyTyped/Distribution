package typings
package atTensorflowTfjsDashLayersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatTypesMod {
  type PyJson[Keys /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ x in Keys ]:? @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/types.PyJsonValue}
    */ atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibStrings.PyJson with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - PyJsonArray
    - PyJsonDict
  */
  type PyJsonValue = _PyJsonValue | scala.Boolean | scala.Double | java.lang.String | scala.Null
}
