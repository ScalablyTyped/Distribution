package typings.vegaTypings.axisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.number
  - typings.vegaTypings.vegaTypingsStrings.time
  - typings.vegaTypings.vegaTypingsStrings.utc
*/
trait FormatType extends js.Object

object FormatType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typings.vegaTypings.vegaTypingsStrings.number = this.cast("number")
  @scala.inline
  def time: typings.vegaTypings.vegaTypingsStrings.time = this.cast("time")
  @scala.inline
  def utc: typings.vegaTypings.vegaTypingsStrings.utc = this.cast("utc")
}

