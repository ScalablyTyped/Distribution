package typings.vegaDashTypings.typesSpecDataMod

import typings.vegaDashTypings.typesRuntimeMod.TypeInference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.boolean
  - typings.vegaDashTypings.vegaDashTypingsStrings.number
  - typings.vegaDashTypings.vegaDashTypingsStrings.date
  - typings.vegaDashTypings.vegaDashTypingsStrings.string
*/
trait DataType extends TypeInference

object DataType {
  @scala.inline
  def boolean: typings.vegaDashTypings.vegaDashTypingsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.vegaDashTypings.vegaDashTypingsStrings.date = this.cast("date")
  @scala.inline
  def number: typings.vegaDashTypings.vegaDashTypingsStrings.number = this.cast("number")
  @scala.inline
  def string: typings.vegaDashTypings.vegaDashTypingsStrings.string = this.cast("string")
}

