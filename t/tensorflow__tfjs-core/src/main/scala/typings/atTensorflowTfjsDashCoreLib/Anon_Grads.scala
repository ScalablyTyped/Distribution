package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grads[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */] extends js.Object {
  var grads: js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]
  var value: T
}

object Anon_Grads {
  @scala.inline
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    grads: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    value: T
  ): Anon_Grads[T] = {
    val __obj = js.Dynamic.literal(grads = grads, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Grads[T]]
  }
}

