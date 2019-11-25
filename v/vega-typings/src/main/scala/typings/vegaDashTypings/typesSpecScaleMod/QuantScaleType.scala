package typings.vegaDashTypings.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.linear
  - typings.vegaDashTypings.vegaDashTypingsStrings.pow
  - typings.vegaDashTypings.vegaDashTypingsStrings.sqrt
  - typings.vegaDashTypings.vegaDashTypingsStrings.log
  - typings.vegaDashTypings.vegaDashTypingsStrings.symlog
  - typings.vegaDashTypings.vegaDashTypingsStrings.time
  - typings.vegaDashTypings.vegaDashTypingsStrings.utc
  - typings.vegaDashTypings.vegaDashTypingsStrings.sequential
*/
trait QuantScaleType extends js.Object

object QuantScaleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linear: typings.vegaDashTypings.vegaDashTypingsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typings.vegaDashTypings.vegaDashTypingsStrings.log = this.cast("log")
  @scala.inline
  def pow: typings.vegaDashTypings.vegaDashTypingsStrings.pow = this.cast("pow")
  @scala.inline
  def sequential: typings.vegaDashTypings.vegaDashTypingsStrings.sequential = this.cast("sequential")
  @scala.inline
  def sqrt: typings.vegaDashTypings.vegaDashTypingsStrings.sqrt = this.cast("sqrt")
  @scala.inline
  def symlog: typings.vegaDashTypings.vegaDashTypingsStrings.symlog = this.cast("symlog")
  @scala.inline
  def time: typings.vegaDashTypings.vegaDashTypingsStrings.time = this.cast("time")
  @scala.inline
  def utc: typings.vegaDashTypings.vegaDashTypingsStrings.utc = this.cast("utc")
}

