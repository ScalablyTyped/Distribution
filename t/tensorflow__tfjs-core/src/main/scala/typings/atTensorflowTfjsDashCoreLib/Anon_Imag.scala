package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imag extends js.Object {
  var imag: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  var real: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
}

object Anon_Imag {
  @scala.inline
  def apply(
    imag: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    real: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): Anon_Imag = {
    val __obj = js.Dynamic.literal(imag = imag, real = real)
  
    __obj.asInstanceOf[Anon_Imag]
  }
}

