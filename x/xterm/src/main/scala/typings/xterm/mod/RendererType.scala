package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xterm.xtermStrings.dom
  - typings.xterm.xtermStrings.canvas
*/
trait RendererType extends js.Object

object RendererType {
  @scala.inline
  def canvas: typings.xterm.xtermStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dom: typings.xterm.xtermStrings.dom = this.cast("dom")
}

