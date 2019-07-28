package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imag extends js.Object {
  var imag: Tensor[Rank]
  var real: Tensor[Rank]
}

object Anon_Imag {
  @scala.inline
  def apply(imag: Tensor[Rank], real: Tensor[Rank]): Anon_Imag = {
    val __obj = js.Dynamic.literal(imag = imag, real = real)
  
    __obj.asInstanceOf[Anon_Imag]
  }
}

