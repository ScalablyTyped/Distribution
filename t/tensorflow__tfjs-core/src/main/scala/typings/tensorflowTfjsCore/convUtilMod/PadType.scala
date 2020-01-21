package typings.tensorflowTfjsCore.convUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.SAME
  - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.VALID
  - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NUMBER
*/
trait PadType extends js.Object

object PadType {
  @scala.inline
  def NUMBER: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NUMBER = this.cast("NUMBER")
  @scala.inline
  def SAME: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.SAME = this.cast("SAME")
  @scala.inline
  def VALID: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.VALID = this.cast("VALID")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

