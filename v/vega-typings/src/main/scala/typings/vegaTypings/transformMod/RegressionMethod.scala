package typings.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.linear
  - typings.vegaTypings.vegaTypingsStrings.exp
  - typings.vegaTypings.vegaTypingsStrings.log
  - typings.vegaTypings.vegaTypingsStrings.quad
  - typings.vegaTypings.vegaTypingsStrings.poly
  - typings.vegaTypings.vegaTypingsStrings.pow
*/
trait RegressionMethod extends js.Object

object RegressionMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exp: typings.vegaTypings.vegaTypingsStrings.exp = this.cast("exp")
  @scala.inline
  def linear: typings.vegaTypings.vegaTypingsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typings.vegaTypings.vegaTypingsStrings.log = this.cast("log")
  @scala.inline
  def poly: typings.vegaTypings.vegaTypingsStrings.poly = this.cast("poly")
  @scala.inline
  def pow: typings.vegaTypings.vegaTypingsStrings.pow = this.cast("pow")
  @scala.inline
  def quad: typings.vegaTypings.vegaTypingsStrings.quad = this.cast("quad")
}

