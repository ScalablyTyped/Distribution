package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTensorUnderscoreTypesMod {
  type GradSaveFunc = js.Function1[
    /* save */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    scala.Unit
  ]
  type NamedTensorMap = org.scalablytyped.runtime.StringDictionary[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
  type NamedVariableMap = org.scalablytyped.runtime.StringDictionary[
    atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - TensorContainerObject
    - TensorContainerArray
    - stdLib.Float32Array
    - stdLib.Int32Array
    - stdLib.Uint8Array
  */
  type TensorContainer = _TensorContainer | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | scala.Unit | java.lang.String | scala.Double | scala.Boolean | stdLib.Float32Array | stdLib.Int32Array | stdLib.Uint8Array
}
