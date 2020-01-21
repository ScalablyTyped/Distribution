package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.ordinal
  - typings.vegaTypings.vegaTypingsStrings.band
  - typings.vegaTypings.vegaTypingsStrings.point
*/
trait DiscreteScaleType extends js.Object

object DiscreteScaleType {
  @scala.inline
  def band: typings.vegaTypings.vegaTypingsStrings.band = this.cast("band")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ordinal: typings.vegaTypings.vegaTypingsStrings.ordinal = this.cast("ordinal")
  @scala.inline
  def point: typings.vegaTypings.vegaTypingsStrings.point = this.cast("point")
}

