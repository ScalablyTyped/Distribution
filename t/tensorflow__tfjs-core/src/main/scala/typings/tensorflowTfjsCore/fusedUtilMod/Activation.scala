package typings.tensorflowTfjsCore.fusedUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear
  - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu
  - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu
  - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu
  - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6
*/
trait Activation extends js.Object

object Activation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elu: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu = this.cast("elu")
  @scala.inline
  def linear: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear = this.cast("linear")
  @scala.inline
  def prelu: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu = this.cast("prelu")
  @scala.inline
  def relu: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu = this.cast("relu")
  @scala.inline
  def relu6: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6 = this.cast("relu6")
}

