package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.quantile
  - typings.vegaTypings.vegaTypingsStrings.quantize
  - typings.vegaTypings.vegaTypingsStrings.threshold
  - typings.vegaTypings.vegaTypingsStrings.`bin-ordinal`
*/
trait DiscretizingScaleType extends js.Object

object DiscretizingScaleType {
  @scala.inline
  def `bin-ordinal`: typings.vegaTypings.vegaTypingsStrings.`bin-ordinal` = this.cast("bin-ordinal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def quantile: typings.vegaTypings.vegaTypingsStrings.quantile = this.cast("quantile")
  @scala.inline
  def quantize: typings.vegaTypings.vegaTypingsStrings.quantize = this.cast("quantize")
  @scala.inline
  def threshold: typings.vegaTypings.vegaTypingsStrings.threshold = this.cast("threshold")
}

