package typings.vegaTypings.rendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.canvas
  - typings.vegaTypings.vegaTypingsStrings.svg
  - typings.vegaTypings.vegaTypingsStrings.none
*/
trait Renderers extends js.Object

object Renderers {
  @scala.inline
  def canvas: typings.vegaTypings.vegaTypingsStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.vegaTypings.vegaTypingsStrings.none = this.cast("none")
  @scala.inline
  def svg: typings.vegaTypings.vegaTypingsStrings.svg = this.cast("svg")
}

