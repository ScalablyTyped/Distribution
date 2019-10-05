package typings.vexflow.Vex.Flow.Renderer

import typings.vexflow.vexflowNumbers.`0`
import typings.vexflow.vexflowNumbers.`1`
import typings.vexflow.vexflowNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vexflow.vexflowNumbers.`1`
  - typings.vexflow.vexflowNumbers.`0`
  - typings.vexflow.vexflowNumbers.`2`
*/
trait Backends extends js.Object

object Backends {
  @scala.inline
  def CANVAS: `1` = this.cast(1)
  @scala.inline
  def RAPHAEL: `0` = this.cast(0)
  @scala.inline
  def SVG: `1` = this.cast(1)
  @scala.inline
  def VML: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

