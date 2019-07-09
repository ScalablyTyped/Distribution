package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GradsValue extends js.Object {
  var grads: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap
  var value: atTensorflowTfjsDashCoreLib.distTensorMod.Scalar
}

object Anon_GradsValue {
  @scala.inline
  def apply(
    grads: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    value: atTensorflowTfjsDashCoreLib.distTensorMod.Scalar
  ): Anon_GradsValue = {
    val __obj = js.Dynamic.literal(grads = grads, value = value)
  
    __obj.asInstanceOf[Anon_GradsValue]
  }
}

