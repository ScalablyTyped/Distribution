package typings.vegaTypings.dataMod

import typings.vegaTypings.runtimeMod.TypeInference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.boolean
  - typings.vegaTypings.vegaTypingsStrings.number
  - typings.vegaTypings.vegaTypingsStrings.date
  - typings.vegaTypings.vegaTypingsStrings.string
*/
trait DataType extends TypeInference

object DataType {
  @scala.inline
  def boolean: typings.vegaTypings.vegaTypingsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.vegaTypings.vegaTypingsStrings.date = this.cast("date")
  @scala.inline
  def number: typings.vegaTypings.vegaTypingsStrings.number = this.cast("number")
  @scala.inline
  def string: typings.vegaTypings.vegaTypingsStrings.string = this.cast("string")
}

