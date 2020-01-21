package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.linear
  - typings.vegaTypings.vegaTypingsStrings.pow
  - typings.vegaTypings.vegaTypingsStrings.sqrt
  - typings.vegaTypings.vegaTypingsStrings.log
  - typings.vegaTypings.vegaTypingsStrings.symlog
  - typings.vegaTypings.vegaTypingsStrings.time
  - typings.vegaTypings.vegaTypingsStrings.utc
  - typings.vegaTypings.vegaTypingsStrings.sequential
*/
trait QuantScaleType extends js.Object

object QuantScaleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linear: typings.vegaTypings.vegaTypingsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typings.vegaTypings.vegaTypingsStrings.log = this.cast("log")
  @scala.inline
  def pow: typings.vegaTypings.vegaTypingsStrings.pow = this.cast("pow")
  @scala.inline
  def sequential: typings.vegaTypings.vegaTypingsStrings.sequential = this.cast("sequential")
  @scala.inline
  def sqrt: typings.vegaTypings.vegaTypingsStrings.sqrt = this.cast("sqrt")
  @scala.inline
  def symlog: typings.vegaTypings.vegaTypingsStrings.symlog = this.cast("symlog")
  @scala.inline
  def time: typings.vegaTypings.vegaTypingsStrings.time = this.cast("time")
  @scala.inline
  def utc: typings.vegaTypings.vegaTypingsStrings.utc = this.cast("utc")
}

