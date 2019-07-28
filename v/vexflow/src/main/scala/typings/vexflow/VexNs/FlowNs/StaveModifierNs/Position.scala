package typings.vexflow.VexNs.FlowNs.StaveModifierNs

import typings.vexflow.vexflowNumbers.`1`
import typings.vexflow.vexflowNumbers.`2`
import typings.vexflow.vexflowNumbers.`3`
import typings.vexflow.vexflowNumbers.`4`
import typings.vexflow.vexflowNumbers.`5`
import typings.vexflow.vexflowNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
/* Rewritten from type alias, can be one of: 
  - typings.vexflow.vexflowNumbers.`1`
  - typings.vexflow.vexflowNumbers.`2`
  - typings.vexflow.vexflowNumbers.`3`
  - typings.vexflow.vexflowNumbers.`4`
  - typings.vexflow.vexflowNumbers.`5`
  - typings.vexflow.vexflowNumbers.`6`
*/
trait Position extends js.Object

object Position {
  @scala.inline
  def ABOVE: `3` = this.cast(3)
  @scala.inline
  def BEGIN: `5` = this.cast(5)
  @scala.inline
  def BELOW: `4` = this.cast(4)
  @scala.inline
  def END: `6` = this.cast(6)
  @scala.inline
  def LEFT: `1` = this.cast(1)
  @scala.inline
  def RIGHT: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

