package typings.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.value
  - typings.vegaTypings.vegaTypingsStrings.median
  - typings.vegaTypings.vegaTypingsStrings.max
  - typings.vegaTypings.vegaTypingsStrings.min
  - typings.vegaTypings.vegaTypingsStrings.mean
*/
trait ImputeMethod extends js.Object

object ImputeMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def max: typings.vegaTypings.vegaTypingsStrings.max = this.cast("max")
  @scala.inline
  def mean: typings.vegaTypings.vegaTypingsStrings.mean = this.cast("mean")
  @scala.inline
  def median: typings.vegaTypings.vegaTypingsStrings.median = this.cast("median")
  @scala.inline
  def min: typings.vegaTypings.vegaTypingsStrings.min = this.cast("min")
  @scala.inline
  def value: typings.vegaTypings.vegaTypingsStrings.value = this.cast("value")
}

