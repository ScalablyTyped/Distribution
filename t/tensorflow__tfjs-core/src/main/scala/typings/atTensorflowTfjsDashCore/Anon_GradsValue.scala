package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GradsValue extends js.Object {
  var grads: NamedTensorMap
  var value: Scalar
}

object Anon_GradsValue {
  @scala.inline
  def apply(grads: NamedTensorMap, value: Scalar): Anon_GradsValue = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GradsValue]
  }
}

