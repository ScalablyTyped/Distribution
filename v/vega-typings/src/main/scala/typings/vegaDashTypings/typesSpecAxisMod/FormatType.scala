package typings.vegaDashTypings.typesSpecAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.number
  - typings.vegaDashTypings.vegaDashTypingsStrings.time
  - typings.vegaDashTypings.vegaDashTypingsStrings.utc
*/
trait FormatType extends js.Object

object FormatType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typings.vegaDashTypings.vegaDashTypingsStrings.number = this.cast("number")
  @scala.inline
  def time: typings.vegaDashTypings.vegaDashTypingsStrings.time = this.cast("time")
  @scala.inline
  def utc: typings.vegaDashTypings.vegaDashTypingsStrings.utc = this.cast("utc")
}

