package typings.atTensorflowTfjsDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Variable
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTensorUnderscoreTypesMod {
  type GradSaveFunc = js.Function1[/* save */ js.Array[Tensor[Rank]], Unit]
  type NamedTensorMap = StringDictionary[Tensor[Rank]]
  type NamedVariableMap = StringDictionary[Variable[Rank]]
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainerObject
    - typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainerArray
    - typings.std.Float32Array
    - typings.std.Int32Array
    - typings.std.Uint8Array
  */
  type TensorContainer = _TensorContainer | Tensor[Rank] | Unit | String | Double | Boolean | Float32Array | Int32Array | Uint8Array
}
