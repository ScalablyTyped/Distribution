package typings.vegaDashTypings.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.linear
  - typings.vegaDashTypings.vegaDashTypingsStrings.exp
  - typings.vegaDashTypings.vegaDashTypingsStrings.log
  - typings.vegaDashTypings.vegaDashTypingsStrings.quad
  - typings.vegaDashTypings.vegaDashTypingsStrings.poly
  - typings.vegaDashTypings.vegaDashTypingsStrings.pow
*/
trait RegressionMethod extends js.Object

object RegressionMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exp: typings.vegaDashTypings.vegaDashTypingsStrings.exp = this.cast("exp")
  @scala.inline
  def linear: typings.vegaDashTypings.vegaDashTypingsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typings.vegaDashTypings.vegaDashTypingsStrings.log = this.cast("log")
  @scala.inline
  def poly: typings.vegaDashTypings.vegaDashTypingsStrings.poly = this.cast("poly")
  @scala.inline
  def pow: typings.vegaDashTypings.vegaDashTypingsStrings.pow = this.cast("pow")
  @scala.inline
  def quad: typings.vegaDashTypings.vegaDashTypingsStrings.quad = this.cast("quad")
}

