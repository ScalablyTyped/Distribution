package typings.vegaDashTypings.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.quantile
  - typings.vegaDashTypings.vegaDashTypingsStrings.quantize
  - typings.vegaDashTypings.vegaDashTypingsStrings.threshold
  - typings.vegaDashTypings.vegaDashTypingsStrings.`bin-ordinal`
*/
trait DiscretizingScaleType extends js.Object

object DiscretizingScaleType {
  @scala.inline
  def `bin-ordinal`: typings.vegaDashTypings.vegaDashTypingsStrings.`bin-ordinal` = this.cast("bin-ordinal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def quantile: typings.vegaDashTypings.vegaDashTypingsStrings.quantile = this.cast("quantile")
  @scala.inline
  def quantize: typings.vegaDashTypings.vegaDashTypingsStrings.quantize = this.cast("quantize")
  @scala.inline
  def threshold: typings.vegaDashTypings.vegaDashTypingsStrings.threshold = this.cast("threshold")
}

