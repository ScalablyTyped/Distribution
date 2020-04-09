package typings.vegaTypings.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.miter
  - typings.vegaTypings.vegaTypingsStrings.round
  - typings.vegaTypings.vegaTypingsStrings.bevel
*/
trait StrokeJoin extends js.Object

object StrokeJoin {
  @scala.inline
  def bevel: typings.vegaTypings.vegaTypingsStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typings.vegaTypings.vegaTypingsStrings.miter = this.cast("miter")
  @scala.inline
  def round: typings.vegaTypings.vegaTypingsStrings.round = this.cast("round")
}

