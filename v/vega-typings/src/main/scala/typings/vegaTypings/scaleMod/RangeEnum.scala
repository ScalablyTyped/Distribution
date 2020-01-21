package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.width
  - typings.vegaTypings.vegaTypingsStrings.height
  - typings.vegaTypings.vegaTypingsStrings.symbol
  - typings.vegaTypings.vegaTypingsStrings.category
  - typings.vegaTypings.vegaTypingsStrings.ordinal
  - typings.vegaTypings.vegaTypingsStrings.ramp
  - typings.vegaTypings.vegaTypingsStrings.diverging
  - typings.vegaTypings.vegaTypingsStrings.heatmap
*/
trait RangeEnum
  extends _RangeBand
     with _RangeScheme

object RangeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typings.vegaTypings.vegaTypingsStrings.category = this.cast("category")
  @scala.inline
  def diverging: typings.vegaTypings.vegaTypingsStrings.diverging = this.cast("diverging")
  @scala.inline
  def heatmap: typings.vegaTypings.vegaTypingsStrings.heatmap = this.cast("heatmap")
  @scala.inline
  def height: typings.vegaTypings.vegaTypingsStrings.height = this.cast("height")
  @scala.inline
  def ordinal: typings.vegaTypings.vegaTypingsStrings.ordinal = this.cast("ordinal")
  @scala.inline
  def ramp: typings.vegaTypings.vegaTypingsStrings.ramp = this.cast("ramp")
  @scala.inline
  def symbol: typings.vegaTypings.vegaTypingsStrings.symbol = this.cast("symbol")
  @scala.inline
  def width: typings.vegaTypings.vegaTypingsStrings.width = this.cast("width")
}

