package typings
package vexflowLib.VexNs.FlowNs.StaveModifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
/* Rewritten from type alias, can be one of: 
  - vexflowLib.vexflowLibNumbers.`1`
  - vexflowLib.vexflowLibNumbers.`2`
  - vexflowLib.vexflowLibNumbers.`3`
  - vexflowLib.vexflowLibNumbers.`4`
  - vexflowLib.vexflowLibNumbers.`5`
  - vexflowLib.vexflowLibNumbers.`6`
*/
trait Position extends js.Object

object Position {
  @scala.inline
  def ABOVE: vexflowLib.vexflowLibNumbers.`3` = this.cast(3)
  @scala.inline
  def BEGIN: vexflowLib.vexflowLibNumbers.`5` = this.cast(5)
  @scala.inline
  def BELOW: vexflowLib.vexflowLibNumbers.`4` = this.cast(4)
  @scala.inline
  def END: vexflowLib.vexflowLibNumbers.`6` = this.cast(6)
  @scala.inline
  def LEFT: vexflowLib.vexflowLibNumbers.`1` = this.cast(1)
  @scala.inline
  def RIGHT: vexflowLib.vexflowLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

