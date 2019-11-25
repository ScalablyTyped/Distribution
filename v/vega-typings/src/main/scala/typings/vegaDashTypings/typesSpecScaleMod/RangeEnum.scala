package typings.vegaDashTypings.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.width
  - typings.vegaDashTypings.vegaDashTypingsStrings.height
  - typings.vegaDashTypings.vegaDashTypingsStrings.symbol
  - typings.vegaDashTypings.vegaDashTypingsStrings.category
  - typings.vegaDashTypings.vegaDashTypingsStrings.ordinal
  - typings.vegaDashTypings.vegaDashTypingsStrings.ramp
  - typings.vegaDashTypings.vegaDashTypingsStrings.diverging
  - typings.vegaDashTypings.vegaDashTypingsStrings.heatmap
*/
trait RangeEnum
  extends _RangeBand
     with _RangeScheme

object RangeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typings.vegaDashTypings.vegaDashTypingsStrings.category = this.cast("category")
  @scala.inline
  def diverging: typings.vegaDashTypings.vegaDashTypingsStrings.diverging = this.cast("diverging")
  @scala.inline
  def heatmap: typings.vegaDashTypings.vegaDashTypingsStrings.heatmap = this.cast("heatmap")
  @scala.inline
  def height: typings.vegaDashTypings.vegaDashTypingsStrings.height = this.cast("height")
  @scala.inline
  def ordinal: typings.vegaDashTypings.vegaDashTypingsStrings.ordinal = this.cast("ordinal")
  @scala.inline
  def ramp: typings.vegaDashTypings.vegaDashTypingsStrings.ramp = this.cast("ramp")
  @scala.inline
  def symbol: typings.vegaDashTypings.vegaDashTypingsStrings.symbol = this.cast("symbol")
  @scala.inline
  def width: typings.vegaDashTypings.vegaDashTypingsStrings.width = this.cast("width")
}

