package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GradsValueArray[O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */] extends js.Object {
  var grads: js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
  var value: O
}

object Anon_GradsValueArray {
  @scala.inline
  def apply[O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    grads: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    value: O
  ): Anon_GradsValueArray[O] = {
    val __obj = js.Dynamic.literal(grads = grads, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GradsValueArray[O]]
  }
}

