package typings
package vexflowLib.VexNs.FlowNs.RendererNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - vexflowLib.vexflowLibNumbers.`1`
  - vexflowLib.vexflowLibNumbers.`0`
  - vexflowLib.vexflowLibNumbers.`2`
*/
trait Backends extends js.Object

object Backends {
  @scala.inline
  def CANVAS: vexflowLib.vexflowLibNumbers.`1` = this.cast(1)
  @scala.inline
  def RAPHAEL: vexflowLib.vexflowLibNumbers.`0` = this.cast(0)
  @scala.inline
  def SVG: vexflowLib.vexflowLibNumbers.`1` = this.cast(1)
  @scala.inline
  def VML: vexflowLib.vexflowLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

