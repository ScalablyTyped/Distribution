package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "Variable")
@js.native
class Variable_[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */] protected () extends Variable[R] {
  def this(initialValue: Tensor[R], trainable: Boolean, name: String, tensorId: Double) = this()
}

