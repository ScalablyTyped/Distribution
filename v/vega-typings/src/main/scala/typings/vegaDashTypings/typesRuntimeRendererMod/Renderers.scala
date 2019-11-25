package typings.vegaDashTypings.typesRuntimeRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.canvas
  - typings.vegaDashTypings.vegaDashTypingsStrings.svg
  - typings.vegaDashTypings.vegaDashTypingsStrings.none
*/
trait Renderers extends js.Object

object Renderers {
  @scala.inline
  def canvas: typings.vegaDashTypings.vegaDashTypingsStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.vegaDashTypings.vegaDashTypingsStrings.none = this.cast("none")
  @scala.inline
  def svg: typings.vegaDashTypings.vegaDashTypingsStrings.svg = this.cast("svg")
}

